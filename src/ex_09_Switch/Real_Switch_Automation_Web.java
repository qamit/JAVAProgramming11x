package ex_09_Switch;

import java.util.Scanner;

public class Real_Switch_Automation_Web{
    public static void main(String[] args) {

        //web Automation
        // will ask user to give the input from browser which he wants to use to
        // i will start the automation in that webBrowser.

//        String webBrowser = args[0];    //args[0]--> returns strings
//        System.out.println(webBrowser);


        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter Web Browser Name: ");
        String webBrowser = obj.next();

//switch case
        switch (webBrowser) {
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println("...");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("...");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "safari":
                System.out.println("Starting the safari");
                System.out.println("...");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I don't what kind of web browser it is");

        }


    }
}

