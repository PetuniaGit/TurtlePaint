import java.awt.*;
import java.awt.geom.AffineTransform;

public abstract class Shape {
    protected Point location;
    protected Color color;
    protected double border;

    public Shape(Point location, Color color, double border) {
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public abstract void paint(Graphics2D g);
}
