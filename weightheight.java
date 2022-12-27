
//Write a program to read the First name and last of a person. He's wait and height using Comand LA Calculate the BMI Index which is defined as the individuals body mask divided by the square of their height (Hint: BMI = wts in kgs /(ht)²) name
import java.util.Scanner;
public class Exercise6 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}
