import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int i = 11;
        while (i >= 11){
            System.out.println("Enter a number less than 11:");
            i = s.nextInt();
        }

        for (; i <= 11; i++){
            System.out.println(i);
        }
    }
}
