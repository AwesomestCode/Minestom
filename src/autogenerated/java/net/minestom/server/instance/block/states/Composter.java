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
public final class Composter {
  public static final BlockState COMPOSTER_0 = new BlockState(NamespaceID.from("minecraft:composter:0"), (short) 15759, Block.COMPOSTER, "level=0");

  public static final BlockState COMPOSTER_1 = new BlockState(NamespaceID.from("minecraft:composter:1"), (short) 15760, Block.COMPOSTER, "level=1");

  public static final BlockState COMPOSTER_2 = new BlockState(NamespaceID.from("minecraft:composter:2"), (short) 15761, Block.COMPOSTER, "level=2");

  public static final BlockState COMPOSTER_3 = new BlockState(NamespaceID.from("minecraft:composter:3"), (short) 15762, Block.COMPOSTER, "level=3");

  public static final BlockState COMPOSTER_4 = new BlockState(NamespaceID.from("minecraft:composter:4"), (short) 15763, Block.COMPOSTER, "level=4");

  public static final BlockState COMPOSTER_5 = new BlockState(NamespaceID.from("minecraft:composter:5"), (short) 15764, Block.COMPOSTER, "level=5");

  public static final BlockState COMPOSTER_6 = new BlockState(NamespaceID.from("minecraft:composter:6"), (short) 15765, Block.COMPOSTER, "level=6");

  public static final BlockState COMPOSTER_7 = new BlockState(NamespaceID.from("minecraft:composter:7"), (short) 15766, Block.COMPOSTER, "level=7");

  public static final BlockState COMPOSTER_8 = new BlockState(NamespaceID.from("minecraft:composter:8"), (short) 15767, Block.COMPOSTER, "level=8");

  public static void initStates() {
    Block.COMPOSTER.addBlockState(COMPOSTER_0);
    Block.COMPOSTER.addBlockState(COMPOSTER_1);
    Block.COMPOSTER.addBlockState(COMPOSTER_2);
    Block.COMPOSTER.addBlockState(COMPOSTER_3);
    Block.COMPOSTER.addBlockState(COMPOSTER_4);
    Block.COMPOSTER.addBlockState(COMPOSTER_5);
    Block.COMPOSTER.addBlockState(COMPOSTER_6);
    Block.COMPOSTER.addBlockState(COMPOSTER_7);
    Block.COMPOSTER.addBlockState(COMPOSTER_8);
  }
}
