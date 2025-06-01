package ex_010_For_Loop;

public class Lab_110_For_Loop_Print_Even_Only {
    public static void main(String[] args) {
        //print even number using for loop and continue statement
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println("Even -> " +i);
                continue;
            }
            System.out.println("Odd -> "+i);
        }
    }
}
