import java.util.Scanner;

public class Lesson1Part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for loop
        System.out.println("For loop: Counting 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number:" + i);
        }
        // while loop
        System.out.println("\nWhile loop: Counting from 5");
        int count = 5;
        while(count>0) {
            System.out.println(count);
            count--;
        }
        System.out.println("Blast off");

        // Multiplication table

        System.out.print("\nEnter number for multiplication table = ");
        int n = sc.nextInt();
        for (int i = 1; i<=10;i++ ){
            System.out.println(n + "x" + i + "=" + (n * i));



        }

    }
}
