//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.haxium.basicmod.doomsday.DoomsdayMod;

public class RecipeBlockCrops extends BlockBush implements IGrowable {
  protected int maxGrowthStage = 7;
  
  @SideOnly(Side.CLIENT)
  protected IIcon[] iIcon;
  
  public RecipeBlockCrops() {
    setTickRandomly(true);
    float f = 0.5F;
    setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    setCreativeTab((CreativeTabs)null);
    setHardness(0.0F);
    setStepSound(soundTypeGrass);
    disableStats();
  }
  
  protected boolean canPlaceBlockOn(Block parBlock) {
    return (parBlock == Blocks.farmland);
  }
  
  public void incrementGrowStage(World parWorld, Random parRand, int parX, int parY, int parZ) {
    int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + MathHelper.getRandomIntegerInRange(parRand, 2, 5);
    if (growStage > this.maxGrowthStage)
      growStage = this.maxGrowthStage; 
    parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
  }
  
  public Item getItemDropped(int p_149650_1_, Random parRand, int parFortune) {
    return Item.getItemFromBlock((Block)this);
  }
  
  public int getRenderType() {
    return 1;
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int parSide, int parGrowthStage) {
    return this.iIcon[parGrowthStage];
  }
  
  public boolean func_149851_a(World parWorld, int parX, int parY, int parZ, boolean p_149851_5_) {
    return (parWorld.getBlockMetadata(parX, parY, parZ) != 7);
  }
  
  public boolean func_149852_a(World p_149852_1_, Random parRand, int p_149852_3_, int p_149852_4_, int p_149852_5_) {
    return true;
  }
  
  public void func_149853_b(World parWorld, Random parRand, int parX, int parY, int parZ) {
    incrementGrowStage(parWorld, parRand, parX, parY, parZ);
  }
  
  public void updateTick(World parWorld, int parX, int parY, int parZ, Random parRand) {
    super.updateTick(parWorld, parX, parY, parZ, parRand);
    int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + 1;
    if (growStage > 7)
      growStage = 7; 
    parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
  }
}
