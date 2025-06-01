package ex_010_For_Loop;

public class Lab_107_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        //find even numbers from 1 to 50
        for(int i=0 ; i<=50 ; i++){
            if(i%2==0){
                System.out.println("the number is an even number:" + i);
            }
            else {
                System.out.println("the number is an Odd number:" + i);
            }

        }
    }
}
