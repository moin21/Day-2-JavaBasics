import java.util.Scanner;

public class PalindromeNoFor {
    public static void main(String[] args)
    {
        int reverse = 0;
        System.out.println("Enter Any No.");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int no = number;
        for(number =no; number != 0;)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;

            }
        if(no == reverse){
            System.out.println("It is a Palindrome No.");
        }
        else System.out.println("It is not a Palindrome No.");

    }
}
