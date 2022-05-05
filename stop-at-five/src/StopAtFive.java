import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int number = 0;

        while (number != 5){
            System.out.println("Give a number:");
            number = s.nextInt();
        }
    }
}
