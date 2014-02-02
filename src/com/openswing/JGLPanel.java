package com.openswing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * A {@link JPanel} that uses {@link OpenGLGraphics} to draw.
 * 
 * @author Kenzie Togami
 */
public class JGLPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private OpenGLGraphics graph = null;

    /**
     * Draws the given contents. Uses the layout manager and double buffering
     * mode from <tt>contents</tt>.
     * 
     * @param contents
     *            - the original JComponent
     */
    public JGLPanel(JComponent contents) {
        super(contents.getLayout(), contents.isDoubleBuffered());
        setSize(contents.getSize());
        setPreferredSize(contents.getPreferredSize());
        setMaximumSize(contents.getMaximumSize());
        setMinimumSize(contents.getMinimumSize());
        graph = new OpenGLGraphics(getWidth(), getHeight());
        add(contents);
    }

    @Override
    public void update(Graphics g) {
        g = getGraphics();
        super.update(g);
    }

    @Override
    public void paintAll(Graphics g) {
        g = getGraphics();
        super.paintAll(g);
    }

    @Override
    public void paint(Graphics g) {
        g = getGraphics();
        super.paint(g);
    }

    @Override
    public void printAll(Graphics g) {
        g = getGraphics();
        super.printAll(g);
    }

    @Override
    public void print(Graphics g) {
        g = getGraphics();
        super.print(g);
    }

    @Override
    public Graphics getGraphics() {
        Color pre = graph.getColor();
        graph.setColor(graph.getBackground());
        graph.fillRect(0, 0, getWidth(), getHeight());
        graph.setColor(pre);
        return graph;
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        if (graph != null) {
            graph.setBackground(bg);
        }
    }

    public void draw_gl() {
        graph.draw_gl();
    }
}
