package ATB11x;

import java.util.Scanner;


public class GradeCalculator {
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);       //add scanner object to take user input

        System.out.println("Enter your Score: ");
        float score = obj.nextFloat();

        if(score >= 90 && score <=100){                     //if-else statement to get Grade as per input
            System.out.println("Your Grade is: 'A' " );
        }else if(score >= 80 && score <=89){
            System.out.println("Your Grade is: 'B' ");
        }else if(score >= 70 && score <=79){
            System.out.println("Your Grade is: 'C' ");
        }else if(score >= 60 && score <= 69){
            System.out.println("Your Grade is: 'D' ");
        }else{
            System.out.println("Your Grade is: 'F' ");
        }

    }
}
