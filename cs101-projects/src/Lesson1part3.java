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
        }
    }

