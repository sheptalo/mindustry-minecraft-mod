package minecraft.content;

import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.game.Team;
import mindustry.graphics.g3d.HexMesh;
import mindustry.type.Planet;
import minecraft.type.gen.MinecraftPlanetGenerator;
public class MinecraftPlanets{
    public static Planet Minecraft;
    public static void load(){
        Minecraft = new Planet("Minecraft", Planets.sun, 1f, 2){{
            generator = new MinecraftPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 5);

            launchCapacityMultiplier = 0.5f;
            sectorSeed = 2;
            allowWaves = true;
            allowWaveSimulation = true;
            allowSectorInvasion = true;
            allowLaunchSchematics = true;
            enemyCoreSpawnReplace = true;
            prebuildBase = false;
            ruleSetter = r -> {
                r.waveTeam = Team.crux;
                r.placeRangeCheck = false;
            };
            atmosphereColor = Color.valueOf("696276");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            startSector = 15;
            alwaysUnlocked = true;
            clearSectorOnLose = false;
            defaultCore = MinecraftBlocks.chest;
      //      hiddenItems.addAll(MinecraftBlocks.Bedrock).removeAll(Items.serpuloItems);
          unlockedOnLand.add(MinecraftBlocks.chest,MinecraftMaps.test);
        }};

    }
}