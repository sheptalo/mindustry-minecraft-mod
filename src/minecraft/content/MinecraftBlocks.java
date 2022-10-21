package minecraft.content;

import arc.graphics.Color;
import arc.struct.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
//mineItems = ;
import minecraft.world.blocks.crafting.multicraft.*;
public class MinecraftBlocks{
  public static Block
//environment
bedrock, cactus, clay, coal_ore, coarse_dirt,
cobblestone_mosy, cobblestone, diamond_ore,
emerald_ore, gold_ore, grass_patl, gravel, 
hay_block, iron_ore, lapis_ore, lava_stil, 
log_oak, redstone_ore, snow, stone_andesite, 
stone_diorite, stone_granite, stone, water_still, farmland, web,
//craftable
bookshelf, coal_block, daylight_detector, diamond_block, 
door_acacia, door_iron, door_wood, emerald_block, glass, 
gold_block, iron_block, lapis_block, melon, planks_oak,
pumpkin, redstone_dust, redstone_lamp, sea_lantern, shalker, 
stone_andesite_smooth, stone_diorite_smooth, stone_granite_smooth,
stonebrick_carved, stonebrick_cracked, stonebrick_mossy, stonebrick,
tnt, 
//craftblocks
  crafting_table, furnace;
  
  public static void load(){
  farmland = new Floor("farmland"){{
    requirements(Category.production, ItemStack.with(Items.copper,1));
    size = 1;
    Attribute.add("farm");
  }} ;
  bedrock = new Floor("bedrock");
  cactus = new StaticWall("cactus");
  clay = new OreBlock("clay"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = false;
  itemDrop = MinecraftItems.clay;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  coal_ore = new OreBlock("coal_ore"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = true;
  itemDrop = MinecraftItems.clay;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  coarse_dirt = new Floor("coarse_dirt");
  cobblestone_mosy = new StaticWall("cobblestone_mosy");
  cobblestone = new Wall("cobblestone"){{
    health = 20;
    size = 1;
  }};
  diamond_ore = new OreBlock("diamond_ore"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = true;
  itemDrop = MinecraftItems.diamond;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  emerald_ore = new OreBlock("emerald_ore"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = true;
  itemDrop = MinecraftItems.emerald;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  gold_ore = new OreBlock("gold_ore"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = true;
  itemDrop = MinecraftItems.gold__block;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};










  //TODO import all crafts.
  crafting_table = new MultiCrafter("crafting_table"){{
    size  = 1;
  }};
  }
}
