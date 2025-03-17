package IncrementDecrement11x;

public class Lab_In_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        /*
        ++a -> A --> ExpA = 11 -> a = 11
        a++ -> B --> ExpB = 11 -> b = 12
        a++ -> C --> ExpC = 12 -> c = 13

        ExpA + ExpB + ExpC = 11 + 11 + 12 = 34

        RESULT:
        34
        13

        */

    }
}
