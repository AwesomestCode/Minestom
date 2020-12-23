package net.minestom.server.item.firework;

import java.util.HashMap;
import java.util.Map;

/**
 * An enumeration that representing all available firework types.
 */
public enum FireworkEffectType {

    SMALL_BALL((byte) 0),
    LARGE_BAR((byte) 1),
    STAR_SHAPED((byte) 2),
    CREEPER_SHAPED((byte) 3),
    BURST((byte) 4),
    ;

    private static final Map<Byte, FireworkEffectType> BY_ID = new HashMap<>();

    static {
        for (FireworkEffectType value : values()) {
            BY_ID.put(value.type, value);
        }
    }

    private final byte type;

    FireworkEffectType(byte type) {
        this.type = type;
    }

    public static FireworkEffectType byId(byte id) {
        return BY_ID.get(id);
    }

    public byte getType() {
        return type;
    }

}

