package minecraft.content;

import mindustry.type.SectorPreset;

import static minecraft.content.MinecraftPlanets.Minecraft;

public  class MinecraftMaps {
    public static SectorPreset test;

    public static void load(){
        test = new SectorPreset("test",Minecraft,15){{
            difficulty = 1;
            alwaysUnlocked = true;
            addStartingItems = true;
        }};

    }
}