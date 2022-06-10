import java.util.Scanner;

class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x for your point: ");
        double AX = Double.parseDouble(in.nextLine()); 

        System.out.print("Enter y for your point: ");
        double AY = Double.parseDouble(in.nextLine()); 

        Point A = new Point(0, 33);
        Point B = new Point(33, 33);
        Point C = new Point(AX, AY);
        
        Line line = new Line(A, B);
        Boolean is_C_on_the_line = line.isOnTheLine(C);

        if( !is_C_on_the_line) {
            System.out.println("Given point is not in the line segment");
            return;
        }
        
        LineSegment lineSegment = new LineSegment(A, B);
        LinePosition position = lineSegment.findPosition(C);

        System.out.println("Your point is " + (position) +  "  the given line ");

    }

}


