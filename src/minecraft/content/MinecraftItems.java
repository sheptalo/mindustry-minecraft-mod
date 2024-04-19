package minecraft.content;
import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;
public class MinecraftItems {
    public static Item redstone_lamp,clay,repeater, planks_oak,stone_diorite,stone_granite,
    emerald,wood_axe,stone_andesite,cobblestone,wood_pickaxe,wood_sword,wood_shovel,redstone_dust,stone_axe,stone_pickaxe,
    stone_sword,gold_ore,iron_ore,log_oak,coal,lapis,diamond,bookshelf,sand, daylight_detector,diamond_block,door_acacia,door_iron,
    emerald_block,glass_purple,glass_red,glass_silver,glass_white,door_spruce,
    glass_light_blue,glass_lime,glass_magenta,glass_orange,glowstone,
            wool_colored_black, wool_colored_blue,wool_colored_brown,wool_colored_cyan,wool_colored_gray,wool_colored_green,wool_colored_light_blue,wool_colored_lime,wool_colored_magenta,wool_colored_orange,wool_colored_pink,
            wool_colored_purple,wool_colored_red,wool_colored_silver,wool_colored_white,wool_colored_yellow,
    crafting_table,furnace,chest,sign,stick,door_dark_oak,door_wood,gold_ingot,iron_ingot,tnt,coal_block,gold_block,glass,lapis_block,iron_block,
    glass_black,glass_blue,glass_brown,glass_cyan,glass_gray,glass_green,
    door_jungle,door_birch,iron_trapdoor,anvil,brewing_stand,glass_pink,
    bed,sea_lantern,planks_big_oak,planks_spruce,planks_birch,trapdoor,planks_jungle,planks_acacia,redstone_block ;
    public static final Seq<Item> MinecraftItems = new Seq<>();
    public static Item hardened_clay, hardened_clay_stained_black, hardened_clay_stained_blue, hardened_clay_stained_brown,
            hardened_clay_stained_orange, hardened_clay_stained_magenta, hardened_clay_stained_cyan, hardened_clay_stained_gray,
            hardened_clay_stained_green, hardened_clay_stained_light_blue, hardened_clay_stained_lime, hardened_clay_stained_white,
            hardened_clay_stained_pink, hardened_clay_stained_purple, hardened_clay_stained_red, hardened_clay_stained_silver,
            hardened_clay_stained_yellow;

    public static void load(){
        hardened_clay = new Item("hardened_clay", Color.cyan);
        hardened_clay_stained_black = new Item("hardened_clay_stained_black", Color.black);
        hardened_clay_stained_blue = new Item("hardened_clay_stained_blue", Color.blue);
        hardened_clay_stained_brown = new Item("hardened_clay_stained_brown", Color.brown);
        hardened_clay_stained_orange = new Item("hardened_clay_stained_orange", Color.orange);
        hardened_clay_stained_magenta = new Item("hardened_clay_stained_magenta", Color.magenta);
        hardened_clay_stained_cyan = new Item("hardened_clay_stained_cyan", Color.cyan);
        hardened_clay_stained_gray = new Item("hardened_clay_stained_gray", Color.gray);
        hardened_clay_stained_green = new Item("hardened_clay_stained_green", Color.green);
        hardened_clay_stained_light_blue = new Item("hardened_clay_stained_light_blue", Color.blue);
        hardened_clay_stained_lime = new Item("hardened_clay_stained_lime", Color.lime);
        hardened_clay_stained_white = new Item("hardened_clay_stained_white", Color.white);
        hardened_clay_stained_pink = new Item("hardened_clay_stained_pink", Color.pink);
        hardened_clay_stained_purple = new Item("hardened_clay_stained_purple", Color.purple);
        hardened_clay_stained_red = new Item("hardened_clay_stained_red", Color.red);
        hardened_clay_stained_silver = new Item("hardened_clay_stained_silver", Color.gray);
        hardened_clay_stained_yellow = new Item("hardened_clay_stained_yellow", Color.yellow);
        wool_colored_black = new Item("wool_colored_black",Color.black);
        wool_colored_blue = new Item("wool_colored_blue",Color.blue);
        wool_colored_brown = new Item("wool_colored_brown",Color.brown);
        wool_colored_cyan = new Item("wool_colored_cyan",Color.cyan);
        wool_colored_gray = new Item("wool_colored_gray",Color.gray);
        wool_colored_green = new Item("wool_colored_green",Color.green);
        wool_colored_light_blue = new Item("wool_colored_light_blue",Color.valueOf("#ADD8E6"));
        wool_colored_lime = new Item("wool_colored_lime",Color.lime);
        wool_colored_magenta = new Item("wool_colored_magenta",Color.magenta);
        wool_colored_orange = new Item("wool_colored_orange",Color.orange);
        wool_colored_pink = new Item("wool_colored_pink",Color.pink);
        wool_colored_purple = new Item("wool_colored_purple",Color.purple);
        wool_colored_red = new Item("wool_colored_red",Color.red);
        wool_colored_silver = new Item("wool_colored_silver",Color.valueOf("#c0c0c0"));
        wool_colored_white = new Item("wool_colored_white",Color.white);
        wool_colored_yellow = new Item("wool_colored_yellow",Color.yellow);
        door_dark_oak = new Item("door_dark_oak",Color.brown);
        door_spruce = new Item("door_spruce",Color.brown);
        glowstone = new Item("glowstone",Color.yellow);
        glass_white = new Item("glass_white",Color.white);
        glass_silver = new Item("glass_silver",Color.lightGray);
        glass_red = new Item("glass_red",Color.red);
        glass_purple = new Item("glass_purple",Color.purple);
        glass_orange = new Item("glass_orange",Color.orange);
        glass_magenta = new Item("glass_magenta",Color.magenta);
        glass_lime = new Item("glass_lime",Color.lime);
        glass_light_blue = new Item("glass_light_blue",Color.blue);
        glass_green = new Item("glass_green",Color.green);
        glass_gray= new Item("glass_gray",Color.gray);
        glass_cyan = new Item("glass_cyan",Color.cyan);
        glass_brown = new Item("glass_brown",Color.brown);
        glass_blue = new Item("glass_blue",Color.blue);
        glass_black = new Item("glass_black",Color.black);
        glass_pink = new Item("glass_pink",Color.white);
        brewing_stand = new Item("brewing_stand",Color.gray);
        anvil = new Item("anvil",Color.gray);
        iron_trapdoor = new Item("iron_trapdoor",Color.white);
        door_birch = new Item("door_birch",Color.gold);
        door_jungle = new Item("door_jungle",Color.yellow);
        trapdoor = new Item("trapdoor",Color.brown);
        redstone_block = new Item("redstone_block",Color.red);
        planks_acacia = new Item("planks_acacia",Color.orange);
        planks_jungle = new Item("planks_jungle",Color.orange);
        planks_birch = new Item("planks_birch",Color.yellow);
        planks_big_oak = new Item("planks_big_oak",Color.brown);
        planks_spruce = new Item("planks_spruce", Color.brown);
        sea_lantern = new Item("sea-lantern",Color.coral);
        repeater = new Item("repeater",Color.red);
        bed = new Item("bed",Color.red);
        iron_block = new Item("iro_block",Color.gray);
        lapis_block = new Item("lapis_block",Color.blue);
        glass = new Item("glass",Color.white);
        gold_block = new Item("gold_block",Color.gold);
        gold_ingot = new Item("gold_ingot",Color.gold);
        iron_ingot = new Item("iron_ingot",Color.gray);
        redstone_lamp = new Item("redstone_lamp",Color.orange);
        clay = new Item("clay", Color.lightGray){{hardness = 1;}};
        diamond = new Item("diamond",Color.blue){{hardness = 3;}};
        emerald = new Item("emerald",Color.green){{hardness = 3;}};
        gold_ore = new Item("gold_ore",Color.gold){{hardness = 3;}};
        iron_ore = new Item("iron_ore",Color.gray){{hardness = 2;}};
        coal = new Item("coal",Color.black){{hardness = 1;}};
        lapis = new Item("lapis", Color.blue){{hardness = 2;}};
        log_oak = new Item("log_oak", Color.brown){{hardness = 1;}};
        wood_axe = new Item("wood_axe", Color.brown);
        wood_pickaxe = new Item("wood_pickaxe",Color.brown);
        wood_sword = new Item("wood_sword",Color.brown);
        stone_axe = new Item("stone_axe", Color.gray);
        stone_pickaxe = new Item("stone_pickaxe",Color.gray);
        stone_sword = new Item("stone_sword",Color.gray);
        redstone_dust = new Item("redstone_dust",Color.red){{hardness = 2;}};
        cobblestone = new Item("cobblestone",Color.lightGray){{hardness = 1;}};
        stone_andesite = new Item("stone_andesite",Color.acid){{hardness = 1;}};
        planks_oak = new Item("planks_oak",Color.brown);
        stone_diorite = new Item("stone_diorite", Color.crimson){{hardness = 1;}};
        stone_granite = new Item("stone_granite", Color.crimson){{hardness = 1;}};
        bookshelf = new Item("bookshelf", Color.brick);
        wood_shovel = new Item("wood_shovel", Color.brown);
        sand = new Item("sand",Color.yellow){{hardness = 1;}};
        daylight_detector = new Item("daylight_detector",Color.darkGray);
        diamond_block = new Item("diamond_block", Color.sky);
        door_acacia = new Item("door_acacia",Color.royal);
        door_iron = new Item("door_iron");
        emerald_block = new Item("emerald_block",Color.green);
        crafting_table = new Item("crafting_table",Color.brown);
        furnace = new Item("furnace", Color.lightGray);
        chest = new Item("chest",Color.brown);
        sign = new Item("sign",Color.brown);
        stick = new Item("stick",Color.brown);
        door_wood = new Item("door_wood",Color.brown);
        tnt = new Item("tnt",Color.red);
        coal_block = new Item("coal_block",Color.black);

        MinecraftItems.addAll(redstone_lamp,clay,repeater, planks_oak,stone_diorite,stone_granite,wool_colored_black,
                wool_colored_blue,wool_colored_brown,wool_colored_cyan,wool_colored_gray,wool_colored_green,
                wool_colored_light_blue,wool_colored_lime,wool_colored_magenta,wool_colored_orange,wool_colored_pink,
                wool_colored_purple,wool_colored_red,wool_colored_silver,wool_colored_white,wool_colored_yellow,
                emerald,wood_axe,stone_andesite,cobblestone,wood_pickaxe,wood_sword,wood_shovel,redstone_dust,stone_axe,stone_pickaxe,
                stone_sword,gold_ore,iron_ore,log_oak,coal,lapis,diamond,bookshelf,sand, daylight_detector,diamond_block,door_acacia,door_iron,
                emerald_block,glass_purple,glass_red,glass_silver,glass_white,door_spruce,
                glass_light_blue,glass_lime,glass_magenta,glass_orange,glowstone,
                crafting_table,furnace,chest,sign,stick,door_dark_oak,door_wood,gold_ingot,iron_ingot,tnt,coal_block,gold_block,
                glass,lapis_block,iron_block,
                glass_black,glass_blue,glass_brown,glass_cyan,glass_gray,glass_green,
                door_jungle,door_birch,iron_trapdoor,anvil,brewing_stand,glass_pink,
                bed,sea_lantern,planks_big_oak,planks_spruce,planks_birch,trapdoor,planks_jungle,planks_acacia,redstone_block,
                hardened_clay, hardened_clay_stained_black, hardened_clay_stained_blue, hardened_clay_stained_brown,
                hardened_clay_stained_orange, hardened_clay_stained_magenta, hardened_clay_stained_cyan, hardened_clay_stained_gray,
                hardened_clay_stained_green, hardened_clay_stained_light_blue, hardened_clay_stained_lime, hardened_clay_stained_white,
                hardened_clay_stained_pink, hardened_clay_stained_purple, hardened_clay_stained_red, hardened_clay_stained_silver,
                hardened_clay_stained_yellow);
    }
}
