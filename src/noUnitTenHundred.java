import java.util.Scanner;

public class noUnitTenHundred {
    public static void main(String[] args) {
        System.out.println("Enter any no. between 0 to 1000");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int tenTh = (x - (x%10))/10;
        int hundredTh = (x - (x%100))/100;
        if (x >= 0 && x < 10) {
            System.out.println("For this no. unit value is "+ x +".");
        }
        else if (x >= 10 && x < 99) {
            System.out.println("For this no. unit value is "+ x%10 +". While 10th value is " + tenTh);
        }
        else if (x >= 100 && x < 1000) {
            System.out.println("For this no. unit value is "+ x%10 +". While 10th value is " + tenTh + ". While 100th value is " + hundredTh);
        }
        else {
            System.out.println("Please Try Again as the no. you have entered is not between 0 to 999");
        }
    }
}
