package com.openswing.test;

import java.util.HashMap;

import org.lwjgl.opengl.Display;

import emergencylanding.k.library.internalstate.ELEntity;
import emergencylanding.k.library.lwjgl.DisplayLayer;
import emergencylanding.k.library.lwjgl.render.Render;
import emergencylanding.k.library.main.KMain;

public class SwingInGL extends KMain {

    public static void main(String[] args) throws Exception {
        DisplayLayer
                .initDisplay(false, 800, 600, "SwingCompsInGL", false, args);
        while (!Display.isCloseRequested()) {
            DisplayLayer.loop(120);
        }
    }

    @Override
    public void onDisplayUpdate(int delta) {
    }

    @Override
    public void init(String[] args) {
    }

    @Override
    public void registerRenders(
            HashMap<Class<? extends ELEntity>, Render<? extends ELEntity>> classToRender) {
    }

}
