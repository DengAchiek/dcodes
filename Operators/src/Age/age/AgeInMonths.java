package Age.age;

import java.util.Scanner;

public class AgeInMonths {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age");

        int AgeInYears = scanner.nextInt();
        int AgeInMonth = AgeInYears * 12;

        System.out.print("This is your age in months:" + AgeInMonth+"months");

        scanner.close();
    }
}
