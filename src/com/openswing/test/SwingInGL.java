package com.openswing.test;

import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.lwjgl.opengl.Display;

import com.openswing.JGLPanel;

import emergencylanding.k.library.internalstate.ELEntity;
import emergencylanding.k.library.lwjgl.DisplayLayer;
import emergencylanding.k.library.lwjgl.render.Render;
import emergencylanding.k.library.main.KMain;

public class SwingInGL extends KMain {

    static JGLPanel pane = null;

    public static void main(String[] args) throws Exception {
        DisplayLayer
                .initDisplay(false, 800, 600, "SwingCompsInGL", false, args);
        while (!Display.isCloseRequested()) {
            DisplayLayer.loop(120);
        }
    }

    @Override
    public void onDisplayUpdate(int delta) {
        pane.draw_gl();
    }

    @Override
    public void init(String[] args) {
        JPanel panel = new JPanel();
        panel.add(new JLabel("OpenGL is rendering this JLabel!"));
        panel.setSize(panel.getPreferredSize());
        pane = new JGLPanel(panel);
        pane.setVisible(true);
    }

    @Override
    public void registerRenders(
            HashMap<Class<? extends ELEntity>, Render<? extends ELEntity>> classToRender) {
    }

}
