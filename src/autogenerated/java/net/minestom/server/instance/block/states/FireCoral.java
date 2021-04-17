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
public final class FireCoral {
  public static final BlockState FIRE_CORAL_0 = new BlockState(NamespaceID.from("minecraft:fire_coral:0"), (short) 9540, Block.FIRE_CORAL, "waterlogged=true");

  public static final BlockState FIRE_CORAL_1 = new BlockState(NamespaceID.from("minecraft:fire_coral:1"), (short) 9541, Block.FIRE_CORAL, "waterlogged=false");

  public static void initStates() {
    Block.FIRE_CORAL.addBlockState(FIRE_CORAL_0);
    Block.FIRE_CORAL.addBlockState(FIRE_CORAL_1);
  }
}
