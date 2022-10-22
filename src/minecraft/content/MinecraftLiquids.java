package minecraft.content;
import mindustry.type.*;;
public class MinecraftLiquids {
    public static Liquid lava, water_still;

    public static void load(){
        lava = new Liquid("lava");
        water_still = new Liquid("water_still");
    }
}
