package minecraft.content;

import arc.graphics.Color;
import arc.math.Rand;
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
import mindustry.Vars;
import mindustry.content.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.environment.Prop;
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
import minecraft.world.blocks.environment.*;
//mineItems = ;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

import minecraft.world.blocks.crafting.multicraft.*;

public class MinecraftBlocks{
  public static Block
//environment
Bedrock, cactus, clay, coal_ore, coarse_dirt,
cobblestone_mosy, cobblestone, diamond_ore,
emerald_ore, gold_ore, grass_path, gravel, 
hay_block, iron_ore, lapis_ore, lava, grass,
log_oak, redstone_ore, snow, stone_andesite, 
stone_diorite, stone_granite, stone, water_still, farmland, web,sand,
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
  wood_tools,wood_shovel, stone_tools;
  public static void load(){

grass = new Floor("grass"){{walkSound = Vars.tree.loadSound("grass1");}};

    door_iron = new Door("door_iron"){{
      requirements(Category.defense,ItemStack.with(MinecraftItems.door_iron,1));
      health = 15;
      doorSound = Vars.tree.loadSound("open");
      envDisabled |= Env.scorching;
    }};

    door_acacia = new Door("door_acacia"){{
      requirements(Category.defense,ItemStack.with(MinecraftItems.door_acacia,1));
      health = 10;
      doorSound = Vars.tree.loadSound("open");
      envDisabled |= Env.scorching;
    }};

    emerald_block = new Wall("emerald_block"){{
      requirements(Category.defense,ItemStack.with(MinecraftItems.emerald_block,1));
      health = 25;
    }};

    diamond_block = new Wall("diamond_block"){{requirements(Category.defense,ItemStack.with(MinecraftItems.diamond_block,1)); health=30;}};
    
    daylight_detector = new SolarGenerator("daylight_detector"){{
      requirements(Category.power, ItemStack.with(MinecraftItems.daylight_detector,1));
    }};

    sand = new Floor("sand"){{
itemDrop = MinecraftItems.sand;
playerUnmineable = true;
variants = 1;
    }};

    coal_block = new Wall("coal_block"){{requirements(Category.defense, ItemStack.with(MinecraftItems.coal,9)); health = 20;}};
  farmland = new Floor("farmland"){{ }};

  water_still = new Floor("water_still"){{
    speedMultiplier = 0.7f;
    variants = 0;
    liquidDrop = MinecraftLiquids.water_still;
    isLiquid = true;
    drownTime = 2000f;
  }};

  bookshelf = new Wall("bookshelf"){{requirements(Category.defense, ItemStack.with(MinecraftItems.bookshelf,1)); health = 20;}};
  
  lava = new Floor("lava"){{
    speedMultiplier = 0.5f;
    variants = 0;
    damageTaken = 0.03f;
    walkSound = Vars.tree.loadSound("lava");
    liquidDrop = MinecraftLiquids.lava;
    isLiquid = true;
    drownTime = 200f;
  }};
  
  stone_granite = new StaticWall("stone_granite"){{
    variants = 0;
  itemDrop = MinecraftItems.stone_granite;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  stone_diorite = new StaticWall("stone_diorite"){{
    variants = 0;
  itemDrop = MinecraftItems.stone_diorite;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  web = new OverlayFloor("web"){{speedMultiplier = 0.1f;    variants = 0;}};
  
  stone = new StaticWall("stone"){{
    variants = 0;
  itemDrop = MinecraftItems.cobblestone;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  stone_andesite = new StaticWall("stone_andesite"){{
    variants = 1;
  itemDrop = MinecraftItems.stone_andesite;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

snow = new Floor("snow"){{speedMultiplier = 0.75f;    variants = 0; walkSound = Vars.tree.loadSound("snow1");}};

Bedrock = new Bedrock("bedrock"){{ variants = 0; breakable = alwaysReplace = false;}};
  
cactus = new Prop("cactus");
  
clay = new Floor("clay"){{
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

  coal_ore = new StaticWall("coal_ore"){{
    variants = 0;
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

  redstone_ore = new StaticWall("redstone_ore"){{
    variants = 1;
  itemDrop = MinecraftItems.redstone_dust;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  diamond_ore = new StaticWall("diamond_ore"){{
    variants = 0;
  itemDrop = MinecraftItems.diamond;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  emerald_ore = new StaticWall("emerald_ore"){{
    variants = 0;
  itemDrop = MinecraftItems.emerald;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  gold_ore = new StaticWall("gold_ore"){{
    variants = 0;
  itemDrop = MinecraftItems.gold_ore;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  grass_path = new Floor("grass_path"){{
    speedMultiplier = 2f;
    variants = 1;
    walkSound = Vars.tree.loadSound("grass2");
  }};

hay_block = new StaticWall("hay_block");

iron_ore = new StaticWall("iron_ore"){{
  variants = 1;
itemDrop = MinecraftItems.iron_ore;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};

log_oak = new StaticWall("log_oak"){{
  variants = 1;
itemDrop = MinecraftItems.log_oak;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};

lapis_ore = new StaticWall("lapis_ore"){{
  variants = 1;
itemDrop = MinecraftItems.lapis;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};

wood_tools = new BeamDrill("wood_tools"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.wood_axe,1,MinecraftItems.wood_pickaxe,1));
  drillTime = 300f;
  tier = 1;
  size = 1;
  range = 1;
}};

stone_tools = new BeamDrill("stone_tools"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.stone_axe,1,MinecraftItems.stone_pickaxe,1));
  drillTime = 250f;
  tier = 2;
  size = 1;
  range = 1;
}};

wood_shovel = new Drill("wooden_shovel"){{
  requirements(Category.distribution, ItemStack.with(MinecraftItems.wood_shovel,1));tier = 1;drillTime = 200;
}};
tnt = new ShockwaveTower("tnt"){{
  range = 50;
  reload = 50f * 1.5f;
  bulletDamage = 5;
  consumePower(0.1f);
}};





  //TODO import all crafts.
  /* furnace = new MutiCrafter("furnace"){{
    size = 1;
    itemCapacity = 64;

  }}; */

  crafting_table = new MultiCrafter("crafting_table"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.planks_oak, 4));
    size  = 1;
    itemCapacity = 64;
            resolvedRecipes = Seq.with(
 			new Recipe(
					new IOEntry(
					Seq.with(ItemStack.with(
							MinecraftItems.log_oak, 1
				    )),
					Seq.with(),
							0),
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
            ),
            new Recipe(
              new IOEntry(
                Seq.with(ItemStack.with(MinecraftItems.cobblestone,8)),
                Seq.with(),0),
                new IOEntry(
                Seq.with(ItemStack.with(MinecraftItems.furnace,1)),
                Seq.with()),10f
            )
            
            );
  }};

  }
}
