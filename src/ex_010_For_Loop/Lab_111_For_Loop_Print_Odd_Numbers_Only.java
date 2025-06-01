package ex_010_For_Loop;

public class Lab_111_For_Loop_Print_Odd_Numbers_Only {
    public static void main(String[] args) {
        // print only odd number using Continue statement and for loop
        for(int i=0;i<10;i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println("Odd Number -> " +i);
        }
    }
}
