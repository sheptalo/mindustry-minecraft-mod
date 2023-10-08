package minecraft.content;

import arc.audio.Music;
import arc.audio.Audio;
import mindustry.Vars;
import arc.struct.Seq;
import arc.files.Fi;

public class MinecraftMusic {
    public static Music
//ambient
            calm1, calm2, calm3, hal1, hal3, hal4, menu1, menu2, piano1, piano2, piano3;
    //boss

    public static void load() {
        calm1 = Vars.tree.loadMusic("Ambient/calm1");
        calm2 = Vars.tree.loadMusic("Ambient/calm2");
        calm3 = Vars.tree.loadMusic("Ambient/calm3");
        hal1 = Vars.tree.loadMusic("Ambient/hal1");
        hal3 = Vars.tree.loadMusic("Ambient/hal3");
        hal4 = Vars.tree.loadMusic("Ambient/hal4");
        menu1 = Vars.tree.loadMusic("menu1");
        menu2 = Vars.tree.loadMusic("menu2");
        piano1 = Vars.tree.loadMusic("piano1");
        piano2 = Vars.tree.loadMusic("piano2");
        piano3 = Vars.tree.loadMusic("piano3");
    }
}