package ATB11x;

public class MathFunction2 {
    public static void main(String[] args){

        double x = 10;
        double y = 10;
        double z = 10;

        double denominator = (x*x) + (y*y) - (Math.abs(z));
        double result = 3 / denominator;
        System.out.println("the result is: " + result);
    }
}
