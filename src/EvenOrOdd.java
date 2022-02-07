import java.util.Scanner;
public class EvenOrOdd {


    public static void main(String[] args) {

        System.out.println("Enter Any No.");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int no = number;
        if (number % 2 == 0) {
            System.out.println("It's an Even no.");
        }
        else {
            System.out.println("It's an Odd no.");
        }



}

}