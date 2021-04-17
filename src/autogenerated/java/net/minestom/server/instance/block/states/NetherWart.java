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
public final class NetherWart {
  public static final BlockState NETHER_WART_0 = new BlockState(NamespaceID.from("minecraft:nether_wart:0"), (short) 5132, Block.NETHER_WART, "age=0");

  public static final BlockState NETHER_WART_1 = new BlockState(NamespaceID.from("minecraft:nether_wart:1"), (short) 5133, Block.NETHER_WART, "age=1");

  public static final BlockState NETHER_WART_2 = new BlockState(NamespaceID.from("minecraft:nether_wart:2"), (short) 5134, Block.NETHER_WART, "age=2");

  public static final BlockState NETHER_WART_3 = new BlockState(NamespaceID.from("minecraft:nether_wart:3"), (short) 5135, Block.NETHER_WART, "age=3");

  public static void initStates() {
    Block.NETHER_WART.addBlockState(NETHER_WART_0);
    Block.NETHER_WART.addBlockState(NETHER_WART_1);
    Block.NETHER_WART.addBlockState(NETHER_WART_2);
    Block.NETHER_WART.addBlockState(NETHER_WART_3);
  }
}
