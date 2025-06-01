package ex_09_Switch;

public class Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match with ASCII");
                break;
            default:
                System.out.println("Does not match with ASCII");
        }

    }

}
