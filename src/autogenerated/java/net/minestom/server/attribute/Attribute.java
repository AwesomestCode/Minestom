package net.minestom.server.attribute;

import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

/**
 * AUTOGENERATED by AttributeGenerator
 */
public class Attribute implements Keyed {
    public static final Attribute MAX_HEALTH = new ClampedAttribute(NamespaceID.from("minecraft:generic.max_health"), true, 20.0, 1.0, 1024.0);

    public static final Attribute FOLLOW_RANGE = new ClampedAttribute(NamespaceID.from("minecraft:generic.follow_range"), false, 32.0, 0.0, 2048.0);

    public static final Attribute KNOCKBACK_RESISTANCE = new ClampedAttribute(NamespaceID.from("minecraft:generic.knockback_resistance"), false, 0.0, 0.0, 1.0);

    public static final Attribute MOVEMENT_SPEED = new ClampedAttribute(NamespaceID.from("minecraft:generic.movement_speed"), true, 0.699999988079071, 0.0, 1024.0);

    public static final Attribute FLYING_SPEED = new ClampedAttribute(NamespaceID.from("minecraft:generic.flying_speed"), true, 0.4000000059604645, 0.0, 1024.0);

    public static final Attribute ATTACK_DAMAGE = new ClampedAttribute(NamespaceID.from("minecraft:generic.attack_damage"), false, 2.0, 0.0, 2048.0);

    public static final Attribute ATTACK_KNOCKBACK = new ClampedAttribute(NamespaceID.from("minecraft:generic.attack_knockback"), false, 0.0, 0.0, 5.0);

    public static final Attribute ATTACK_SPEED = new ClampedAttribute(NamespaceID.from("minecraft:generic.attack_speed"), true, 4.0, 0.0, 1024.0);

    public static final Attribute ARMOR = new ClampedAttribute(NamespaceID.from("minecraft:generic.armor"), true, 0.0, 0.0, 30.0);

    public static final Attribute ARMOR_TOUGHNESS = new ClampedAttribute(NamespaceID.from("minecraft:generic.armor_toughness"), true, 0.0, 0.0, 20.0);

    public static final Attribute LUCK = new ClampedAttribute(NamespaceID.from("minecraft:generic.luck"), true, 0.0, -1024.0, 1024.0);

    public static final Attribute SPAWN_REINFORCEMENTS_CHANCE = new ClampedAttribute(NamespaceID.from("minecraft:zombie.spawn_reinforcements"), false, 0.0, 0.0, 1.0);

    public static final Attribute JUMP_STRENGTH = new ClampedAttribute(NamespaceID.from("minecraft:horse.jump_strength"), true, 0.7, 0.0, 2.0);

    static {
        Registry.ATTRIBUTE_REGISTRY.register(MAX_HEALTH);
        Registry.ATTRIBUTE_REGISTRY.register(FOLLOW_RANGE);
        Registry.ATTRIBUTE_REGISTRY.register(KNOCKBACK_RESISTANCE);
        Registry.ATTRIBUTE_REGISTRY.register(MOVEMENT_SPEED);
        Registry.ATTRIBUTE_REGISTRY.register(FLYING_SPEED);
        Registry.ATTRIBUTE_REGISTRY.register(ATTACK_DAMAGE);
        Registry.ATTRIBUTE_REGISTRY.register(ATTACK_KNOCKBACK);
        Registry.ATTRIBUTE_REGISTRY.register(ATTACK_SPEED);
        Registry.ATTRIBUTE_REGISTRY.register(ARMOR);
        Registry.ATTRIBUTE_REGISTRY.register(ARMOR_TOUGHNESS);
        Registry.ATTRIBUTE_REGISTRY.register(LUCK);
        Registry.ATTRIBUTE_REGISTRY.register(SPAWN_REINFORCEMENTS_CHANCE);
        Registry.ATTRIBUTE_REGISTRY.register(JUMP_STRENGTH);
    }

    @NotNull
    private final NamespaceID id;

    private final double defaultValue;

    private final boolean clientSyncable;

    protected Attribute(@NotNull NamespaceID id, boolean clientSyncable, double defaultValue) {
        this.id = id;
        this.clientSyncable = clientSyncable;
        this.defaultValue = defaultValue;
    }

    @Override
    @NotNull
    public Key key() {
        return this.id;
    }

    @NotNull
    public NamespaceID getId() {
        return this.id;
    }

    public double getDefaultValue() {
        return this.defaultValue;
    }

    public boolean isClientSyncable() {
        return this.clientSyncable;
    }

    @Deprecated
    public boolean isShared() {
        return this.clientSyncable;
    }

    @NotNull
    public static List<Attribute> values() {
        return Registry.ATTRIBUTE_REGISTRY.values();
    }

    @NotNull
    @Override
    public String toString() {
        return "[" + this.id + "]";
    }
}
