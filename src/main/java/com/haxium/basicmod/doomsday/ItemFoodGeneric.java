//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import net.minecraft.item.ItemFood;

public class ItemFoodGeneric extends ItemFood {
  public ItemFoodGeneric(String name, int food, float saturation, boolean wolfFood) {
    super(food, saturation, wolfFood);
    setCreativeTab(DoomsdayMod.tabFood);
    setUnlocalizedName("doomsday_mod_" + name);
    setTextureName("doomsday_mod:" + name);
  }
}
