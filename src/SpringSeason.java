import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {

        Scanner no = new Scanner(System.in);

        System.out.println("Enter month number.");
        int m = no.nextInt();
        System.out.println("Enter day number.");
        int d = no.nextInt();
        if (m < 3 || m > 6) {
            System.out.println("False");
        }
        else if(m == 3) {
            if(d >= 20) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
        else if(m == 6){
            if(d <= 20) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }
}
