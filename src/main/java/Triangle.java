import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class Triangle extends Shape {
    private double side;

    public Triangle(Point location, Color color, double border, double side) {
        super(location, color, border);
        this.side = side;
    }

    @Override
    public void paint(Graphics2D g) {
        g.setColor(color);
        g.setStroke(new BasicStroke((float) border));
        int x = (int) location.getX();
        int y = (int) location.getY();
        int[] xPoints = {x, x + (int) side, x - (int) side};
        int[] yPoints = {y, y - (int) side, y - (int) side};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}