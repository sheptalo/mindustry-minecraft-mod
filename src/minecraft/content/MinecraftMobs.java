package minecraft.content;
import mindustry.ai.types.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import arc.graphics.*;
import arc.math.*;
import mindustry.Vars;
public class MinecraftMobs {
    public static UnitType creeper,steve;
    public static void load(){
    creeper = new UnitType("creeper"){{
        aiController = SuicideAI::new;
        constructor = MechUnit::create;
        speed = 0.5f;
        hitSize = 8f;
        health = 20;
        mechSideSway = 0.25f;
        range = 40f;
        ammoType = new ItemAmmoType(Items.coal);

        weapons.add(new Weapon(){{
            shootOnDeath = true;
            reload = 50f;
            shootCone = 180f;
            ejectEffect = Fx.none;
            shootSound = Vars.tree.loadSound("explode1");
            x = shootY = 0f;
            mirror = false;
            bullet = new BulletType(){{
                collidesTiles = false;
                collides = false;
                hitSound = Vars.tree.loadSound("hit1");

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
        steve = new UnitType("steve"){{
            constructor = MechUnit::create;
            aiController = BuilderAI::new;
            mineWalls = true;
            mineFloor = true;
            mineSpeed = 6.5f;
            mineTier = 1;
            buildSpeed = 0.5f;
            alwaysUnlocked=true;
            speed = 0.5f;
            hitSize = 8f;
            health = 20;
            mechSideSway = 0.25f;
            range = 40f;
            ammoType = new ItemAmmoType(Items.coal);

            weapons.add(new Weapon("hand"){{
                reload = 20f;
                x = 2.75f;
                y = 1f;
                top = false;
                ejectEffect = Fx.casing1;

                bullet = new BasicBulletType(4, 1){{
                    width = 7f;
                    height = 9f;
                    lifetime = 1;
                    shootEffect = Fx.shootSmall;
                    smokeEffect = Fx.shootSmallSmoke;
                    buildingDamageMultiplier = 0.01f;
                    hitSound = Vars.tree.loadSound("hit2");
                }};
            }});
        }};
    }
}