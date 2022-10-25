package minecraft.content;


import mindustry.type.ItemStack;

import static mindustry.content.TechTree.*;
import static mindustry.type.ItemStack.with;
import static minecraft.content.MinecraftBlocks.*;
import static minecraft.content.MinecraftSectors.*;
import static minecraft.content.MinecraftPlanets.*;

public class MinecraftTechTree {
    public static void load(){
       minecraft.techTree = nodeRoot("Minecraft", chest, () -> {
            node(tet,()->{

            });
            node(crafting_table,()->{
                node(furnace,()->{

                });

            });
            nodeProduce(log_oak,()->{

            });
    });
}
}