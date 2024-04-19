package minecraft.world.blocks.environment;

import arc.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import mindustry.graphics.*;
import mindustry.world.blocks.environment.Prop;
import mindustry.world.*;
import mindustry.Vars;

import static mindustry.Vars.state;
import static mindustry.Vars.world;

public class Bedrock extends Prop{
    public TextureRegion large;
    public TextureRegion[][] split;


    public Bedrock(String name){
        super(name);
        breakable = alwaysReplace = false;
        solid = true;
        variants = 2;
        cacheLayer = CacheLayer.walls;
    }
    public boolean canBreak(Tile tile){

    breakable = alwaysReplace = state.rules.infiniteResources;
        return true;
    }
    @Override
    public void load(){
        large = Core.atlas.find(name + "-large");
        super.load();
        split = large.split(32, 32);
    }
    @Override
    public void drawBase(Tile tile){
        int rx = tile.x / 2 * 2;
        int ry = tile.y / 2 * 2;

        if(Core.atlas.isFound(large) && eq(rx, ry) && Mathf.randomSeed(Point2.pack(rx, ry)) < 0.5){
            Draw.rect(split[tile.x % 2][1 - tile.y % 2], tile.worldx(), tile.worldy());
        }else if(variants > 0){
            Draw.rect(variantRegions[Mathf.randomSeed(tile.pos(), 0, Math.max(0, variantRegions.length - 1))], tile.worldx(), tile.worldy());
        }else{
            Draw.rect(region, tile.worldx(), tile.worldy());
        }

        //draw ore on top
        if(tile.overlay().wallOre){
            tile.overlay().drawBase(tile);
        }
    }



    boolean eq(int rx, int ry){
        return rx < world.width() - 1 && ry < world.height() - 1
                && world.tile(rx + 1, ry).block() == this
                && world.tile(rx, ry + 1).block() == this
                && world.tile(rx, ry).block() == this
                && world.tile(rx + 1, ry + 1).block() == this;
    }


}
