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
public final class Furnace {
  public static final BlockState FURNACE_0 = new BlockState(NamespaceID.from("minecraft:furnace:0"), (short) 3373, Block.FURNACE, "facing=north","lit=true");

  public static final BlockState FURNACE_1 = new BlockState(NamespaceID.from("minecraft:furnace:1"), (short) 3374, Block.FURNACE, "facing=north","lit=false");

  public static final BlockState FURNACE_2 = new BlockState(NamespaceID.from("minecraft:furnace:2"), (short) 3375, Block.FURNACE, "facing=south","lit=true");

  public static final BlockState FURNACE_3 = new BlockState(NamespaceID.from("minecraft:furnace:3"), (short) 3376, Block.FURNACE, "facing=south","lit=false");

  public static final BlockState FURNACE_4 = new BlockState(NamespaceID.from("minecraft:furnace:4"), (short) 3377, Block.FURNACE, "facing=west","lit=true");

  public static final BlockState FURNACE_5 = new BlockState(NamespaceID.from("minecraft:furnace:5"), (short) 3378, Block.FURNACE, "facing=west","lit=false");

  public static final BlockState FURNACE_6 = new BlockState(NamespaceID.from("minecraft:furnace:6"), (short) 3379, Block.FURNACE, "facing=east","lit=true");

  public static final BlockState FURNACE_7 = new BlockState(NamespaceID.from("minecraft:furnace:7"), (short) 3380, Block.FURNACE, "facing=east","lit=false");

  public static void initStates() {
    Block.FURNACE.addBlockState(FURNACE_0);
    Block.FURNACE.addBlockState(FURNACE_1);
    Block.FURNACE.addBlockState(FURNACE_2);
    Block.FURNACE.addBlockState(FURNACE_3);
    Block.FURNACE.addBlockState(FURNACE_4);
    Block.FURNACE.addBlockState(FURNACE_5);
    Block.FURNACE.addBlockState(FURNACE_6);
    Block.FURNACE.addBlockState(FURNACE_7);
  }
}
