import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String input = "";

        while(!input.equals("yes")){
            System.out.println("Do you want to take a break?");
            input = s.nextLine();
        }
    }
}
