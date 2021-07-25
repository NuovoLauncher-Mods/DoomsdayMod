//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import net.minecraft.item.Item;

public class ItemDoomsdayModGeneric extends Item {
  public ItemDoomsdayModGeneric(String name) {
    setTextureName("doomsday_mod:" + name);
    setUnlocalizedName("doomsday_mod_" + name);
    setCreativeTab(DoomsdayMod.tabItems);
  }
}
