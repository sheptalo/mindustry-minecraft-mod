package minecraft.content;
import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;
public class MinecraftItems {
    public static Item clay, planks_oak,stone_diorite,stone_granite,
    emerald,wood_axe,stone_andesite,cobblestone,wood_pickaxe,wood_sword,wood_shovel,redstone_dust,stone_axe,stone_pickaxe,
    stone_sword,gold_ore,iron_ore,log_oak,coal,lapis,diamond,bookshelf,sand, daylight_detector,diamond_block,door_acacia,door_iron,
    emerald_block,crafting_table,furnace,chest,sign,stick,door_wood,gold_ingot,iron_ingot,tnt,coal_block,gold_block,glass,lapis_block,iron_block,
    bed;
    public static final Seq<Item> MinecraftItems = new Seq<>();

    public static void load(){
        bed = new Item("bed",Color.red);
        iron_block = new Item("iro_block",Color.gray);
        lapis_block = new Item("lapis_block",Color.blue);
        glass = new Item("glass",Color.white);
        gold_block = new Item("gold_block",Color.gold);
        gold_ingot = new Item("gold_ingot",Color.gold);
        iron_ingot = new Item("iron_ingot",Color.gray);
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

        MinecraftItems.addAll(clay, planks_oak,stone_diorite,stone_granite,
                emerald,wood_axe,stone_andesite,cobblestone,wood_pickaxe,wood_sword,wood_shovel,
                redstone_dust,stone_axe,stone_pickaxe,
                stone_sword,gold_ore,iron_ore,log_oak,coal,lapis,diamond,bookshelf,sand,
                daylight_detector,diamond_block,door_acacia,door_iron,
                emerald_block,crafting_table,furnace,chest,sign,stick,door_wood,gold_ingot,
                iron_ingot,tnt,coal_block,glass,gold_block,lapis_block,bed);
    }
}
