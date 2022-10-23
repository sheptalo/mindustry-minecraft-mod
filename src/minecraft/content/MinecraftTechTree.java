package minecraft.content;

import arc.struct.*;
import mindustry.game.Objectives.*;
import mindustry.type.ItemStack;


import static mindustry.content.TechTree.*;
import static minecraft.content.MinecraftBlocks.*;
import static minecraft.content.MinecraftMaps.test;
import static minecraft.content.MinecraftPlanets.Minecraft;

public class MinecraftTechTree {
    public static void load(){
        Minecraft.techTree = nodeRoot("Minecraft", chest, () -> {
            node(test,()->{

            });
            node(crafting_table,()->{

            });
    });
}
}