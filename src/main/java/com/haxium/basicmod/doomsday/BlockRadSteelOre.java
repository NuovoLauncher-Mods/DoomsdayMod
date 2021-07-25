//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRadSteelOre extends Block {
  String name = "rad_steel_ore";
  
  public BlockRadSteelOre() {
    super(Material.rock);
    setBlockName("doomsday_mod_" + this.name);
    setBlockTextureName("doomsday_mod:" + this.name);
    setCreativeTab(DoomsdayMod.tabOres);
    setHardness(3.0F);
    setResistance(7.0F);
    setStepSound(soundTypeStone);
    setHarvestLevel("pickaxe", 4);
  }
}
