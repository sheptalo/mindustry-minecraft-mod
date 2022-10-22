package minecraft.content;
import mindustry.ai.types.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;
public class MinecraftMobs {
    public static UnitType creeper;
    public static void load(){
    creeper = new UnitType("crawler"){{
        aiController = SuicideAI::new;

        speed = 0.5f;
        hitSize = 8f;
        health = 20;
        mechSideSway = 0.25f;
        range = 40f;
        ammoType = new ItemAmmoType(Items.coal);

        weapons.add(new Weapon(){{
            shootOnDeath = true;
            reload = 24f;
            shootCone = 180f;
            ejectEffect = Fx.none;
            shootSound = Sounds.explosion;
            x = shootY = 0f;
            mirror = false;
            bullet = new BulletType(){{
                collidesTiles = false;
                collides = false;
                hitSound = Sounds.explosion;

                rangeOverride = 30f;
                hitEffect = Fx.pulverize;
                speed = 0f;
                splashDamageRadius = 50f;
                instantDisappear = true;
                splashDamage = 10f;
                killShooter = true;
                hittable = false;
                collidesAir = true;
            }};
        }});
    }};
    }
}