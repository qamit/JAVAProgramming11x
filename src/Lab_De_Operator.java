package IncrementDecrement11x;

public class Lab_De_Operator {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(--a + a-- + a--);
        System.out.println(a);

        /*
        --a -> A --> ExpA = 09 -> a = 09
        a-- -> B --> ExpB = 09 -> a = 08
        a-- -> C --> ExpC = 08 -> a = 07

        RESULT:
        26
        7
        */


    }
}
