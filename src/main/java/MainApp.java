import java.awt.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        World world = new World(600, 600);
        Turtle turtle = new Turtle(world);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Add Shape:");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter x coordinate: ");
            int x = scanner.nextInt();
            System.out.print("Enter y coordinate: ");
            int y = scanner.nextInt();
            System.out.print("Enter color (R,G,B): ");
            int r = scanner.nextInt();
            int g = scanner.nextInt();
            int b = scanner.nextInt();
            Color color = new Color(r, g, b);
            System.out.print("Enter border width: ");
            double border = scanner.nextDouble();

            Shape shape = null;
            if (choice == 1) {
                System.out.print("Enter side length: ");
                double side = scanner.nextDouble();
                shape = new Square(new Point(x, y), color, border, side);
            } else if (choice == 2) {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(new Point(x, y), color, border, radius);
            } else if (choice == 3) {
                System.out.print("Enter side length: ");
                double side = scanner.nextDouble();
                shape = new Triangle(new Point(x, y), color, border, side);
            }

            if (shape != null) {
                Graphics2D graphics2D = (Graphics2D) world.getGraphics();
                shape.paint(graphics2D);
                world.repaint();
            }
        }
    }
}

