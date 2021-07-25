//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BlockCorn extends RecipeBlockCrops {
  public BlockCorn() {
    setBlockName("corn");
    setBlockTextureName("doomsday_mod:corn_stage_0");
  }
  
  public int quantityDropped(int parMetadata, int parFortune, Random parRand) {
    return parMetadata / 2;
  }
  
  public Item getItemDropped(int parMetadata, Random parRand, int parFortune) {
    System.out.println("BlockCorn getItemDropped()");
    return DoomsdayMod.corns;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister parIIconRegister) {
    this.iIcon = new net.minecraft.util.IIcon[this.maxGrowthStage + 1];
    this.iIcon[0] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_0");
    this.iIcon[1] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_0.1");
    this.iIcon[2] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_1");
    this.iIcon[3] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_1.1");
    this.iIcon[4] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_2");
    this.iIcon[5] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_2.1");
    this.iIcon[6] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_3");
    this.iIcon[7] = parIIconRegister.registerIcon("doomsday_mod:corn_stage_3.1");
  }
}
