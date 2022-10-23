package minecraft.content;

import mindustry.type.*;
import static minecraft.content.MinecraftPlanets.*;
public class MinecraftSectors {
    public static SectorPreset tet;

    public static void load(){

        tet = new SectorPreset("tet",minecraft,15){{
            difficulty = 1;
            alwaysUnlocked = true;
            addStartingItems = true;
        }};

    }
}