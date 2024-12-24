import entidades.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter rectangle width and height: ");
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();

        System.out.printf("AREA = %.2f \n",rectangle.area());
        System.out.printf("PERIMETER = %.2f \n",rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f",rectangle.diagonal());


    }
}