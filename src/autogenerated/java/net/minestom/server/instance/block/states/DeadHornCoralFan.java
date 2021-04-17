package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class DeadHornCoralFan {
  public static final BlockState DEAD_HORN_CORAL_FAN_0 = new BlockState(NamespaceID.from("minecraft:dead_horn_coral_fan:0"), (short) 9552, Block.DEAD_HORN_CORAL_FAN, "waterlogged=true");

  public static final BlockState DEAD_HORN_CORAL_FAN_1 = new BlockState(NamespaceID.from("minecraft:dead_horn_coral_fan:1"), (short) 9553, Block.DEAD_HORN_CORAL_FAN, "waterlogged=false");

  public static void initStates() {
    Block.DEAD_HORN_CORAL_FAN.addBlockState(DEAD_HORN_CORAL_FAN_0);
    Block.DEAD_HORN_CORAL_FAN.addBlockState(DEAD_HORN_CORAL_FAN_1);
  }
}
