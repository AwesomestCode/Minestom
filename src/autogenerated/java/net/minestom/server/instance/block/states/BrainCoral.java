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
public final class BrainCoral {
  public static final BlockState BRAIN_CORAL_0 = new BlockState(NamespaceID.from("minecraft:brain_coral:0"), (short) 9536, Block.BRAIN_CORAL, "waterlogged=true");

  public static final BlockState BRAIN_CORAL_1 = new BlockState(NamespaceID.from("minecraft:brain_coral:1"), (short) 9537, Block.BRAIN_CORAL, "waterlogged=false");

  public static void initStates() {
    Block.BRAIN_CORAL.addBlockState(BRAIN_CORAL_0);
    Block.BRAIN_CORAL.addBlockState(BRAIN_CORAL_1);
  }
}
