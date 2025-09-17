import java.util.Scanner; //scanner imported

public class Lesson1part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner created

        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        System.out.print("Enter your Age = ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA = ");
        double gpa = sc.nextDouble();

        boolean isstudent = true;


        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("GPA:" + gpa);
        System.out.println("Student:" + isstudent);
    }
}
