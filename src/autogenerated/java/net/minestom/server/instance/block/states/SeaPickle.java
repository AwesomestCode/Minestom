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
public final class SeaPickle {
  public static final BlockState SEA_PICKLE_0 = new BlockState(NamespaceID.from("minecraft:sea_pickle:0"), (short) 9644, Block.SEA_PICKLE, "pickles=1","waterlogged=true");

  public static final BlockState SEA_PICKLE_1 = new BlockState(NamespaceID.from("minecraft:sea_pickle:1"), (short) 9645, Block.SEA_PICKLE, "pickles=1","waterlogged=false");

  public static final BlockState SEA_PICKLE_2 = new BlockState(NamespaceID.from("minecraft:sea_pickle:2"), (short) 9646, Block.SEA_PICKLE, "pickles=2","waterlogged=true");

  public static final BlockState SEA_PICKLE_3 = new BlockState(NamespaceID.from("minecraft:sea_pickle:3"), (short) 9647, Block.SEA_PICKLE, "pickles=2","waterlogged=false");

  public static final BlockState SEA_PICKLE_4 = new BlockState(NamespaceID.from("minecraft:sea_pickle:4"), (short) 9648, Block.SEA_PICKLE, "pickles=3","waterlogged=true");

  public static final BlockState SEA_PICKLE_5 = new BlockState(NamespaceID.from("minecraft:sea_pickle:5"), (short) 9649, Block.SEA_PICKLE, "pickles=3","waterlogged=false");

  public static final BlockState SEA_PICKLE_6 = new BlockState(NamespaceID.from("minecraft:sea_pickle:6"), (short) 9650, Block.SEA_PICKLE, "pickles=4","waterlogged=true");

  public static final BlockState SEA_PICKLE_7 = new BlockState(NamespaceID.from("minecraft:sea_pickle:7"), (short) 9651, Block.SEA_PICKLE, "pickles=4","waterlogged=false");

  public static void initStates() {
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_0);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_1);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_2);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_3);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_4);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_5);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_6);
    Block.SEA_PICKLE.addBlockState(SEA_PICKLE_7);
  }
}
