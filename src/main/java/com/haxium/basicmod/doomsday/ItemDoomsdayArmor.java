//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import net.minecraft.item.ItemArmor;

public class ItemDoomsdayArmor extends ItemArmor {
  public ItemDoomsdayArmor(ItemArmor.ArmorMaterial material, int armorType, String name) {
    super(material, 0, armorType);
    setUnlocalizedName("doomsday_mod_" + name);
    this.canRepair = true;
    setTextureName("doomsday_mod:" + name);
    setCreativeTab(DoomsdayMod.tabArmor);
  }
}
