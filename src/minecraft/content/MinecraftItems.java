package minecraft.content;
import arc.graphics.Color;
import mindustry.type.Item;;
public class MinecraftItems {
    public static Item clay,emerald,gold_ore,iron_ore,coal,lapis,diamond;

    public static void load(){
        clay = new Item("clay", Color.lightGray){{hardness = 1;}};
        diamond = new Item("diamond",Color.blue){{hardness = 3;}};
        emerald = new Item("emerald",Color.green){{hardness = 3;}};
        gold_ore = new Item("gold_ore",Color.gold){{hardness = 3;}};
        iron_ore = new Item("iron_ore",Color.gray){{hardness = 2;}};
        coal = new Item("coal",Color.black){{hardness = 1;}};
        lapis = new Item("lapis", Color.blue){{hardness = 2;}};
    }
}
