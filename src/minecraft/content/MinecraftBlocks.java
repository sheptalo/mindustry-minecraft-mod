package minecraft.content;

import arc.graphics.Color;
import arc.struct.*;
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

import multicraft.*;

import javax.swing.plaf.synth.Region;
//import minecraft.world.blocks.crafting.multicraft.*;

public class MinecraftBlocks {
    public static Block

//region environment

            Bedrock, cactus, clay, coal_ore, coarse_dirt, planks_oak_floor,
            cobblestone_mossy, cobblestone, diamond_ore,
            emerald_ore, gold_ore, grass_path, gravel,
            hay_block, iron_ore, lapis_ore, lava, grass, gravel_floor,
            log_oak, redstone_ore, snow, stone_andesite, stone_floor, air,
            stone_diorite, stone_granite, stone, water_still, farmland, web, sand,

//colorful
    //clay

    hardened_clay, hardened_clay_stained_black, hardened_clay_stained_blue,
            hardened_clay_stained_brown, hardened_clay_stained_cyan, hardened_clay_stained_gray,
            hardened_clay_stained_green, hardened_clay_stained_light_blue, hardened_clay_stained_lime,
            hardened_clay_stained_magenta, hardened_clay_stained_orange, hardened_clay_stained_pink,
            hardened_clay_stained_purple, hardened_clay_stained_red, hardened_clay_stained_silver,
            hardened_clay_stained_white, hardened_clay_stained_yellow,
    //concrete
    concrete_black, concrete_blue, concrete_brown, concrete_cyan, concrete_gray, concrete_green,
            concrete_light_blue, concrete_lime, concrete_magenta, concrete_orange, concrete_pink, concrete_purple,
            concrete_red, concrete_silver, concrete_white, concrete_yellow,
    //concrete_powder
    concrete_powder_black, concrete_powder_blue, concrete_powder_brown, concrete_powder_cyan, concrete_powder_gray, concrete_powder_green,
            concrete_powder_light_blue, concrete_powder_lime, concrete_powder_magenta, concrete_powder_orange, concrete_powder, pink, concrete_powder_purple,
            concrete_powder_red, concrete_powder_silver, concrete_powder_white, concrete_powder_yellow,
    //glass
    glass_black, glass_blue, glass_brown, glass_cyan, glass_gray, glass_green, glass_light_blue, glass_lime, glass_magenta, glass_orange,

    glass_pink, glass_purple, glass_red, glass_silver, glass_white, glass_yellow,

    // wool
    wool_colored_black, wool_colored_blue,wool_colored_brown,wool_colored_cyan,wool_colored_gray,wool_colored_green,wool_colored_light_blue,wool_colored_lime,wool_colored_magenta,wool_colored_orange,wool_colored_pink,
    wool_colored_purple,wool_colored_red,wool_colored_silver,wool_colored_white,wool_colored_yellow,

    //redstone

    daylight_detector, redstone_lamp, redstone_dust, repeater, door_acacia, door_iron, door_wood, tnt, dispenser, redstone_block, dropper,
            trapdoor, iron_trapdoor, door_birch, door_dark_oak, door_jungle, door_spruce, glowstone, pumpkin_face_on, noteblock,


//decorations

    enchanting_table,
            glass_pane_black, glass_pane_blue, glass_pane_brown, glass_pane_cyan, glass_pane_gray, glass_pane_green, glass_pane_light_blue, glass_pane_lime,
            glass_pane_magenta, glass_pane_orange, glass_pane_pink, glass_pane_purple, glass_pane_red, glass_pane_silver, glass_pane_white, glass_pane_yellow,
            glazed_terracotta_black, glazed_terracotta_blue, glazed_terracotta_brown, glazed_terracotta_cyan, glazed_terracotta_gray, glazed_terracotta_green,
            glazed_terracotta_light_blue, glazed_terracotta_lime, glazed_terracotta_magenta, glazed_terracotta_orange, glazed_terracotta_pink, glazed_terracotta_purple,
            glazed_terracotta_red, glazed_terracotta_silver, glazed_terracotta_white, glazed_terracotta_yellow,
            crafting_table, furnace, anvil, brewing_stand, chest, bed,
            bookshelf, coal_block, diamond_block,
            emerald_block, glass,
            gold_block, iron_block, lapis_block, melon, torch, planks_oak,
            pumpkin, sea_lantern,
            stone_andesite_smooth, stone_diorite_smooth, stone_granite_smooth,
            stonebrick_carved, stonebrick_cracked, stonebrick_mossy, stonebrick, sign, slime,
            planks_acacia, planks_big_oak, planks_birch, planks_jungle, planks_spruce,
    //TODO shulker
    shulker,
//combat

    //tools
    wood_tools, wood_shovel, stone_tools;


//building blocks

    public static float Power = 0.0166666666666667f;


    public static void load() {


        torch = new LightBlock("torch") {{
            requirements(Category.effect, ItemStack.with(MinecraftItems.coal, 1, MinecraftItems.stick, 1));
            radius = 30;
        }};
        sea_lantern = new LightBlock("sea_lantern") {{
            requirements(Category.effect, ItemStack.with(MinecraftItems.sea_lantern, 1));
            radius = 10;
            health = 20;
            consumePower(Power);
        }};

        bed = new Bed("bed") {{
            requirements(Category.effect, ItemStack.with(MinecraftItems.bed, 1));
            unitType = MinecraftMobs.Steve;
            itemCapacity = 1;
            health = 20;
            size = 2;
            alwaysUnlocked = true;
        }};
        iron_block = new Wall("iron_block") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.iron_block, 1));
            health = 20;
        }};

        lapis_block = new Wall("lapis_block") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.lapis_block, 1));
            health = 20;
        }};
        stonebrick = new StaticWall("stonebrick") {{
            variants = 0;
        }};
        gold_block = new Wall("gold_block") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.gold_block, 1));
            health = 20;
        }};

        glass = new Wall("glass") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass, 1));
            health = 20;

        }};
        glass_pink = new Wall("glass_pink") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_pink, 1));
            health = 20;

        }};
        glass_black = new Wall("glass_black") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_black, 1));
            health = 20;
        }};
        glass_blue = new Wall("glass_blue") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_blue, 1));
            health = 20;
        }};
        glass_brown = new Wall("glass_brown") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_brown, 1));
            health = 20;
        }};
        glass_cyan = new Wall("glass_cyan") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_cyan, 1));
            health = 20;
        }};
        glass_gray = new Wall("glass_gray") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_gray, 1));
            health = 20;
        }};
        glass_green = new Wall("glass_green") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_green, 1));
            health = 20;
        }};
        glass_light_blue = new Wall("glass_light_blue") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_light_blue, 1));
            health = 20;
        }};
        glass_lime = new Wall("glass_lime") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_lime, 1));
            health = 20;
        }};
        glass_magenta = new Wall("glass_magenta") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_magenta, 1));
            health = 20;
        }};
        glass_orange = new Wall("glass_orange") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_orange, 1));
            health = 20;
        }};
        glass_purple = new Wall("glass_purple") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_purple, 1));
            health = 20;
        }};
        glass_red = new Wall("glass_red") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_red, 1));
            health = 20;
        }};
        glass_silver = new Wall("glass_silver") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_silver, 1));
            health = 20;
        }};
        glass_white = new Wall("glass_white") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass_white, 1));
            health = 20;
        }};
        glass_yellow = new Wall("glass_yellow") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.glass, 1));
            health = 20;
        }};


        planks_oak_floor = new OverlayFloor("planks_oak_floor") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.planks_oak, 1));
            variants = 0;
            allowCorePlacement = true;
            breakable = alwaysReplace = true;
            alwaysUnlocked = true;

        }};

        planks_big_oak = new Wall("planks_big_oak") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.planks_big_oak, 1));
            health = 20;
        }};

        planks_spruce = new Wall("planks_spruce") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.planks_spruce, 1));
            health = 20;
        }};
        planks_birch = new Wall("planks_birch") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.planks_birch, 1));
            health = 20;
        }};
        planks_jungle = new Wall("planks_jungle") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.planks_jungle, 1));
            health = 20;
        }};
        planks_acacia = new Wall("planks_acacia") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.planks_acacia, 1));
            health = 20;
        }};
        planks_oak = new Wall("planks_oak") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.planks_oak, 1));
            health = 20;
        }};
        sign = new MessageBlock("sign") {{
            requirements(Category.effect, ItemStack.with(MinecraftItems.sign, 1));
        }};

        stone_floor = new Floor("stone_floor") {{
            variants = 0;
            allowCorePlacement = true;
        }};

        gravel = new StaticWall("gravel") {{
            variants = 0;

        }};

    //Region wool
        wool_colored_black = new Wall("wool_colored_black") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_black,1));
            health =20;
        }};
        wool_colored_blue = new Wall("wool_colored_blue") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_blue,1));
            health =20;
        }};
        wool_colored_brown = new Wall("wool_colored_brown") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_brown,1));
            health =20;
        }};
        wool_colored_cyan = new Wall("wool_colored_cyan") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_cyan,1));
            health =20;
        }};
        wool_colored_gray = new Wall("wool_colored_gray") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_gray,1));
            health =20;
        }};
        wool_colored_green = new Wall("wool_colored_green") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_green,1));
            health =20;
        }};
        wool_colored_light_blue = new Wall("wool_colored_light_blue") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_light_blue,1));
            health =20;
        }};
        wool_colored_lime = new Wall("wool_colored_lime") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_lime,1));
            health =20;
        }};
        wool_colored_magenta = new Wall("wool_colored_magenta") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_magenta,1));
            health =20;
        }};
        wool_colored_orange = new Wall("wool_colored_orange") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_orange,1));
            health =20;
        }};
        wool_colored_pink = new Wall("wool_colored_pink") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_pink,1));
            health =20;
        }};
        wool_colored_purple = new Wall("wool_colored_purple") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_purple,1));
            health =20;
        }};
        wool_colored_red = new Wall("wool_colored_red") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_red,1));
            health =20;
        }};
        wool_colored_silver = new Wall("wool_colored_silver") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_silver,1));
            health =20;
        }};
        wool_colored_white = new Wall("wool_colored_white") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_white,1));
            health =20;
        }};
        wool_colored_yellow = new Wall("wool_colored_yellow") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.wool_colored_yellow,1));
            health =20;
        }};
        //redstone

        glowstone = new LightBlock("glowstone") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.glowstone, 1));
            health = 20;
            radius = 15;
        }};
      /*noteblock= new Noteblock("noteblock"){{
              requirments(Category.power, ItemStack.with(MinecraftItems.noteblock, 1));
              health = 20;

          }};*/
        door_spruce = new Door("door_spruce") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.door_spruce, 1));
            health = 20;

            doorSound = Vars.tree.loadSound("open");
        }};
        door_dark_oak = new Door("door_dark_oak") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.door_dark_oak, 1));
            health = 20;
            doorSound = Vars.tree.loadSound("open");
        }};

        daylight_detector = new SolarGenerator("daylight_detector") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.daylight_detector, 1));
            outputsPower = true;
            powerProduction = 0.25f;
        }};
        redstone_block = new PowerGenerator("redstone_block") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.redstone_block, 1));
            outputsPower = true;
            powerProduction = 0.25f;
        }};
        door_jungle = new Door("door_jungle") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.door_jungle, 1));
            health = 20;
            doorSound = Vars.tree.loadSound("open");
        }};
        door_birch = new Door("door_birch") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.door_birch, 1));
            health = 20;
            doorSound = Vars.tree.loadSound("open");
        }};
        iron_trapdoor = new Door("iron_trapdoor") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.iron_trapdoor, 1));
            health = 20;
            doorSound = Vars.tree.loadSound("close1");
        }};
        trapdoor = new Door("trapdoor") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.trapdoor, 1));
            health = 20;
            doorSound = Vars.tree.loadSound("open");
        }};
        redstone_lamp = new LightBlock("redstone_lamp") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.redstone_lamp, 1));
            radius = 15;
            consumePower(Power);
        }};
        repeater = new BeamNode("repeater") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.repeater, 1));
            range = 1;
            consumePowerBuffered(0);
            consumePower(Power);
        }};
        redstone_dust = new BeamNode("redstone_dust") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.redstone_dust, 1));
            range = 1;
            health = 20;
            consumePower(Power);
        }};
        door_wood = new Door("door_wood") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.door_wood, 1));
            health = 20;
            doorSound = Vars.tree.loadSound("open");
        }};

        door_iron = new Door("door_iron") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.door_iron, 1));
            health = 15;
            doorSound = Vars.tree.loadSound("close1");
            envDisabled |= Env.scorching;
        }};

        door_acacia = new Door("door_acacia") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.door_acacia, 1));
            health = 10;
            doorSound = Vars.tree.loadSound("open");
            envDisabled |= Env.scorching;
        }};


        air = new AirBlock("air");
        gravel_floor = new Floor("gravel_floor") {{
            variants = 0;
            walkSound = tree.loadSound("gravel1");
        }};

        chest = new CoreBlock("chest") {{
            requirements(Category.effect, ItemStack.with(MinecraftItems.chest, 1));
            unitType = MinecraftMobs.Steve;
            itemCapacity = 64;
            health = 20;
            size = 1;
            thrusterLength = 34 / 4f;
            alwaysUnlocked = true;
            isFirstTier = true;
        }};

        grass = new Floor("grass") {{
            walkSound = Vars.tree.loadSound("grass1");
            variants = 0;
            allowCorePlacement = true;
        }};

        emerald_block = new Wall("emerald_block") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.emerald_block, 1));
            health = 25;
        }};

        diamond_block = new Wall("diamond_block") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.diamond_block, 1));
            health = 30;
        }};


        sand = new Floor("sand") {{
            itemDrop = MinecraftItems.sand;
            playerUnmineable = true;
            variants = 0;
            allowCorePlacement = true;
        }};

        coal_block = new Wall("coal_block") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.coal_block, 1));
            health = 20;
        }};
        farmland = new Floor("farmland") {{
            variants = 0;
            allowCorePlacement = true;
        }};

        water_still = new Floor("water_still") {{
            speedMultiplier = 0.7f;
            variants = 0;
            ambientSound = Vars.tree.loadSound("water");
            liquidDrop = MinecraftLiquids.water_still;
            isLiquid = true;
            drownTime = 2000f;
        }};

        bookshelf = new Wall("bookshelf") {{
            requirements(Category.defense, ItemStack.with(MinecraftItems.bookshelf, 1));
            health = 20;
        }};

        lava = new Floor("lava") {{
            speedMultiplier = 0.5f;
            variants = 0;
            damageTaken = 0.03f;
            walkSound = Vars.tree.loadSound("lava");
            liquidDrop = MinecraftLiquids.lava;
            ambientSound = Vars.tree.loadSound("lava");
            isLiquid = true;
            drownTime = 200f;
        }};

        stone_granite = new StaticWall("stone_granite") {{
            variants = 0;
            itemDrop = MinecraftItems.stone_granite;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        stone_diorite = new StaticWall("stone_diorite") {{
            variants = 0;
            itemDrop = MinecraftItems.stone_diorite;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        web = new OverlayFloor("web") {{
            speedMultiplier = 0.1f;
            variants = 0;
            breakable = true;
        }};

        stone = new StaticWall("stone") {{
            variants = 0;
            itemDrop = MinecraftItems.cobblestone;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        stone_andesite = new StaticWall("stone_andesite") {{
            variants = 1;
            itemDrop = MinecraftItems.stone_andesite;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        snow = new Floor("snow") {{
            speedMultiplier = 0.75f;
            allowCorePlacement = true;
            variants = 0;
            walkSound = Vars.tree.loadSound("snow1");
        }};

        Bedrock = new Bedrock("bedrock") {{
            variants = 0;
            breakable = alwaysReplace = false;
        }};

        cactus = new Prop("cactus");

        clay = new Floor("clay") {{
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

        coal_ore = new StaticWall("coal_ore") {{
            variants = 0;
            itemDrop = MinecraftItems.coal;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        coarse_dirt = new Floor("coarse_dirt") {{
            variants = 0;
            allowCorePlacement = true;
        }};
        cobblestone_mossy = new StaticWall("cobblestone_mossy") {{
            variants = 0;
        }};
        cobblestone = new Wall("cobblestone") {{
            health = 20;
            size = 1;
        }};

        redstone_ore = new StaticWall("redstone_ore") {{
            variants = 0;
            itemDrop = MinecraftItems.redstone_dust;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        diamond_ore = new StaticWall("diamond_ore") {{
            variants = 0;
            itemDrop = MinecraftItems.diamond;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        emerald_ore = new StaticWall("emerald_ore") {{
            variants = 0;
            itemDrop = MinecraftItems.emerald;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        gold_ore = new StaticWall("gold_ore") {{
            variants = 0;
            itemDrop = MinecraftItems.gold_ore;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        grass_path = new Floor("grass_path") {{
            speedMultiplier = 1.5f;
            allowCorePlacement = true;
            variants = 0;
            walkSound = Vars.tree.loadSound("grass2");
        }};

        hay_block = new StaticWall("hay_block") {{
            variants = 0;
        }};

        iron_ore = new StaticWall("iron_ore") {{
            variants = 0;
            itemDrop = MinecraftItems.iron_ore;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        log_oak = new StaticWall("log_oak") {{
            alwaysUnlocked = true;
            variants = 0;
            itemDrop = MinecraftItems.log_oak;
            localizedName = itemDrop.localizedName;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        lapis_ore = new StaticWall("lapis_ore") {{
            variants = 0;
            itemDrop = MinecraftItems.lapis;
            mapColor.set(itemDrop.color);
            useColor = true;
        }};

        wood_tools = new BeamDrill("wood_tools") {{
            requirements(Category.production, ItemStack.with(MinecraftItems.wood_axe, 1, MinecraftItems.wood_pickaxe, 1));
            drillTime = 300f;
            laser = null;
            alwaysUnlocked = true;
            laserWidth = 0;
            tier = 1;
            size = 1;
            range = 1;
        }};

        stone_tools = new BeamDrill("stone_tools") {{
            requirements(Category.production, ItemStack.with(MinecraftItems.stone_axe, 1, MinecraftItems.stone_pickaxe, 1));
            drillTime = 250f;
            alwaysUnlocked = true;
            tier = 2;
            size = 1;
            range = 1;
        }};

        wood_shovel = new Drill("wooden_shovel") {{
            requirements(Category.production, ItemStack.with(MinecraftItems.wood_shovel, 1));
            tier = 1;
            drillTime = 200;
            alwaysUnlocked = true;
        }};
        tnt = new ShockwaveTower("tnt") {{
            requirements(Category.power, ItemStack.with(MinecraftItems.tnt, 1));
            range = 50;
            alwaysUnlocked = true;
            reload = 50f * 1.5f;
            bulletDamage = 5;
            consumePower(0.0166666666666667f);
        }};


        //TODO import all crafts

        furnace = new MultiCrafter("furnace") {{
            requirements(Category.crafting, ItemStack.with(MinecraftItems.furnace, 1));
            size = 1;
            alwaysUnlocked = true;
            liquidCapacity = 0;
            itemCapacity = 64;
            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.coal, 1, MinecraftItems.iron_ore, 1)),
                                    Seq.with(), 0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.iron_ingot, 1)),
                                    Seq.with()), 600f
                    ),
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.gold_ore, 1, MinecraftItems.coal, 1)),
                                    Seq.with(), 0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.gold_ingot, 1)),
                                    Seq.with()), 600f
                    )
            );

        }};
        anvil = new MultiCrafter("anvil") {{
            requirements(Category.crafting, ItemStack.with(MinecraftItems.anvil, 1));
            liquidCapacity = 0;
            itemCapacity = 2;
            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(
                                            MinecraftItems.planks_acacia, 1
                                    )),
                                    Seq.with(),
                                    0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(
                                            MinecraftItems.planks_oak, 4
                                    )),
                                    Seq.with()),
                            1f
                    )
            );


        }};/*
     brewing_stand = new MultiCrafter("brewing_table"){{
       requirements(Category.crafting,ItemStack.with(MinecraftItems.brewing_stand));
       liquidCapacity=0;
       itemCapacity=5;
            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(
                                            MinecraftItems.planks_acacia,1
                                    )),
                                    Seq.with(),
                                    0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(
                                            MinecraftItems.planks_oak, 4
                                    )),
                                    Seq.with()),
                            1f
                    )
            );


     }};*/
        crafting_table = new MultiCrafter("crafting_table") {{
            requirements(Category.crafting, ItemStack.with(MinecraftItems.crafting_table, 4));
            size = 1;
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
                            1f
                    ),
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.planks_oak, 4)),
                                    Seq.with(), 0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.crafting_table, 1)),
                                    Seq.with()), 1f
                    ),
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.cobblestone, 8)),
                                    Seq.with(), 0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.furnace, 1)),
                                    Seq.with()), 1f
                    ),
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.planks_oak, 2)),
                                    Seq.with(), 0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.stick, 4)),
                                    Seq.with()), 1f
                    ),
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.stick, 2, MinecraftItems.planks_oak, 3)),
                                    Seq.with(), 0),
                            new IOEntry(
                                    Seq.with(ItemStack.with(MinecraftItems.wood_pickaxe, 1)),
                                    Seq.with()), 1f
                    )
            );
        }};
    }
}
