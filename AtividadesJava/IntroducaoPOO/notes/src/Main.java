import entidades.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f \n",student.finalGrade());

        if (student.finalGrade()>=60){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",student.missingPoints());
        }
    }
}