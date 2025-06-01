package ex_010_For_Loop;

public class Lab_109_For_Loop_Continue {
    public static void main(String[] args) {
        //continue loop
        for(int i=0;i<50;i++){  // 0 to 49; execute 50 times
            if(i==5){
                continue;   //skip below code and move to top
            }
            System.out.println(i);
        }
    }
}
