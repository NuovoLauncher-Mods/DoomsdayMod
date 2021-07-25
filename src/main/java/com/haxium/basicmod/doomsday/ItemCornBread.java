//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import net.minecraft.item.ItemFood;

public class ItemCornBread extends ItemFood {
  public ItemCornBread(int food, float saturation, boolean wolfFood) {
    super(food, saturation, wolfFood);
    setCreativeTab(DoomsdayMod.tabFood);
    String name = "popcorn";
    setUnlocalizedName("doomsday_mod_" + name);
    setTextureName("doomsday_mod:" + name);
  }
}
