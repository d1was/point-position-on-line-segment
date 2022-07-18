import java.util.Scanner;

public class LabFirst {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.print("What do you want to create ?: \n " +
                "1. Point\n" +
                "2. Line Segment\n" +
                "3. Line\n" +
                "4. Ray\n");

        int option = Integer.parseInt(in.nextLine());
        switch (option) {
            case 1:
                System.out.println("Enter x coordinate: ");
                int x = in.nextInt();
                System.out.println("Enter y coordinate: ");
                int y = in.nextInt();
                Point inputPoint = new Point(x, y);
                System.out.println("The geometric object for point is " + inputPoint);
                break;
            case 2:
                System.out.println("Enter x coordinate for starting point: ");
                int ax = in.nextInt();
                System.out.println("Enter y coordinate for starting point: ");
                int ay = in.nextInt();
                System.out.println("Enter x coordinate for end point: ");
                int bx = in.nextInt();
                System.out.println("Enter y coordinate for end point: ");
                int by = in.nextInt();
                Point startPoint = new Point(ax, ay);
                Point endPoint = new Point(bx, by);
                LineSegment ls = new LineSegment(startPoint, endPoint);
                System.out.println("The geometric object for line segment is " + ls);
                break;
            case 3:
                System.out.println("Enter x coordinate for first point: ");
                int cx = in.nextInt();
                System.out.println("Enter y coordinate for first point: ");
                int cy = in.nextInt();
                System.out.println("Enter x coordinate for second point: ");
                int dx = in.nextInt();
                System.out.println("Enter y coordinate for second point: ");
                int dy = in.nextInt();
                Point firstPoint = new Point(cx, cy);
                Point secondPoint = new Point(dx, dy);
                Line line = new Line(firstPoint, secondPoint);
                System.out.println("The geometric object for line  is " + line);
                break;
            case 4:
                System.out.println("Enter x coordinate for start point: ");
                int ex = in.nextInt();
                System.out.println("Enter y coordinate for start point: ");
                int ey = in.nextInt();
                System.out.println("Enter x coordinate for second point: ");
                int fx = in.nextInt();
                System.out.println("Enter y coordinate for second point: ");
                int fy = in.nextInt();
                Point Point1 = new Point(ex, ey);
                Point Point2 = new Point(fx, fy);
                Ray ray = new Ray(Point1, Point2);
                System.out.println("The geometric object for line  is " + ray);
                break;

            default:
                System.out.println("Invalid option");
        }

    }

}
