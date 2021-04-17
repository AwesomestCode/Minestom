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
public final class Chain {
  public static final BlockState CHAIN_0 = new BlockState(NamespaceID.from("minecraft:chain:0"), (short) 4729, Block.CHAIN, "axis=x","waterlogged=true");

  public static final BlockState CHAIN_1 = new BlockState(NamespaceID.from("minecraft:chain:1"), (short) 4730, Block.CHAIN, "axis=x","waterlogged=false");

  public static final BlockState CHAIN_2 = new BlockState(NamespaceID.from("minecraft:chain:2"), (short) 4731, Block.CHAIN, "axis=y","waterlogged=true");

  public static final BlockState CHAIN_3 = new BlockState(NamespaceID.from("minecraft:chain:3"), (short) 4732, Block.CHAIN, "axis=y","waterlogged=false");

  public static final BlockState CHAIN_4 = new BlockState(NamespaceID.from("minecraft:chain:4"), (short) 4733, Block.CHAIN, "axis=z","waterlogged=true");

  public static final BlockState CHAIN_5 = new BlockState(NamespaceID.from("minecraft:chain:5"), (short) 4734, Block.CHAIN, "axis=z","waterlogged=false");

  public static void initStates() {
    Block.CHAIN.addBlockState(CHAIN_0);
    Block.CHAIN.addBlockState(CHAIN_1);
    Block.CHAIN.addBlockState(CHAIN_2);
    Block.CHAIN.addBlockState(CHAIN_3);
    Block.CHAIN.addBlockState(CHAIN_4);
    Block.CHAIN.addBlockState(CHAIN_5);
  }
}
