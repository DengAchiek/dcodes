package input.input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Enter the first number:");
        num1 = input.nextInt();

        System.out.println("Enter the first number:");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.print("The sum is:" + sum);
        
    }
    
            
}
