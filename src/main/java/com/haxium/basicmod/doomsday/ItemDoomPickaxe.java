//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemDoomPickaxe extends ItemPickaxe {
  public ItemDoomPickaxe(Item.ToolMaterial material, String name) {
    super(material);
    setUnlocalizedName("doomsday_mod_" + name);
    setTextureName("doomsday_mod:" + name);
    this.canRepair = true;
    setCreativeTab(DoomsdayMod.tabTools);
  }
}
