package minecraft.content;


import static mindustry.content.TechTree.*;
import static minecraft.content.MinecraftBlocks.*;
import static minecraft.content.MinecraftSectors.*;
import static minecraft.content.MinecraftPlanets.*;

public class MinecraftTechTree {
    public static void load(){
       minecraft.techTree = nodeRoot("Minecraft", chest, () -> {
            node(tet,()->{

            });
            node(crafting_table,()->{

            });
    });
}
}