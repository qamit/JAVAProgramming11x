package if_else_statements;

import java.util.Scanner;

public class Oddeven {                              /* WAP take user i/p & check whether the i/p is even or odd */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number of your choice: ");
        int a1 = obj.nextInt();
        if(a1%2 == 0){
            System.out.println("This is Even Number");
        }else{
            System.out.println("This is Odd Number");
        }
    }
}
/*
o/p is:
56
This is Even Number
55
This is Odd Number

*/