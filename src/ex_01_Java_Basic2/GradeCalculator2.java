package ex_01_Java_Basic2;

import java.util.Scanner;

/*WAP that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100

B: 80-89

C: 70-79

D: 60-69

F: 0-59

*/
public class GradeCalculator2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int numerical_score = obj.nextInt();

        String result = (numerical_score > 90 && numerical_score <=100) ? "A" : (numerical_score > 80 && numerical_score<=89) ? "B" : (numerical_score > 70 && numerical_score<=79) ? "C" : (numerical_score > 60 && numerical_score<=69) ? "D" : "F";
        System.out.println("Your Grade is: " + result);
    }
}
