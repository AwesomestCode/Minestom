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
public final class PurpleShulkerBox {
  public static final BlockState PURPLE_SHULKER_BOX_0 = new BlockState(NamespaceID.from("minecraft:purple_shulker_box:0"), (short) 9342, Block.PURPLE_SHULKER_BOX, "facing=north");

  public static final BlockState PURPLE_SHULKER_BOX_1 = new BlockState(NamespaceID.from("minecraft:purple_shulker_box:1"), (short) 9343, Block.PURPLE_SHULKER_BOX, "facing=east");

  public static final BlockState PURPLE_SHULKER_BOX_2 = new BlockState(NamespaceID.from("minecraft:purple_shulker_box:2"), (short) 9344, Block.PURPLE_SHULKER_BOX, "facing=south");

  public static final BlockState PURPLE_SHULKER_BOX_3 = new BlockState(NamespaceID.from("minecraft:purple_shulker_box:3"), (short) 9345, Block.PURPLE_SHULKER_BOX, "facing=west");

  public static final BlockState PURPLE_SHULKER_BOX_4 = new BlockState(NamespaceID.from("minecraft:purple_shulker_box:4"), (short) 9346, Block.PURPLE_SHULKER_BOX, "facing=up");

  public static final BlockState PURPLE_SHULKER_BOX_5 = new BlockState(NamespaceID.from("minecraft:purple_shulker_box:5"), (short) 9347, Block.PURPLE_SHULKER_BOX, "facing=down");

  public static void initStates() {
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_0);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_1);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_2);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_3);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_4);
    Block.PURPLE_SHULKER_BOX.addBlockState(PURPLE_SHULKER_BOX_5);
  }
}
