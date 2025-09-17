import java.util.Scanner;

public class Lesson1part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age = ");
        int age =  sc.nextInt();

        if (age>=18) {
            System.out.println("Adult");
        } else {
                        System.out.println("Minor");
            }
        Scanner dk = new Scanner(System.in);
        System.out.print("Enter your marks = ");
        int marks = dk.nextInt();

        if (marks>=90){
            System.out.println("your Grade is A");
        } else if (marks>=80){
            System.out.println("your Grade is B");
        } else if (marks>=70){
            System.out.println("your Grade is C");
        } else if (marks>=60){
            System.out.println("your Grade is D");
        }

        }
    }

