package minecraft.content;

import arc.graphics.*;
import arc.util.*;
import mindustry.Vars;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.weather.*;
import mindustry.world.meta.*;

public class MinecraftWeather {
    public static Weather
            rain, snow, sandstorm, fog;

    public static void load() {
        snow = new ParticleWeather("snow") {{
            particleRegion = "particle";
            sizeMax = 13f;
            sizeMin = 2.6f;
            density = 1200f;
            attrs.set(Attribute.light, -0.15f);

            sound = Sounds.windhowl;
            soundVol = 0f;
            soundVolOscMag = 1.5f;
            soundVolOscScl = 1100f;
            soundVolMin = 0.02f;
        }};

        rain = new RainWeather("MineRain") {{
            attrs.set(Attribute.light, -0.2f);
            sound = Vars.tree.loadSound("rain2");
            soundVol = 0.3f;
        }};

        sandstorm = new ParticleWeather("Minesandstorm") {{
            color = noiseColor = Color.valueOf("f7cba4");
            particleRegion = "particle";
            drawNoise = true;
            useWindVector = true;
            sizeMax = 140f;
            sizeMin = 70f;
            minAlpha = 0f;
            maxAlpha = 0.2f;
            density = 1500f;
            baseSpeed = 5.4f;
            attrs.set(Attribute.light, -0.1f);
            opacityMultiplier = 0.35f;
            force = 0.1f;
            duration = 7f * Time.toMinutes;

        }};

        fog = new ParticleWeather("MineFog"){{
            duration = 15f * Time.toMinutes;
            noiseLayers = 3;
            noiseLayerAlphaM = 0.7f;
            noiseLayerSpeedM = 2f;
            noiseLayerSclM = 0.6f;
            baseSpeed = 0.05f;
            color = noiseColor = Color.grays(0.4f);
            noiseScale = 1100f;
            noisePath = "fog";
            drawParticles = false;
            drawNoise = true;
            useWindVector = false;
            xspeed = 1f;
            yspeed = 0.01f;
            attrs.set(Attribute.light, -0.3f);
            opacityMultiplier = 0.47f;
        }};

    }
}