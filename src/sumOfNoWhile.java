import java.util.Scanner;

import java.util.*;

class sumOfNo {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter Any No.");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {

            sum = sum + i;

            i++;
        }
        System.out.println("Sum of numbers using while loop is:" + " " + sum);
    }
}

