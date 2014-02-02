package com.openswing.test;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.lwjgl.opengl.Display;

import com.openswing.JGLPanel;

import emergencylanding.k.library.internalstate.ELEntity;
import emergencylanding.k.library.lwjgl.DisplayLayer;
import emergencylanding.k.library.lwjgl.Shapes;
import emergencylanding.k.library.lwjgl.render.Render;
import emergencylanding.k.library.lwjgl.render.VBAO;
import emergencylanding.k.library.lwjgl.render.VertexData;
import emergencylanding.k.library.lwjgl.tex.ColorTexture;
import emergencylanding.k.library.main.KMain;

public class SwingInGL extends KMain {

    static JGLPanel pane = null;
    static VBAO screen_white = null;

    public static void main(String[] args) throws Exception {
        DisplayLayer
                .initDisplay(false, 800, 600, "SwingCompsInGL", false, args);
        while (!Display.isCloseRequested()) {
            DisplayLayer.loop(120);
        }
    }

    @Override
    public void onDisplayUpdate(int delta) {
        screen_white.draw();
        pane.draw_gl();
    }

    @Override
    public void init(String[] args) {
        screen_white = Shapes.getQuad(new VertexData().setXYZ(0, 0, 0),
                new VertexData().setXYZ(800, 600, 0), Shapes.XY).setTexture(
                ColorTexture.WHITE);
        JPanel panel = new JPanel();
        panel.add(new JLabel("OpenGL is rendering this JLabel!"));
        panel.setSize(800, 600);
        pane = new JGLPanel(panel);
        pane.setBackground(Color.red);
        pane.setVisible(true);
        pane.paint(pane.getGraphics());
    }

    @Override
    public void registerRenders(
            HashMap<Class<? extends ELEntity>, Render<? extends ELEntity>> classToRender) {
    }

}
