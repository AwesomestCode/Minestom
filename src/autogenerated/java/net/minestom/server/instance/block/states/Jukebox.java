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
public final class Jukebox {
  public static final BlockState JUKEBOX_0 = new BlockState(NamespaceID.from("minecraft:jukebox:0"), (short) 3964, Block.JUKEBOX, "has_record=true");

  public static final BlockState JUKEBOX_1 = new BlockState(NamespaceID.from("minecraft:jukebox:1"), (short) 3965, Block.JUKEBOX, "has_record=false");

  public static void initStates() {
    Block.JUKEBOX.addBlockState(JUKEBOX_0);
    Block.JUKEBOX.addBlockState(JUKEBOX_1);
  }
}
