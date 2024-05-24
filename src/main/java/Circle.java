import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    private double radius;

    public Circle(Point location, Color color, double border, double radius) {
        super(location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics2D g) {
        g.setColor(color);
        g.setStroke(new BasicStroke((float) border));
        g.drawOval((int) location.getX(), (int) location.getY(), (int) radius*2, (int) radius*2);
    }
}
