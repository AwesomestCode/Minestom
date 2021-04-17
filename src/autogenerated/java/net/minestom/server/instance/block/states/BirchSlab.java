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
public final class BirchSlab {
  public static final BlockState BIRCH_SLAB_0 = new BlockState(NamespaceID.from("minecraft:birch_slab:0"), (short) 8316, Block.BIRCH_SLAB, "type=top","waterlogged=true");

  public static final BlockState BIRCH_SLAB_1 = new BlockState(NamespaceID.from("minecraft:birch_slab:1"), (short) 8317, Block.BIRCH_SLAB, "type=top","waterlogged=false");

  public static final BlockState BIRCH_SLAB_2 = new BlockState(NamespaceID.from("minecraft:birch_slab:2"), (short) 8318, Block.BIRCH_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState BIRCH_SLAB_3 = new BlockState(NamespaceID.from("minecraft:birch_slab:3"), (short) 8319, Block.BIRCH_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState BIRCH_SLAB_4 = new BlockState(NamespaceID.from("minecraft:birch_slab:4"), (short) 8320, Block.BIRCH_SLAB, "type=double","waterlogged=true");

  public static final BlockState BIRCH_SLAB_5 = new BlockState(NamespaceID.from("minecraft:birch_slab:5"), (short) 8321, Block.BIRCH_SLAB, "type=double","waterlogged=false");

  public static void initStates() {
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_0);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_1);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_2);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_3);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_4);
    Block.BIRCH_SLAB.addBlockState(BIRCH_SLAB_5);
  }
}
