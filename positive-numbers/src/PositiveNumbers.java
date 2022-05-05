import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int number = 1;

        while (number != 0){
            System.out.println("Enter a number:");
            number = s.nextInt();

            if (number < 0){
                System.out.println("Number must be a positive number");
            }
        }
    }
}