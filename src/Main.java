import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Line Comparison!");
        System.out.println("Enter the coordinates of Line-1: ");
        System.out.println("x1: ");
        double x1 = inp.nextDouble();
        System.out.println("y1: ");
        double y1 = inp.nextDouble();
        System.out.println("x2: ");
        double x2 = inp.nextDouble();
        System.out.println("y2: ");
        double y2 = inp.nextDouble();
        System.out.println("Enter the coordinates of Line-2: ");
        System.out.println("x1: ");
        double x3 = inp.nextDouble();
        System.out.println("y1: ");
        double y3 = inp.nextDouble();
        System.out.println("x2: ");
        double x4 = inp.nextDouble();
        System.out.println("y2: ");
        double y4 = inp.nextDouble();

        Line l1 = new Line(x1,y1,x2,y2);
        Line l2 = new Line(x3,y3,x4,y4);

        double length1 = l1.calculateLength();
        double length2 = l2.calculateLength();

        System.out.println("Line 1 Length: " + length1);
        System.out.println("Line 2 Length: " + length2);


        int comparisonResult = l1.compareTo(l2);
        if (comparisonResult == 0) {
            System.out.println("The two lines are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }

    }
}