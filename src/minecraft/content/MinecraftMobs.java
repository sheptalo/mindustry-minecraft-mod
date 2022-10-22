package minecraft.content;
import mindustry.ai.types.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import arc.graphics.*;
import arc.math.*;
public class MinecraftMobs {
    public static UnitType creeper;
    public static void load(){
    creeper = new UnitType("creeper"){{
        aiController = SuicideAI::new;
        constructor = CrawlUnit::create;
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