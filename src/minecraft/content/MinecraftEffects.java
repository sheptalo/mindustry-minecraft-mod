package minecraft.content;

import arc.graphics.*;
import mindustry.content.*;
import mindustry.type.*;

public class MinecraftEffects {
public static StatusEffect  none,burn,wet;
    public static void load(){

        none = new StatusEffect("none");

        burn = new StatusEffect("burning") {{
            color = Color.valueOf("ffc455");
            damage = 0.067f;
            effect = Fx.burning;
            init(() -> {
                opposite(wet);
            });
        }};

        wet = new StatusEffect("wet"){{
            color = Color.royal;
            speedMultiplier = 0.94f;
            effect = Fx.wet;
            effectChance = 0.09f;
            transitionDamage = 14;
            init(() -> {
                opposite(wet);
            });
        }};
    }
}
