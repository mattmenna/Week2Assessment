import java.util.Scanner;

/**
 * Created by Matt on 7/7/2017.
 */
public class IntegerCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        System.out.println(check(scnr.nextInt()));
    }

    public static boolean check(int number){
        if(number == 0){
            return true;
        } else return false;

    }

}
