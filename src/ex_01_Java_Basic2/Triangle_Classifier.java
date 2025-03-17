package if_else_statements;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Side A Length: ");
        float side_a = obj.nextFloat();
        System.out.println("Enter the Side B Length: ");
        float side_b = obj.nextFloat();
        System.out.println("Enter the Side C Length: ");
        float side_c = obj.nextFloat();

        if(side_a == side_b && side_a == side_c && side_b == side_c){
            System.out.println("The Triangle is Equilateral(all sides are equal");
        } else if (side_a == side_b && side_a != side_c && side_b != side_c) {
            System.out.println("The Triangle is Isosceles(exactly 2 sides are equal");
        }else{
            System.out.println("The Triangle is Scalene(No sides are equal");
        }

    }
}
