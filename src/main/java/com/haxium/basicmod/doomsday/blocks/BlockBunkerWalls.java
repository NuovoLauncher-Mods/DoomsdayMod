//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.basicmod.haxium.doomsday.DoomsdayMod;

public class BlockBunkerWalls extends Block {
  String name = "bunker_walls";
  
  public BlockBunkerWalls() {
    super(Material.iron);
    setBlockName("doomsday_mod_" + this.name);
    setBlockTextureName("doomsday_mod:" + this.name);
    setCreativeTab(DoomsdayMod.tabBunker);
    setHardness(3.0F);
    setResistance(7.0F);
    setStepSound(soundTypeStone);
    setHarvestLevel("pickaxe", 4);
  }
}
