package minecraft.type.audio;

import arc.*;
import arc.audio.*;
import arc.struct.*;
import minecraft.content.*;
import mindustry.Vars;
import mindustry.audio.SoundControl;
import mindustry.content.StatusEffects;
import mindustry.game.SpawnGroup;
import mindustry.type.*;

import static mindustry.game.EventType.*;
import static mindustry.Vars.state;

public class MusicHandler {
    public Seq<Music> MinecraftAmbient = new Seq<>();

    public Seq<Music> vAmbient, vDark, vBoss;

    protected Planet minecraft;

    protected SoundControl control = Vars.control.sound;

    public MusicHandler(){
        Events.on(ClientLoadEvent.class, e -> reload());
        //change the music to modded OST
        Events.on(WorldLoadEvent.class, e -> {
            Sector sector = state.rules.sector;
            if (sector != null) minecraft = sector.planet;
            else return;

            if (minecraft == MinecraftPlanets.minecraft) {
                control.ambientMusic = MinecraftAmbient;
            }
        });
        //this should hopefully reset the music back to vanilla
        Events.on(StateChangeEvent.class, e -> {
            if (minecraft == MinecraftPlanets.minecraft) return;

            control.ambientMusic = vAmbient;
            control.darkMusic = vDark;
            control.bossMusic = vBoss;
        });
    }

    public void reload(){
        MinecraftAmbient = Seq.with(MinecraftMusic.calm1,MinecraftMusic.calm2,MinecraftMusic.calm3,MinecraftMusic.hal1
        ,MinecraftMusic.hal2,MinecraftMusic.hal3,MinecraftMusic.hal4,MinecraftMusic.piano1,MinecraftMusic.piano2,MinecraftMusic.piano3);

        vAmbient = control.ambientMusic;
        vDark = control.darkMusic;
        vBoss = control.bossMusic;
    }
}