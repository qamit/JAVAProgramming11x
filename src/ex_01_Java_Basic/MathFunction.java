package ATB11x;
import java.sql.SQLOutput;
import java.util.Scanner;

//MathFunction using Scanner function for taking user inputs
//if else condition

public class MathFunction {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        //Take input from user for add value in x, y & z

        System.out.println("Enter the value in 'x': ");
        double x = obj.nextDouble();

        System.out.println("Enter the value in 'y': ");
        double y = obj.nextDouble();

        System.out.println("Enter the value in 'z': ");
        double z = obj.nextDouble();

        //compute the expression

        double denominator = x*x + y*y - Math.abs(z);
        if (denominator == 0){
            System.out.println("Cannot compute the expression");
        }else{
            double result = 3 / denominator;
            System.out.println("The result is: " + result);
        }


    }
}
