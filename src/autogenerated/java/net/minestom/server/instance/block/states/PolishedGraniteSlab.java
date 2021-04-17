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
public final class PolishedGraniteSlab {
  public static final BlockState POLISHED_GRANITE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:polished_granite_slab:0"), (short) 10793, Block.POLISHED_GRANITE_SLAB, "type=top","waterlogged=true");

  public static final BlockState POLISHED_GRANITE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:polished_granite_slab:1"), (short) 10794, Block.POLISHED_GRANITE_SLAB, "type=top","waterlogged=false");

  public static final BlockState POLISHED_GRANITE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:polished_granite_slab:2"), (short) 10795, Block.POLISHED_GRANITE_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState POLISHED_GRANITE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:polished_granite_slab:3"), (short) 10796, Block.POLISHED_GRANITE_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState POLISHED_GRANITE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:polished_granite_slab:4"), (short) 10797, Block.POLISHED_GRANITE_SLAB, "type=double","waterlogged=true");

  public static final BlockState POLISHED_GRANITE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:polished_granite_slab:5"), (short) 10798, Block.POLISHED_GRANITE_SLAB, "type=double","waterlogged=false");

  public static void initStates() {
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_0);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_1);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_2);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_3);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_4);
    Block.POLISHED_GRANITE_SLAB.addBlockState(POLISHED_GRANITE_SLAB_5);
  }
}
