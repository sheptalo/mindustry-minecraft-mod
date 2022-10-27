package minecraft.content;
import arc.*;
import arc.graphics.*;
import arc.math.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;
import static mindustry.Vars.*;
import static mindustry.content.StatusEffects.*;

public class MinecraftEffects {
public static StatusEffect  none,burn,wet;
    public static void load(){

        none = new StatusEffect("none");

        burn = new StatusEffect("burning") {{
            color = Color.valueOf("ffc455");
            damage = 0.167f;
            effect = Fx.burning;
            transitionDamage = 8f;

            init(() -> {
                opposite(wet);
                affinity(tarred, (unit, result, time) -> {
                    unit.damagePierce(transitionDamage);
                    Fx.burning.at(unit.x + Mathf.range(unit.bounds() / 2f), unit.y + Mathf.range(unit.bounds() / 2f));
                    result.set(burning, Math.min(time + result.time, 300f));
                });
            });
        }};

        wet = new StatusEffect("wet"){{
            color = Color.royal;
            speedMultiplier = 0.94f;
            effect = Fx.wet;
            effectChance = 0.09f;
            transitionDamage = 14;

            init(() -> {
                affinity(shocked, (unit, result, time) -> {
                    unit.damagePierce(transitionDamage);
                    if(unit.team == state.rules.waveTeam){
                        Events.fire(Trigger.shock);
                    }
                });
                opposite(wet);
            });
        }};
    }
}
