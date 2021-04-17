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
public final class BlueGlazedTerracotta {
  public static final BlockState BLUE_GLAZED_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:blue_glazed_terracotta:0"), (short) 9422, Block.BLUE_GLAZED_TERRACOTTA, "facing=north");

  public static final BlockState BLUE_GLAZED_TERRACOTTA_1 = new BlockState(NamespaceID.from("minecraft:blue_glazed_terracotta:1"), (short) 9423, Block.BLUE_GLAZED_TERRACOTTA, "facing=south");

  public static final BlockState BLUE_GLAZED_TERRACOTTA_2 = new BlockState(NamespaceID.from("minecraft:blue_glazed_terracotta:2"), (short) 9424, Block.BLUE_GLAZED_TERRACOTTA, "facing=west");

  public static final BlockState BLUE_GLAZED_TERRACOTTA_3 = new BlockState(NamespaceID.from("minecraft:blue_glazed_terracotta:3"), (short) 9425, Block.BLUE_GLAZED_TERRACOTTA, "facing=east");

  public static void initStates() {
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_0);
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_1);
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_2);
    Block.BLUE_GLAZED_TERRACOTTA.addBlockState(BLUE_GLAZED_TERRACOTTA_3);
  }
}
