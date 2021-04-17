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
public final class SpruceWallSign {
  public static final BlockState SPRUCE_WALL_SIGN_0 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:0"), (short) 3743, Block.SPRUCE_WALL_SIGN, "facing=north","waterlogged=true");

  public static final BlockState SPRUCE_WALL_SIGN_1 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:1"), (short) 3744, Block.SPRUCE_WALL_SIGN, "facing=north","waterlogged=false");

  public static final BlockState SPRUCE_WALL_SIGN_2 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:2"), (short) 3745, Block.SPRUCE_WALL_SIGN, "facing=south","waterlogged=true");

  public static final BlockState SPRUCE_WALL_SIGN_3 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:3"), (short) 3746, Block.SPRUCE_WALL_SIGN, "facing=south","waterlogged=false");

  public static final BlockState SPRUCE_WALL_SIGN_4 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:4"), (short) 3747, Block.SPRUCE_WALL_SIGN, "facing=west","waterlogged=true");

  public static final BlockState SPRUCE_WALL_SIGN_5 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:5"), (short) 3748, Block.SPRUCE_WALL_SIGN, "facing=west","waterlogged=false");

  public static final BlockState SPRUCE_WALL_SIGN_6 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:6"), (short) 3749, Block.SPRUCE_WALL_SIGN, "facing=east","waterlogged=true");

  public static final BlockState SPRUCE_WALL_SIGN_7 = new BlockState(NamespaceID.from("minecraft:spruce_wall_sign:7"), (short) 3750, Block.SPRUCE_WALL_SIGN, "facing=east","waterlogged=false");

  public static void initStates() {
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_0);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_1);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_2);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_3);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_4);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_5);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_6);
    Block.SPRUCE_WALL_SIGN.addBlockState(SPRUCE_WALL_SIGN_7);
  }
}
