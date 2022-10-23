package minecraft;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import minecraft.content.*;
import minecraft.content.MinecraftMaps;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");
        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("port minecraft");
                dialog.cont.add("thanks for downloading").row();
                dialog.cont.image(Core.atlas.find("minecraft-frog")).pad(20f).row();
                dialog.cont.button("ok", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading minecraft");
        MinecraftMusic.load();
        MinecraftItems.load();
        MinecraftLiquids.load();
        MinecraftMobs.load();
        MinecraftBlocks.load();
        MinecraftPlanets.load();
        MinecraftMaps.load();
        MinecraftTechTree.load();
    }

}
