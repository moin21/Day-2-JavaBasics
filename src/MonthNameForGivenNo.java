import java.util.Scanner;
public class MonthNameForGivenNo {
    public static void main(String[] args) {
        System.out.println("Enter any no. from 1 to 12");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        switch (number) {
            case 1: System.out.println("This is January Month");
                break;
            case 2: System.out.println("This is February Month");
                break;
            case 3: System.out.println("This is March Month");
                break;
            case 4: System.out.println("This is  April Month");
                break;
            case 5: System.out.println("This is May Month");
                break;
            case 6: System.out.println("This is June Month");
                break;
            case 7: System.out.println("This is July Month");
                break;
            case 8: System.out.println("This is August Month");
                break;
            case 9: System.out.println("This is September Month");
                break;
            case 10: System.out.println("This is October Month");
                break;
            case 11: System.out.println("This is November Month");
                break;
            case 12: System.out.println("This is December Month");
                break;
            default: System.out.println("Try again and enter a no. between 1 to 12");
        }
    }
}
