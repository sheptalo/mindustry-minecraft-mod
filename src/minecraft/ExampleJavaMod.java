package minecraft;

import arc.Events;
import arc.util.*;
import mindustry.mod.*;
import minecraft.content.*;
import minecraft.content.MinecraftSectors;
import minecraft.type.audio.MusicHandler;

public class ExampleJavaMod extends Mod{




      public ExampleJavaMod(){

      }
    @Override
    public void loadContent(){
        Log.info("Loading minecraft");
        MinecraftEffects.load();
        MinecraftItems.load();
        MinecraftLiquids.load();
        MinecraftMobs.load();
        MinecraftBlocks.load();
        MinecraftPlanets.load();
       MinecraftSectors.load();
        MinecraftTechTree.load();
        MinecraftWeather.load();
        MinecraftMusic.load();
        Log.info("loaded succesful");
    }

}
