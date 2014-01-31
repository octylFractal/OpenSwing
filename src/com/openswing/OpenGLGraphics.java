package com.openswing;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

import emergencylanding.k.library.lwjgl.Shapes;
import emergencylanding.k.library.lwjgl.render.VBAO;
import emergencylanding.k.library.lwjgl.render.VertexData;
import emergencylanding.k.library.lwjgl.tex.BufferedTexture;

public class OpenGLGraphics extends Graphics2D {
    private BufferedImage swingData = null;
    private Graphics2D graphics = null;
    private VBAO renderer = null;
    private BufferedTexture currentTex = null;

    public OpenGLGraphics(int width, int height) {
        swingData = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        graphics = swingData.createGraphics();
        renderer = Shapes.getQuad(new VertexData().setXYZ(0, height, 0),
                new VertexData().setXYZ(width, 0, 0), Shapes.XY);
        update_gl();
    }

    @Override
    public void draw(Shape s) {
        graphics.draw(s);
        update_gl();
    }

    @Override
    public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
        boolean ret = graphics.drawImage(img, xform, obs);
        update_gl();
        return ret;
    }

    @Override
    public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
        graphics.drawImage(img, op, x, y);
        update_gl();
    }

    @Override
    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
        graphics.drawRenderedImage(img, xform);
        update_gl();
    }

    @Override
    public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
        graphics.drawRenderableImage(img, xform);
        update_gl();
    }

    @Override
    public void drawString(String str, int x, int y) {
        graphics.drawString(str, x, y);
        update_gl();
    }

    @Override
    public void drawString(String str, float x, float y) {
        graphics.drawString(str, x, y);
        update_gl();
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, int x, int y) {
        graphics.drawString(iterator, x, y);
        update_gl();
    }

    @Override
    public void drawString(AttributedCharacterIterator iterator, float x,
            float y) {
        graphics.drawString(iterator, x, y);
        update_gl();
    }

    @Override
    public void drawGlyphVector(GlyphVector g, float x, float y) {
        graphics.drawGlyphVector(g, x, y);
        update_gl();
    }

    @Override
    public void fill(Shape s) {
        graphics.fill(s);
        update_gl();
    }

    @Override
    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
        boolean hit = graphics.hit(rect, s, onStroke);
        update_gl();
        return hit;
    }

    @Override
    public GraphicsConfiguration getDeviceConfiguration() {
        GraphicsConfiguration g = graphics.getDeviceConfiguration();
        update_gl();
        return g;
    }

    @Override
    public void setComposite(Composite comp) {
        update_gl();
    }

    @Override
    public void setPaint(Paint paint) {
        update_gl();
    }

    @Override
    public void setStroke(Stroke s) {
        update_gl();
    }

    @Override
    public void setRenderingHint(Key hintKey, Object hintValue) {
        update_gl();
    }

    @Override
    public Object getRenderingHint(Key hintKey) {
        update_gl();
        return null;
    }

    @Override
    public void setRenderingHints(Map<?, ?> hints) {
        update_gl();
    }

    @Override
    public void addRenderingHints(Map<?, ?> hints) {
        update_gl();
    }

    @Override
    public RenderingHints getRenderingHints() {
        update_gl();
        return null;
    }

    @Override
    public void translate(int x, int y) {
        update_gl();
    }

    @Override
    public void translate(double tx, double ty) {
        update_gl();
    }

    @Override
    public void rotate(double theta) {
        update_gl();
    }

    @Override
    public void rotate(double theta, double x, double y) {
        update_gl();
    }

    @Override
    public void scale(double sx, double sy) {
        update_gl();
    }

    @Override
    public void shear(double shx, double shy) {
        update_gl();
    }

    @Override
    public void transform(AffineTransform Tx) {
        update_gl();
    }

    @Override
    public void setTransform(AffineTransform Tx) {
        update_gl();
    }

    @Override
    public AffineTransform getTransform() {
        update_gl();
        return null;
    }

    @Override
    public Paint getPaint() {
        update_gl();
        return null;
    }

    @Override
    public Composite getComposite() {
        update_gl();
        return null;
    }

    @Override
    public void setBackground(Color color) {
        update_gl();
    }

    @Override
    public Color getBackground() {
        update_gl();
        return null;
    }

    @Override
    public Stroke getStroke() {
        update_gl();
        return null;
    }

    @Override
    public void clip(Shape s) {
        update_gl();
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        update_gl();
        return null;
    }

    @Override
    public Graphics create() {
        update_gl();
        return null;
    }

    @Override
    public Color getColor() {
        update_gl();
        return null;
    }

    @Override
    public void setColor(Color c) {
        update_gl();
    }

    @Override
    public void setPaintMode() {
        update_gl();
    }

    @Override
    public void setXORMode(Color c1) {
        update_gl();
    }

    @Override
    public Font getFont() {
        update_gl();
        return null;
    }

    @Override
    public void setFont(Font font) {
        update_gl();
    }

    @Override
    public FontMetrics getFontMetrics(Font f) {
        update_gl();
        return null;
    }

    @Override
    public Rectangle getClipBounds() {
        update_gl();
        return null;
    }

    @Override
    public void clipRect(int x, int y, int width, int height) {
        update_gl();
    }

    @Override
    public void setClip(int x, int y, int width, int height) {
        update_gl();
    }

    @Override
    public Shape getClip() {
        update_gl();
        return null;
    }

    @Override
    public void setClip(Shape clip) {
        update_gl();
    }

    @Override
    public void copyArea(int x, int y, int width, int height, int dx, int dy) {
        update_gl();
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        update_gl();
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
        update_gl();
    }

    @Override
    public void clearRect(int x, int y, int width, int height) {
        update_gl();
    }

    @Override
    public void drawRoundRect(int x, int y, int width, int height,
            int arcWidth, int arcHeight) {
        update_gl();
    }

    @Override
    public void fillRoundRect(int x, int y, int width, int height,
            int arcWidth, int arcHeight) {
        update_gl();
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        update_gl();
    }

    @Override
    public void fillOval(int x, int y, int width, int height) {
        update_gl();
    }

    @Override
    public void drawArc(int x, int y, int width, int height, int startAngle,
            int arcAngle) {
        update_gl();
    }

    @Override
    public void fillArc(int x, int y, int width, int height, int startAngle,
            int arcAngle) {
        update_gl();
    }

    @Override
    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
        update_gl();
    }

    @Override
    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        update_gl();
    }

    @Override
    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        update_gl();
    }

    @Override
    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
        update_gl();
        return false;
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height,
            ImageObserver observer) {
        update_gl();
        return false;
    }

    @Override
    public boolean drawImage(Image img, int x, int y, Color bgcolor,
            ImageObserver observer) {
        update_gl();
        return false;
    }

    @Override
    public boolean drawImage(Image img, int x, int y, int width, int height,
            Color bgcolor, ImageObserver observer) {
        update_gl();
        return false;
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2,
            int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
        update_gl();
        return false;
    }

    @Override
    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2,
            int sx1, int sy1, int sx2, int sy2, Color bgcolor,
            ImageObserver observer) {
        update_gl();
        return false;
    }

    @Override
    public void dispose() {
        graphics.dispose();
        renderer.destroy();
        renderer = null;
        update_gl();
    }

    public void update_gl() {
        currentTex.kill();
        currentTex = null;
        if (renderer == null) {
            throw new IllegalStateException("Graphics disposed");
        }
        currentTex = new BufferedTexture(swingData);
        renderer.setTexture(currentTex);
    }

    public void draw_gl() {
        if (renderer == null) {
            throw new IllegalStateException("Graphics disposed");
        }
        renderer.draw();
    }

}
