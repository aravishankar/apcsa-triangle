import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a height: ");
        double height = in.nextDouble();
        System.out.print("Enter a base: ");
        double base = in.nextDouble();

        double area = (height*base)/2;

        System.out.printf("\nThe area of a triangle with a height and base of %.1f and %.1f is %.1f.", height, base, area);

        in.close();
    }
}