package ex_09_Switch;

import java.util.Scanner;
//if they enter 1 -> monday or 5 -> friday
//8 ? -> NOT allowed or ERROR

// CLI option
// int day = Integer.parseInt(args[0]);

public class Switch {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter the Day: 1 to 7 ");
        int day = obj.nextInt();
//switch case
        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid, day Number");



        }


    }


}
