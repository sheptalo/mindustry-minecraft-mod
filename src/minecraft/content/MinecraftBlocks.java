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
import mindustry.world.*;
import mindustry.Vars;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.environment.Prop;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import minecraft.world.blocks.environment.*;
import static mindustry.Vars.*;

import minecraft.world.blocks.crafting.multicraft.*;

public class MinecraftBlocks{
  public static Block
//environment
Bedrock, cactus, clay, coal_ore, coarse_dirt,planks_oak_floor,
cobblestone_mossy, cobblestone, diamond_ore,
emerald_ore, gold_ore, grass_path, gravel, 
hay_block, iron_ore, lapis_ore, lava, grass, gravel_floor,
log_oak, redstone_ore, snow, stone_andesite, stone_floor,air,
stone_diorite, stone_granite, stone, water_still, farmland, web,sand,
//craftable
bookshelf, coal_block, daylight_detector, diamond_block, 
door_acacia, door_iron, door_wood, emerald_block, glass, 
gold_block, iron_block, lapis_block, melon, planks_oak,
pumpkin, redstone_dust, redstone_lamp, sea_lantern, shalker, 
stone_andesite_smooth, stone_diorite_smooth, stone_granite_smooth,
stonebrick_carved, stonebrick_cracked, stonebrick_mossy, stonebrick,sign,
tnt, 
//craftblocks
  crafting_table, furnace,
  //pickaxe,axe,shovel
  wood_tools,wood_shovel, stone_tools,
  //cores
  chest;
  public static void load(){

    redstone_dust = new PowerNode("redstone_dust"){{
      requirements(Category.power, ItemStack.with(MinecraftItems.redstone_dust,1));
      maxNodes = 4;
      laserRange = 1;
    }};
    planks_oak_floor = new OverlayFloor("planks_oak_floor"){{
      requirements(Category.defense,ItemStack.with(MinecraftItems.planks_oak,1));
      variants =0;
      allowCorePlacement = true;
      breakable = alwaysReplace = true;
      alwaysUnlocked = true;

    }};
    planks_oak = new Wall("planks_oak"){{
      requirements(Category.defense,ItemStack.with(MinecraftItems.planks_oak,1));
      health =20;
    }};
    sign = new MessageBlock("sign"){{requirements(Category.effect, ItemStack.with(MinecraftItems.sign,1));}};

    stone_floor = new Floor("stone_floor"){{
      variants = 0;
      allowCorePlacement = true;
    }};

    gravel = new StaticWall("gravel"){{
      variants = 0;

    }};
    door_wood = new Door("door_wood"){{
      requirements(Category.power,ItemStack.with(MinecraftItems.door_wood,1));
      health = 20;
      doorSound = Vars.tree.loadSound("open");
    }};
    air = new AirBlock("air");
    gravel_floor = new Floor("gravel_floor"){{
      variants = 0;
      walkSound = tree.loadSound("gravel1");
    }};

    chest = new CoreBlock("chest"){{
      requirements(Category.effect,ItemStack.with(MinecraftItems.chest,1));
      unitType = MinecraftMobs.steve;
      itemCapacity = 64;
      health = 20;
      size = 1;
      thrusterLength = 34/4f;
      alwaysUnlocked = true;
      isFirstTier = true;
    }};

grass = new Floor("grass"){{
  walkSound = Vars.tree.loadSound("grass1");
  variants = 0;
  allowCorePlacement = true;
}};

    door_iron = new Door("door_iron"){{
      requirements(Category.power,ItemStack.with(MinecraftItems.door_iron,1));
      health = 15;
      doorSound = Vars.tree.loadSound("close1");
      envDisabled |= Env.scorching;
    }};

    door_acacia = new Door("door_acacia"){{
      requirements(Category.power,ItemStack.with(MinecraftItems.door_acacia,1));
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
      outputsPower = true;
      powerProduction = 1000;
    }};

    sand = new Floor("sand"){{
itemDrop = MinecraftItems.sand;
playerUnmineable = true;
variants = 0;
      allowCorePlacement = true;
    }};

    coal_block = new Wall("coal_block"){{requirements(Category.defense, ItemStack.with(MinecraftItems.coal,9)); health = 20;}};
  farmland = new Floor("farmland"){{variants = 0;            allowCorePlacement = true;}};

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

snow = new Floor("snow"){{speedMultiplier = 0.75f;            allowCorePlacement = true;    variants = 0; walkSound = Vars.tree.loadSound("snow1");}};

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
  allowCorePlacement = true;
  }};

  coal_ore = new StaticWall("coal_ore"){{
    variants = 0;
  itemDrop = MinecraftItems.coal;
  localizedName = itemDrop.localizedName;
  mapColor.set(itemDrop.color);
  useColor = true;
  }};

  coarse_dirt = new Floor("coarse_dirt"){{variants = 0;            allowCorePlacement = true;}};
cobblestone_mossy = new StaticWall("cobblestone_mossy"){{variants =0;}};
  cobblestone = new Wall("cobblestone"){{
    health = 20;
    size = 1;
  }};

  redstone_ore = new StaticWall("redstone_ore"){{
    variants = 0;
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
    speedMultiplier = 1.5f;
    allowCorePlacement = true;
    variants = 0;
    walkSound = Vars.tree.loadSound("grass2");
  }};

hay_block = new StaticWall("hay_block"){{variants = 0;}};

iron_ore = new StaticWall("iron_ore"){{
  variants = 0;
itemDrop = MinecraftItems.iron_ore;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};

log_oak = new StaticWall("log_oak"){{
  alwaysUnlocked = true;
  variants = 0;
itemDrop = MinecraftItems.log_oak;
localizedName = itemDrop.localizedName;
mapColor.set(itemDrop.color);
useColor = true;
}};

lapis_ore = new StaticWall("lapis_ore"){{
  variants = 0;
itemDrop = MinecraftItems.lapis;
mapColor.set(itemDrop.color);
useColor = true;
}};

wood_tools = new BeamDrill("wood_tools"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.wood_axe,1,MinecraftItems.wood_pickaxe,1));
  drillTime = 300f;
  alwaysUnlocked = true;
  laserWidth = 0;
  tier = 1;
  size = 1;
  range = 1;
}};

stone_tools = new BeamDrill("stone_tools"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.stone_axe,1,MinecraftItems.stone_pickaxe,1));
  drillTime = 250f;
  alwaysUnlocked = true;
  tier = 2;
  size = 1;
  range = 1;
}};

wood_shovel = new Drill("wooden_shovel"){{
  requirements(Category.distribution, ItemStack.with(MinecraftItems.wood_shovel,1));tier = 1;drillTime = 200;
  alwaysUnlocked = true;
}};
tnt = new ShockwaveTower("tnt"){{
  requirements(Category.turret,ItemStack.with(MinecraftItems.tnt,1));
  range = 50;
  alwaysUnlocked = true;
  reload = 50f * 1.5f;
  bulletDamage = 5;
  consumePower(0.1f);
}};





  //TODO import all crafts

     furnace = new MultiCrafter("furnace"){{
       requirements(Category.production,ItemStack.with(MinecraftItems.furnace,1));
    size = 1;
alwaysUnlocked = true;
       liquidCapacity = 0;
    itemCapacity = 64;
       resolvedRecipes = Seq.with(
       new Recipe(
               new IOEntry(
                       Seq.with(ItemStack.with(MinecraftItems.coal,1,MinecraftItems.iron_ore,1)),
                       Seq.with(),0),
               new IOEntry(
                       Seq.with(ItemStack.with(MinecraftItems.iron_ingot,1)),
                       Seq.with()),100f
       ),
               new Recipe(
                       new IOEntry(
                               Seq.with(ItemStack.with(MinecraftItems.gold_ore,1,MinecraftItems.coal,1)),
                               Seq.with(),0),
                       new IOEntry(
                               Seq.with(ItemStack.with(MinecraftItems.gold_ingot,1)),
                               Seq.with()),100f
               )
       );

  }};

  crafting_table = new MultiCrafter("crafting_table"){{
  requirements(Category.production, ItemStack.with(MinecraftItems.crafting_table, 4));
    size  = 1;
    liquidCapacity = 0;
    alwaysUnlocked = true;
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
					100f
			),
            new Recipe(
                new IOEntry(
                    Seq.with(ItemStack.with(MinecraftItems.planks_oak, 4)),
                    Seq.with(), 0),
                    new IOEntry(
                        Seq.with(ItemStack.with(MinecraftItems.crafting_table, 1)),
                    Seq.with()), 100f
            ),
            new Recipe(
              new IOEntry(
                Seq.with(ItemStack.with(MinecraftItems.cobblestone,8)),
                Seq.with(),0),
                new IOEntry(
                Seq.with(ItemStack.with(MinecraftItems.furnace,1)),
                Seq.with()),100f
            ),
    new Recipe(
            new IOEntry(
                    Seq.with(ItemStack.with(MinecraftItems.planks_oak,2)),
                    Seq.with(),0),
            new IOEntry(
                    Seq.with(ItemStack.with(MinecraftItems.stick,4)),
                    Seq.with()),10f
    )
            );
  }};

  }
}
