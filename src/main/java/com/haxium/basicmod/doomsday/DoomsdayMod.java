//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.7.10 stable mappings"!

package com.haxium.basicmod.doomsday;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

//import all the base classes
import com.haxium.basicmod.doomsday.blocks.*;
import com.haxium.basicmod.doomsday.handler.*;
import com.haxium.basicmod.doomsday.items.*;
import com.haxium.basicmod.doomsday.tabs.*;

@Mod(modid = "doomsday_mod", version = "1.0Alpha", name = "Doomsday Mod")
public class DoomsdayMod {
  public static final String MODID = "doomsday_mod";
  
  public static final String VERSION = "1.0Alpha";
  
  public static final String NAME = "Doomsday Mod";
  
  public static Item steel;
  
  public static Item rad_steel;
  
  public static Item steel_can;
  
  public static Block beans;
  
  public static Block corn;
  
  public static Item bean;
  
  public static Item corns;
  
  public static Item corn_seed;
  
  public static Item bean_seeds;
  
  public static Item doom_pickaxe;
  
  Item.ToolMaterial steel_mat = EnumHelper.addToolMaterial("steel", 5, 4500, 10.1F, 4.5F, 10);
  
  public static Item canned_beans;
  
  public static Item canned_corn;
  
  public static Item corn_bread;
  
  public static Item popcorn;
  
  public static Item bean_food;
  
  public static Item corn_food;
  
  public static Block bunker_roof;
  
  public static Block bunker_floor;
  
  public static Block bunker_walls;
  
  public static Item bunker_sign;
  
  public static Block rad_steel_ore;
  
  public static Block steel_ore;
  
  public static Item rad_chest;
  
  public static Item rad_helm;
  
  public static Item rad_boots;
  
  public static Item rad_leggings;
  
  ItemArmor.ArmorMaterial rad_steel_mat = EnumHelper.addArmorMaterial("rad_steel", 20, new int[] { 3, 7, 6, 3 }, 25);
  
  DoomsDayModEventHandler handler = new DoomsDayModEventHandler();
  
  public static CreativeTabs tabArmor = new tabArmor();
  
  public static CreativeTabs tabBunker = new tabBunker();
  
  public static CreativeTabs tabFood = new tabFood();
  
  public static CreativeTabs tabItems = new tabItems();
  
  public static CreativeTabs tabOres = new tabOres();
  
  public static CreativeTabs tabSeeds = new tabSeeds();
  
  public static CreativeTabs tabTools = new tabTools();
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    bunker_roof = new BlockBunkerRoof();
    bunker_walls = new BlockBunkerWalls();
    bunker_floor = new BlockBunkerFloor();
    bunker_sign = new ItemDoomsdayModGeneric("bunker_sign");
    GameRegistry.registerItem(bunker_sign, "BunkerSign");
    GameRegistry.registerBlock(bunker_roof, "BunkerRoof");
    GameRegistry.registerBlock(bunker_walls, "BunkerWalls");
    GameRegistry.registerBlock(bunker_floor, "BunkerFloor");
    beans = (Block)new BlockBeans();
    corn = (Block)new BlockCorn();
    GameRegistry.registerBlock(beans, "BeanPlant");
    GameRegistry.registerBlock(corn, "CornPlant");
    canned_beans = (Item)new ItemCannedBeans(3, 0.5F, true);
    canned_corn = (Item)new ItemCannedCorn(3, 0.65F, true);
    corn_bread = (Item)new ItemCornBread(3, 0.75F, true);
    popcorn = (Item)new ItemPopCorn(3, 0.9F, true);
    bean_food = (Item)new ItemFoodGeneric("beans", 3, 0.95F, true);
    corn_food = (Item)new ItemFoodGeneric("corn", 3, 0.85F, true);
    GameRegistry.registerItem(canned_beans, "CannedBeans");
    GameRegistry.registerItem(canned_corn, "CannedCorn");
    GameRegistry.registerItem(corn_bread, "CornBread");
    GameRegistry.registerItem(popcorn, "Popcorn");
    GameRegistry.registerItem(bean_food, "Beans");
    GameRegistry.registerItem(corn_food, "Corn");
    bean = new ItemDoomsdayModGeneric("bean");
    corns = new ItemDoomsdayModGeneric("corns");
    GameRegistry.registerItem(bean, "bean");
    GameRegistry.registerItem(corns, "corns");
    steel = new ItemDoomsdayModGeneric("steel");
    rad_steel = new ItemDoomsdayModGeneric("rad_steel");
    steel_can = new ItemDoomsdayModGeneric("steel_can");
    GameRegistry.registerItem(steel_can, "SteelCan");
    GameRegistry.registerItem(steel, "Steel");
    GameRegistry.registerItem(rad_steel, "RadSteel");
    bean_seeds = new ItemBeanSeed(beans);
    corn_seed = new ItemCornSeed(corn);
    GameRegistry.registerItem(bean_seeds, "BeanSeeds");
    GameRegistry.registerItem(corn_seed, "CornSeed");
    doom_pickaxe = (Item)new ItemDoomPickaxe(this.steel_mat, "doom_pickaxe");
    GameRegistry.registerItem(doom_pickaxe, "DoomPickaxe");
    rad_boots = (Item)new ItemDoomsdayArmor(this.rad_steel_mat, 3, "rad_boots");
    rad_helm = (Item)new ItemDoomsdayArmor(this.rad_steel_mat, 0, "rad_helm");
    rad_chest = (Item)new ItemDoomsdayArmor(this.rad_steel_mat, 1, "rad_chest");
    rad_leggings = (Item)new ItemDoomsdayArmor(this.rad_steel_mat, 2, "rad_leggings");
    GameRegistry.registerItem(rad_helm, "RadiationHelmet");
    GameRegistry.registerItem(rad_chest, "RadiationChestplate");
    GameRegistry.registerItem(rad_leggings, "RadiationLeggings");
    GameRegistry.registerItem(rad_boots, "RadiationBoots");
    steel_ore = new BlockSteelOre();
    rad_steel_ore = new BlockRadSteelOre();
    GameRegistry.registerBlock(steel_ore, "SteelOre");
    GameRegistry.registerBlock(rad_steel_ore, "RadSteelOre");
    OreDictionary.registerOre("ingotSteel", new ItemStack(steel));
    OreDictionary.registerOre("ingotRadSteel", new ItemStack(rad_steel));
    GameRegistry.registerWorldGenerator(this.handler, 0);
  }
  
  @EventHandler
  public void init(FMLInitializationEvent event) {
    GameRegistry.addRecipe(new ItemStack(doom_pickaxe), new Object[] { "AAA", " E ", " H ", 
          
          Character.valueOf('A'), steel, Character.valueOf('E'), Items.stick, Character.valueOf('H'), Items.stick });
    GameRegistry.addRecipe(new ItemStack(bunker_floor), new Object[] { "AAA", "AAA", "AAA", 
          
          Character.valueOf('A'), rad_steel });
    GameRegistry.addRecipe(new ItemStack(bunker_walls), new Object[] { "AAA", "AAA", "AAA", 
          
          Character.valueOf('A'), rad_steel });
    GameRegistry.addRecipe(new ItemStack(bunker_roof), new Object[] { "AAA", "AAA", "AAA", 
          
          Character.valueOf('A'), rad_steel });
    GameRegistry.addRecipe(new ItemStack(rad_helm), new Object[] { "AAA", "A A", 
          
          Character.valueOf('A'), rad_steel });
    GameRegistry.addRecipe(new ItemStack(rad_chest), new Object[] { "A A", "AAA", "AAA", 
          
          Character.valueOf('A'), rad_steel });
    GameRegistry.addRecipe(new ItemStack(rad_leggings), new Object[] { "AAA", "A A", "A A", 
          
          Character.valueOf('A'), rad_steel });
    GameRegistry.addRecipe(new ItemStack(rad_boots), new Object[] { "   ", "A A", "A A", 
          
          Character.valueOf('A'), rad_steel });
    GameRegistry.addRecipe(new ItemStack(canned_beans), new Object[] { "AB ", "   ", "   ", 
          
          Character.valueOf('A'), bean, Character.valueOf('B'), steel_can });
    GameRegistry.addRecipe(new ItemStack(canned_corn), new Object[] { "AB ", "   ", "   ", 
          
          Character.valueOf('A'), corns, Character.valueOf('B'), steel_can });
    GameRegistry.addRecipe(new ItemStack(corn_bread), new Object[] { "AB ", "   ", "   ", 
          
          Character.valueOf('A'), corns, Character.valueOf('B'), Items.bread });
    GameRegistry.addRecipe(new ItemStack(steel_can), new Object[] { "AAA", "A A", "AAA", 
          
          Character.valueOf('A'), steel });
    GameRegistry.addSmelting(steel_ore, new ItemStack(steel), 5.0F);
    GameRegistry.addSmelting(rad_steel_ore, new ItemStack(rad_steel), 5.0F);
  }
}
