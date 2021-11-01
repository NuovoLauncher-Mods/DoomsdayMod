//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday.items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import com.haxium.basicmod.doomsday.DoomsdayMod;

public class ItemCornSeed extends Item implements IPlantable {
  private Block plant;
  
  private String name = "corn_seed";
  
  public ItemCornSeed(Block plant) {
    this.plant = plant;
    setUnlocalizedName("doomsday_mod_" + this.name);
    setTextureName("doomsday_mod:" + this.name);
    setCreativeTab(DoomsdayMod.tabSeeds);
  }
  
  public boolean onItemUse(ItemStack par1ITemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
    if (par7 != 1)
      return false; 
    if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ITemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ITemStack)) {
      if (par3World.getBlock(par4, par5, par6) == Blocks.dirt || par3World.getBlock(par4, par5, par6) == Blocks.grass || par3World.getBlock(par4, par5, par6) == Blocks.farmland) {
        if (par3World.isAirBlock(par4, par5 + 1, par6)) {
          par3World.setBlock(par4, par5 + 1, par6, this.plant);
          par1ITemStack.stackSize--;
          return true;
        } 
        return false;
      } 
      return false;
    } 
    return false;
  }
  
  public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
    return EnumPlantType.Crop;
  }
  
  public Block getPlant(IBlockAccess world, int x, int y, int z) {
    return this.plant;
  }
  
  public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
    return 0;
  }
}
