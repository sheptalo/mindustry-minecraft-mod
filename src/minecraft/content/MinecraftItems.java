package minecraft.content;
import arc.graphics.Color;
import mindustry.type.Item;;
public class MinecraftItems {
    public static Item clay,emerald,gold__block,diamond;

    public static void load(){
        clay = new Item("clay", Color.lightGray){{hardness = 1;}};
        diamond = new Item("diamond",Color.blue){{hardness = 3;}};
        emerald = new Item("emerald",Color.green){{hardness = 3;}};
        gold__block = new Item("gold__block",Color.gold){{hardness = 3;}};
    }
}
