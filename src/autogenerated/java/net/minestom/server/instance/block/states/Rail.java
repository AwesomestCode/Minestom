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
public final class Rail {
  public static final BlockState RAIL_0 = new BlockState(NamespaceID.from("minecraft:rail:0"), (short) 3645, Block.RAIL, "shape=north_south");

  public static final BlockState RAIL_1 = new BlockState(NamespaceID.from("minecraft:rail:1"), (short) 3646, Block.RAIL, "shape=east_west");

  public static final BlockState RAIL_2 = new BlockState(NamespaceID.from("minecraft:rail:2"), (short) 3647, Block.RAIL, "shape=ascending_east");

  public static final BlockState RAIL_3 = new BlockState(NamespaceID.from("minecraft:rail:3"), (short) 3648, Block.RAIL, "shape=ascending_west");

  public static final BlockState RAIL_4 = new BlockState(NamespaceID.from("minecraft:rail:4"), (short) 3649, Block.RAIL, "shape=ascending_north");

  public static final BlockState RAIL_5 = new BlockState(NamespaceID.from("minecraft:rail:5"), (short) 3650, Block.RAIL, "shape=ascending_south");

  public static final BlockState RAIL_6 = new BlockState(NamespaceID.from("minecraft:rail:6"), (short) 3651, Block.RAIL, "shape=south_east");

  public static final BlockState RAIL_7 = new BlockState(NamespaceID.from("minecraft:rail:7"), (short) 3652, Block.RAIL, "shape=south_west");

  public static final BlockState RAIL_8 = new BlockState(NamespaceID.from("minecraft:rail:8"), (short) 3653, Block.RAIL, "shape=north_west");

  public static final BlockState RAIL_9 = new BlockState(NamespaceID.from("minecraft:rail:9"), (short) 3654, Block.RAIL, "shape=north_east");

  public static void initStates() {
    Block.RAIL.addBlockState(RAIL_0);
    Block.RAIL.addBlockState(RAIL_1);
    Block.RAIL.addBlockState(RAIL_2);
    Block.RAIL.addBlockState(RAIL_3);
    Block.RAIL.addBlockState(RAIL_4);
    Block.RAIL.addBlockState(RAIL_5);
    Block.RAIL.addBlockState(RAIL_6);
    Block.RAIL.addBlockState(RAIL_7);
    Block.RAIL.addBlockState(RAIL_8);
    Block.RAIL.addBlockState(RAIL_9);
  }
}
