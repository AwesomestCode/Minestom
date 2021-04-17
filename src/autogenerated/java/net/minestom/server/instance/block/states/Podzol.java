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
public final class Podzol {
  public static final BlockState PODZOL_0 = new BlockState(NamespaceID.from("minecraft:podzol:0"), (short) 12, Block.PODZOL, "snowy=true");

  public static final BlockState PODZOL_1 = new BlockState(NamespaceID.from("minecraft:podzol:1"), (short) 13, Block.PODZOL, "snowy=false");

  public static void initStates() {
    Block.PODZOL.addBlockState(PODZOL_0);
    Block.PODZOL.addBlockState(PODZOL_1);
  }
}
