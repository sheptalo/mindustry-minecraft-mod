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

    protected Planet Minecraft;

    protected SoundControl control = Vars.control.sound;

    public MusicHandler(){
        Events.on(ClientLoadEvent.class, e -> reload());
        //change the music to modded OST
        Events.on(WorldLoadEvent.class, e -> {
            Sector sector = state.rules.sector;
            if (sector != null) Minecraft = sector.planet;
            else return;

            if (Minecraft == MinecraftPlanets.Minecraft) {
                control.ambientMusic = control.darkMusic = MinecraftAmbient;
            }
        });
  /*  TODO    Events.on(WaveEvent.class, e -> {
            SpawnGroup boss = state.rules.spawns.find(group -> group.getSpawned(state.wave - 2) > 0 && group.effect == StatusEffects.boss);
            if (boss == null) return;

      TODO      if (boss.type == MinecraftMobs.creeper) {
                control.bossMusic = Seq.with(MinecraftMusic.nuance1);
            } else {
                control.bossMusic = vBoss;
            }
        });*/
        //this should hopefully reset the music back to vanilla
        Events.on(StateChangeEvent.class, e -> {
            if (Minecraft == MinecraftPlanets.Minecraft) return;

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