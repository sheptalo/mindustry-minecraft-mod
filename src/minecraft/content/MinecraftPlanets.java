package minecraft.content;

import arc.graphics.Color;
import mindustry.Vars;
import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.game.Team;
import mindustry.graphics.Pal;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.type.Planet;
import minecraft.type.gen.MinecraftPlanetGenerator;
public class MinecraftPlanets{
    public static Planet minecraft;
    public static void load(){
        minecraft = new Planet("minecraft", Planets.sun, 1f, 2){{
            generator = new MinecraftPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 5);
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, new Color().set(Pal.spore).mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
                    new HexSkyMesh(this, 1, 0.6f, 0.16f, 5, Color.white.cpy().lerp(Pal.spore, 0.55f).a(0.75f), 2, 0.45f, 1f, 0.41f)
            );
            launchCapacityMultiplier = 0.5f;
            sectorSeed = 2;
            allowWaves = true;
            allowWaveSimulation = true;
            allowSectorInvasion = true;
            allowLaunchSchematics = true;
            enemyCoreSpawnReplace = true;
            allowLaunchLoadout = true;
            ruleSetter = r -> {
                r.waveTeam = Team.crux;
                r.placeRangeCheck = false;
            };
            iconColor = Color.green;
            atmosphereColor = Color.valueOf("3c1b8f");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            startSector = 15;
            alwaysUnlocked = true;
            clearSectorOnLose = false;
            defaultCore = MinecraftBlocks.chest;
            hiddenItems.addAll(Items.serpuloItems).addAll(Items.erekirItems).removeAll(MinecraftItems.MinecraftItems);
          unlockedOnLand.add(MinecraftBlocks.chest);
        }};

    }
}