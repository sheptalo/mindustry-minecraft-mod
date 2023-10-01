package minecraft;

import arc.util.*;
import mindustry.mod.*;
import minecraft.content.*;
import minecraft.content.MinecraftSectors;

public class ExampleJavaMod extends Mod{




    //  public ExampleJavaMod(){
 //       Events.on(ClientLoadEvent.class, e -> {
  //          Time.runTask(10f, () -> {
   //             BaseDialog dialog = new BaseDialog("port of minecraft");
   //             dialog.cont.add("thanks for downloading").row();
   //             dialog.cont.image(Core.atlas.find("minecraft-frog")).pad(20f).row();
    //            dialog.cont.button("ok", dialog::hide).size(100f, 50f);
     //           dialog.show();
      //      });
       // });
   // }
    @Override
    public void loadContent(){
        Log.info("Loading minecraft");
        MinecraftEffects.load();
        MinecraftItems.load();
        MinecraftLiquids.load();
        MinecraftMobs.load();
        MinecraftBlocks.load();
        MinecraftPlanets.load();
       MinecraftSectors.load();
        MinecraftTechTree.load();
        MinecraftWeather.load();
        MinecraftMusic.load();
        Log.info("loaded succesful");
    }

}
