package net.minestom.code_generation.attribute;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.squareup.javapoet.*;
import net.minestom.code_generation.MinestomCodeGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class AttributeGenerator extends MinestomCodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(AttributeGenerator.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final File DEFAULT_INPUT_FILE = new File(DEFAULT_SOURCE_FOLDER_ROOT + "/json", "attributes.json");
    private final File attributesFile;
    private final File outputFolder;

    public AttributeGenerator() {
        this(null, null);
    }

    public AttributeGenerator(@Nullable File attributesFile) {
        this(attributesFile, null);
    }

    public AttributeGenerator(@Nullable File attributesFile, @Nullable File outputFolder) {
        this.attributesFile = Objects.requireNonNullElse(attributesFile, DEFAULT_INPUT_FILE);
        this.outputFolder = Objects.requireNonNullElse(outputFolder, DEFAULT_OUTPUT_FOLDER);
    }

    @Override
    public void generate() {
        if (!attributesFile.exists()) {
            LOGGER.error("Failed to find attributes.json.");
            LOGGER.error("Stopped code generation for attributes.");
            return;
        }
        if (!outputFolder.exists() && !outputFolder.mkdirs()) {
            LOGGER.error("Output folder for code generation does not exist and could not be created.");
            return;
        }
        // Important classes we use alot
        ClassName namespaceIDClassName = ClassName.get("net.minestom.server.utils", "NamespaceID");

        JsonArray attributes;
        try {
            attributes = GSON.fromJson(new JsonReader(new FileReader(attributesFile)), JsonArray.class);
        } catch (FileNotFoundException e) {
            LOGGER.error("Failed to find attributes.json.");
            LOGGER.error("Stopped code generation for attributes.");
            return;
        }
        List<JavaFile> filesToWrite = new ArrayList<>();

        ClassName attributeClassName = ClassName.get("net.minestom.server.attribute", "Attribute");

        // Attribute
        TypeSpec.Builder attributeClass = TypeSpec.classBuilder(attributeClassName)
                .addSuperinterface(ClassName.get("net.kyori.adventure.key", "Keyed"))
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED");
        attributeClass.addField(
                FieldSpec.builder(namespaceIDClassName, "id")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).addAnnotation(NotNull.class).build()
        );
        attributeClass.addField(
                FieldSpec.builder(TypeName.DOUBLE, "defaultValue")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).build()
        );
        attributeClass.addField(
                FieldSpec.builder(TypeName.BOOLEAN, "clientSyncable")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).build()
        );
        attributeClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addParameter(ParameterSpec.builder(TypeName.BOOLEAN, "clientSyncable").build())
                        .addParameter(ParameterSpec.builder(TypeName.DOUBLE, "defaultValue").build())
                        .addStatement("this.id = id")
                        .addStatement("this.clientSyncable = clientSyncable")
                        .addStatement("this.defaultValue = defaultValue")
                        .addModifiers(Modifier.PROTECTED)
                        .build()
        );
        // Override key method (adventure)
        attributeClass.addMethod(
                MethodSpec.methodBuilder("key")
                        .returns(ClassName.get("net.kyori.adventure.key", "Key"))
                        .addAnnotation(Override.class)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getId method
        attributeClass.addMethod(
                MethodSpec.methodBuilder("getId")
                        .returns(namespaceIDClassName)
                        .addAnnotation(NotNull.class)
                        .addStatement("return this.id")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getDefaultValue
        attributeClass.addMethod(
                MethodSpec.methodBuilder("getDefaultValue")
                        .returns(TypeName.DOUBLE)
                        .addStatement("return this.defaultValue")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // isClientSyncable
        attributeClass.addMethod(
                MethodSpec.methodBuilder("isClientSyncable")
                        .returns(TypeName.BOOLEAN)
                        .addStatement("return this.clientSyncable")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // isShared
        attributeClass.addMethod(
                MethodSpec.methodBuilder("isShared")
                        .addAnnotation(Deprecated.class)
                        .returns(TypeName.BOOLEAN)
                        .addStatement("return this.clientSyncable")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // values method
        attributeClass.addMethod(
                MethodSpec.methodBuilder("values")
                        .addAnnotation(NotNull.class)
                        .returns(ParameterizedTypeName.get(ClassName.get(List.class), attributeClassName))
                        .addStatement("return $T.getAttributes()", ClassName.get("net.minestom.server.registry", "Registries"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .build()
        );
        // Creating ClampedAttribute
        ClassName clampedAttributeClassName = ClassName.get("net.minestom.server.attribute", "ClampedAttribute");

        TypeSpec.Builder clampedAttributeClass = TypeSpec.classBuilder(clampedAttributeClassName)
                .superclass(attributeClassName)
                .addModifiers(Modifier.PUBLIC).addJavadoc("AUTOGENERATED");
        clampedAttributeClass.addField(
                FieldSpec.builder(TypeName.DOUBLE, "minValue")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).build()
        );
        clampedAttributeClass.addField(
                FieldSpec.builder(TypeName.DOUBLE, "maxValue")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL).build()
        );
        clampedAttributeClass.addMethod(
                MethodSpec.constructorBuilder()
                        .addParameter(ParameterSpec.builder(namespaceIDClassName, "id").addAnnotation(NotNull.class).build())
                        .addParameter(ParameterSpec.builder(TypeName.BOOLEAN, "clientSyncable").build())
                        .addParameter(ParameterSpec.builder(TypeName.DOUBLE, "defaultValue").build())
                        .addParameter(ParameterSpec.builder(TypeName.DOUBLE, "minValue").build())
                        .addParameter(ParameterSpec.builder(TypeName.DOUBLE, "maxValue").build())
                        .addStatement("super(id, clientSyncable, defaultValue)")
                        .addStatement("this.minValue = minValue")
                        .addStatement("this.maxValue = maxValue")
                        .addModifiers(Modifier.PROTECTED)
                        .build()
        );
        // getMinValue
        clampedAttributeClass.addMethod(
                MethodSpec.methodBuilder("getMinValue")
                        .returns(TypeName.DOUBLE)
                        .addStatement("return this.minValue")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );
        // getMaxValue
        clampedAttributeClass.addMethod(
                MethodSpec.methodBuilder("getMaxValue")
                        .returns(TypeName.DOUBLE)
                        .addStatement("return this.maxValue")
                        .addModifiers(Modifier.PUBLIC)
                        .build()
        );

        CodeBlock.Builder staticBlock = CodeBlock.builder();
        // Use data
        for (JsonElement a : attributes) {
            JsonObject attribute = a.getAsJsonObject();
            String attributeName = attribute.get("name").getAsString();

            JsonObject range = attribute.getAsJsonObject("range");
            if (range == null) {
                // Normal attribute
                attributeClass.addField(
                        FieldSpec.builder(
                                attributeClassName,
                                attributeName
                        ).initializer(
                                "new $T($T.from($S), $L, $L)",
                                attributeClassName,
                                namespaceIDClassName,
                                attribute.get("id").getAsString(),
                                attribute.get("clientSync").getAsBoolean(),
                                attribute.get("defaultValue").getAsDouble()
                        ).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).build()
                );
            } else {
                // ClampedAttribute
                attributeClass.addField(
                        FieldSpec.builder(
                                attributeClassName,
                                attributeName
                        ).initializer(
                                "new $T($T.from($S), $L, $L, $L, $L)",
                                clampedAttributeClassName,
                                namespaceIDClassName,
                                attribute.get("id").getAsString(),
                                attribute.get("clientSync").getAsBoolean(),
                                attribute.get("defaultValue").getAsDouble(),
                                range.get("minValue").getAsDouble(),
                                range.get("maxValue").getAsDouble()
                        ).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).build()
                );
            }
            // Add to static init.
            staticBlock.addStatement("$T.registerAttribute($N)", ClassName.get("net.minestom.server.registry", "Registries"), attributeName);
        }
        attributeClass.addStaticBlock(staticBlock.build());

        filesToWrite.add(JavaFile.builder("net.minestom.server.attribute", attributeClass.build()).build());
        filesToWrite.add(JavaFile.builder("net.minestom.server.attribute", clampedAttributeClass.build()).build());

        // Write files to outputFolder
        writeFiles(
                filesToWrite,
                outputFolder
        );
    }
}