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
public final class AzureBluet {
  public static final BlockState AZURE_BLUET_0 = new BlockState(NamespaceID.from("minecraft:azure_bluet:0"), (short) 1416, Block.AZURE_BLUET);

  public static void initStates() {
    Block.AZURE_BLUET.addBlockState(AZURE_BLUET_0);
  }
}