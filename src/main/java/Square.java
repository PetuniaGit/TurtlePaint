import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class Square extends Shape {
    private double side;

    public Square(Point location, Color color, double border, double side) {
        super(location, color, border);
        this.side = side;
    }

    @Override
    public void paint(Graphics2D g) {
        g.setColor(color);
        g.setStroke(new BasicStroke((float) border));
        g.drawRect((int) location.getX(), (int) location.getY(), (int) side, (int) side);
    }
}