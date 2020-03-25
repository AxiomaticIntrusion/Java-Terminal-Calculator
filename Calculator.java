import java.util.*;
import java.util.Scanner;

public class Calculator {

	public static void selections() {
        double operator, num1, num2;
        System.out.println("Calculator");
    System.out.println();
    Calculations Res = new Calculations();
        //Selection
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("Enter Selection from Above: ");
        //Creating new input
        Scanner inp1 = new Scanner(System.in);
        //Assigning input to variable
        operator = inp1.nextDouble();
          
    System.out.println();
        
        System.out.println("Enter First Number: ");
        //Creating new input
        Scanner inp2 = new Scanner(System.in);
        //Assigning input to variable
        num1 = inp2.nextDouble();
        
        System.out.println("Enter Second Number: ");
        //Creating new input
        Scanner inp3 = new Scanner(System.in);
        //Assigning input to variable
        num2 = inp3.nextDouble();
      
        System.out.println();
        //Output
        if (operator == 1) {
            System.out.println("Your answer is: " + (num1 + num2));            
        } else if (operator == 2){
            System.out.println("Your answer is: " + (num1 - num2));
        } else if (operator == 3) {
            System.out.println("Your answer is: " + (num1 * num2));
        } else if (operator == 4) {
            System.out.println("Your answer is: " + (num1 / num2));
        } else {
            System.out.println("Illegal Entry");
        }
        Res.restart();
	}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Calculator start = new Calculator();
    	start.selections();
        
    }

}