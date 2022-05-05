import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int i = s.nextInt();

        for (; i <= 11; i++){
            System.out.println(i);
        }
    }
}
