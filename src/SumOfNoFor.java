import java.util.Scanner;
public class SumOfNoFor {


        public static void main(String[] args) {
            int sum = 0;
            System.out.println("Enter Any No.");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int i;
            for(i = 1; i <= n; i++)
            {
//adding the value of i into sum variable
                sum = sum + i;
            }
//prints the sum
            System.out.println("Sum of First "+ n +" Natural Numbers using for loop is = " + sum);
        }
    }

