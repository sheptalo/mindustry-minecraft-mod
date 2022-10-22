package minecraft.world.blocks.environment;

import arc.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import mindustry.graphics.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.*;
import static mindustry.Vars.*;
import mindustry.Vars;
import minecraft.world.blocks.environment.*;

public class Bedrock extends MineProp{
    public TextureRegion[][] split;

    public Bedrock(String name){
        super(name);
        breakable = alwaysReplace = false;
        solid = true;
        variants = 2;
        cacheLayer = CacheLayer.walls;
    }

    @Override
    public void drawBase(Tile tile){
        //draw ore on top
        if(tile.overlay().wallOre){
            tile.overlay().drawBase(tile);
        }
    }


    @Override
    public boolean canBreak(Tile tile){
        return Vars.state.rules.infiniteResources;
    }

    boolean eq(int rx, int ry){
        return rx < world.width() - 1 && ry < world.height() - 1
            && world.tile(rx + 1, ry).block() == this
            && world.tile(rx, ry + 1).block() == this
            && world.tile(rx, ry).block() == this
            && world.tile(rx + 1, ry + 1).block() == this;
    }
}
