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
public final class ChorusFlower {
  public static final BlockState CHORUS_FLOWER_0 = new BlockState(NamespaceID.from("minecraft:chorus_flower:0"), (short) 9132, Block.CHORUS_FLOWER, "age=0");

  public static final BlockState CHORUS_FLOWER_1 = new BlockState(NamespaceID.from("minecraft:chorus_flower:1"), (short) 9133, Block.CHORUS_FLOWER, "age=1");

  public static final BlockState CHORUS_FLOWER_2 = new BlockState(NamespaceID.from("minecraft:chorus_flower:2"), (short) 9134, Block.CHORUS_FLOWER, "age=2");

  public static final BlockState CHORUS_FLOWER_3 = new BlockState(NamespaceID.from("minecraft:chorus_flower:3"), (short) 9135, Block.CHORUS_FLOWER, "age=3");

  public static final BlockState CHORUS_FLOWER_4 = new BlockState(NamespaceID.from("minecraft:chorus_flower:4"), (short) 9136, Block.CHORUS_FLOWER, "age=4");

  public static final BlockState CHORUS_FLOWER_5 = new BlockState(NamespaceID.from("minecraft:chorus_flower:5"), (short) 9137, Block.CHORUS_FLOWER, "age=5");

  public static void initStates() {
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_0);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_1);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_2);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_3);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_4);
    Block.CHORUS_FLOWER.addBlockState(CHORUS_FLOWER_5);
  }
}
