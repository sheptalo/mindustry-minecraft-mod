package minecraft.world.blocks.environment;

import arc.*;
import arc.audio.Audio;
import arc.audio.Sound;
import arc.files.Fi;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.scene.event.ClickListener;
import arc.scene.event.InputEvent;
import mindustry.graphics.*;
import mindustry.world.*;
import mindustry.Vars;
import mindustry.world.blocks.defense.Door;


public class Noteblock extends Door {

    protected boolean pressed;


    public Noteblock(String name){
        super(name);

        canOverdrive = false;
        drawDisabled = false;
        crushDamageMultiplier = 5f;
    }
/*
    public Sound newSound(Fi file){
        Fi
    }

    public void music(){

        if(pressed){

        }
    }

*/

}
