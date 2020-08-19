package net.minestom.server.data.type;

import net.minestom.server.data.DataType;
import net.minestom.server.utils.binary.BinaryReader;
import net.minestom.server.utils.binary.BinaryWriter;

import java.util.UUID;

public class UuidType extends DataType<UUID> {
    @Override
    public void encode(BinaryWriter binaryWriter, UUID value) {
        binaryWriter.writeUuid(value);
    }

    @Override
    public UUID decode(BinaryReader binaryReader) {
        return binaryReader.readUuid();
    }
}
