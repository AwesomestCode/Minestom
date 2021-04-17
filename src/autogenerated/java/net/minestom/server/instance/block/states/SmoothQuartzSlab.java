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
public final class SmoothQuartzSlab {
  public static final BlockState SMOOTH_QUARTZ_SLAB_0 = new BlockState(NamespaceID.from("minecraft:smooth_quartz_slab:0"), (short) 10835, Block.SMOOTH_QUARTZ_SLAB, "type=top","waterlogged=true");

  public static final BlockState SMOOTH_QUARTZ_SLAB_1 = new BlockState(NamespaceID.from("minecraft:smooth_quartz_slab:1"), (short) 10836, Block.SMOOTH_QUARTZ_SLAB, "type=top","waterlogged=false");

  public static final BlockState SMOOTH_QUARTZ_SLAB_2 = new BlockState(NamespaceID.from("minecraft:smooth_quartz_slab:2"), (short) 10837, Block.SMOOTH_QUARTZ_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState SMOOTH_QUARTZ_SLAB_3 = new BlockState(NamespaceID.from("minecraft:smooth_quartz_slab:3"), (short) 10838, Block.SMOOTH_QUARTZ_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState SMOOTH_QUARTZ_SLAB_4 = new BlockState(NamespaceID.from("minecraft:smooth_quartz_slab:4"), (short) 10839, Block.SMOOTH_QUARTZ_SLAB, "type=double","waterlogged=true");

  public static final BlockState SMOOTH_QUARTZ_SLAB_5 = new BlockState(NamespaceID.from("minecraft:smooth_quartz_slab:5"), (short) 10840, Block.SMOOTH_QUARTZ_SLAB, "type=double","waterlogged=false");

  public static void initStates() {
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_0);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_1);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_2);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_3);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_4);
    Block.SMOOTH_QUARTZ_SLAB.addBlockState(SMOOTH_QUARTZ_SLAB_5);
  }
}
