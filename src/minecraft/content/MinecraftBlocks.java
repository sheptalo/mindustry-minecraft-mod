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
emerald_ore, gold_ore, grass_path, gravel, 
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
  crafting_table, furnace,
  //pickaxe,axe,shovel
  wooden_tools, stone_tools;
  public static void load(){
  farmland = new Floor("farmland"){{
Attribute.add("farm");
  }};
  stone_granite = new OreBlock("stone_granite"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = false;
  itemDrop = MinecraftItems.stone_granite;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  stone_diorite = new OreBlock("stone_diorite"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = false;
  itemDrop = MinecraftItems.stone_diorite;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  web = new OverlayFloor("web"){{speedMultiplier = 0.1f;}};
  stone = new OreBlock("stone"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = false;
  itemDrop = MinecraftItems.cobblestone;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  stone_andesite = new OreBlock("stone_andesite"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = false;
  itemDrop = MinecraftItems.stone_andesite;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
snow = new Floor("snow"){{
speedMultiplier = 0.75f;
}};
  bedrock = new StaticWall("bedrock"){{
    breakable = alwaysReplace = true;
  }};
  cactus = new Prop("cactus");
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
  itemDrop = MinecraftItems.coal;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  coarse_dirt = new Floor("coarse_dirt");
  cobblestone_mosy = new StaticWall("cobblestone_mossy");
  cobblestone = new Wall("cobblestone"){{
    health = 20;
    size = 1;
  }};
  redstone_ore = new OreBlock("redstone_ore"){{
    oreDefault = true;
    variants = 0;
  oreThreshold = 25.4F;
  oreScale = 0.3F;
  wallOre = true;
  itemDrop = MinecraftItems.redstone_dust;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
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
  itemDrop = MinecraftItems.gold_ore;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};
  grass_path = new Floor("grass_path"){{
    speedMultiplier = 2f;
  }};
hay_block = new StaticWall("hay_block");
iron_ore = new OreBlock("iron_ore"){{
  oreDefault = true;
  variants = 0;
oreThreshold = 25.4F;
oreScale = 0.3F;
wallOre = true;
itemDrop = MinecraftItems.iron_ore;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};
log_oak = new OreBlock("log_oak"){{
  oreDefault = true;
  variants = 0;
oreThreshold = 25.4F;
oreScale = 0.3F;
wallOre = true;
itemDrop = MinecraftItems.log_oak;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};
lapis_ore = new OreBlock("lapis_ore"){{
  oreDefault = true;
  variants = 0;
oreThreshold = 25.4F;
oreScale = 0.3F;
wallOre = true;
itemDrop = MinecraftItems.lapis;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};
wooden_tools = new BeamDrill("wooden_tools"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.wooden_axe,MinecraftItems.wooden_pickaxe));
  drillTime = 300f;
  tier = 1;
  size = 1;
  range = 1;
}};
stone_tools = new BeamDrill("stone_tools"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.stone_axe,MinecraftItems.stone_pickaxe));
  drillTime = 250f;
  tier = 2;
  size = 1;
  range = 1;
}};







  //TODO import all crafts.
  /* furnace = new MutiCrafter("furnace"){{
    size = 1;
    itemCapacity = 64;

  }}; */
  //crash because null recipes
 /*  crafting_table = new MultiCrafter("crafting_table"){{
  requirement(Category.production, ItemStack.with(MinecraftItems.planks_oak, 4));
    size  = 1;
    itemCapacity = 64;
            resolvedRecipes = Seq.with(
 			new Recipe(
					new IOEntry(
					Seq.with(ItemStack.with(
							MinecraftItems.log_oak, 1
				    )),
					Seq.with(),
							0.7f),
					new IOEntry(
					Seq.with(ItemStack.with(
					MinecraftItems.planks_oak, 4
				    )),
				    Seq.with()),
					10f
			),
            new Recipe(
                new IOEntry(
                    Seq.with(ItemStack.with(MinecraftItems.planks_oak, 4)),
                    Seq.with(), 0),
                    new IOEntry(
                        Seq.with(ItemStack.with(MinecraftItems.crafting_table, 1)),
                    Seq.with()), 10f
            )
            
            
            );
  }};*/
  }
}
