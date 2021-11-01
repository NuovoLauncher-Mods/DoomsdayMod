//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.haxium.basicmod.doomsday.DoomsdayMod;

public class tabFood extends CreativeTabs {
  public tabFood() {
    super("DoomsdayModFood");
  }
  
  public Item getTabIconItem() {
    return DoomsdayMod.canned_corn;
  }
}
