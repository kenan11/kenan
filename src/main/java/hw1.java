import java.util.Random;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rb = new  Random();
        System.out.print("Please enter your name :");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        int number = rb.nextInt(100);

        while(true) {
            System.out.print("Please enter your number :");
            int your_number = sc.nextInt();

            if(your_number > number) {
                System.out.print("Your number is too big. Please , try again.");
            }
            else if(your_number < number) {
                System.out.println("Your number is too small. Please , try again.");
            }
            else  {
                System.out.println("Congratulations,"+name);
                break;
            }
        }



    }
}
