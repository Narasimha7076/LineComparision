import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Line Comparison!");
        System.out.println("Enter the coordinates of point-1: ");
        System.out.println("x1: ");
        double x1 = inp.nextDouble();
        System.out.println("y1: ");
        double y1 = inp.nextDouble();
        System.out.println("Enter the coordinates of point-2: ");
        System.out.println("x2: ");
        double x2 = inp.nextDouble();
        System.out.println("y2: ");
        double y2 = inp.nextDouble();

        Line l1 = new Line(x1,y1,x2,y2);
        l1.calculateLength();
    }
}