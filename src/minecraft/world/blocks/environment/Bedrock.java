package minecraft.world.blocks.environment;

import arc.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import mindustry.graphics.*;
import mindustry.world.*;
import mindustry.Vars;
import minecraft.world.blocks.environment.*;
public class Bedrock extends Prop{
    public TextureRegion[][] split;

    public Bedrock(String name){
        super(name);
        breakable = alwaysReplace = false;
        solid = true;
        variants = 0;
        cacheLayer = CacheLayer.walls;
    }



    @Override
    public boolean canBreak(Tile tile){
        return Vars.state.rules.infiniteResources;
    }

    @Override
    public void drawBase(Tile tile){
    }
}
