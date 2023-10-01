package minecraft.world.blocks.environment;

import arc.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.entities.*;
import mindustry.gen.*;
import mindustry.type.UnitType;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.meta.*;
import minecraft.content.MinecraftMobs;

public class Bed extends CoreBlock {

    public UnitType unitType = MinecraftMobs.Steve;
    public TextureRegion bed;
    public TextureRegion[][] split;

    public Bed(String name){
        super(name);

        solid = true;
        update = true;
        hasItems = true;
        priority = TargetPriority.core;
        flags = EnumSet.of(BlockFlag.core);
        unitCapModifier = 10;
        loopSound = Sounds.respawning;
        loopSoundVolume = 1f;
        drawDisabled = false;
        canOverdrive = false;
        envEnabled |= Env.space;

        //support everything
        replaceable = false;
    }
    @Override
    public void load(){
        bed = Core.atlas.find(name);
        super.load();
        split = bed.split(64, 32);
    }



}
