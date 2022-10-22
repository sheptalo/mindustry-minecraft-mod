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

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("port minecraft");
                dialog.cont.add("thanks for downloading").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("minecraft-icon")).pad(20f).row();
                dialog.cont.button("ok", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading minecraft");
        MinecraftItems.load();
        MinecraftLiquids.load();
        MinecraftBlocks.load();
    }

}
