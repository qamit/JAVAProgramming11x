package CLI;

public class Lab_UI_NameAgeSal {
    public static void main(String[] args) {
        String Name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);

        System.out.println("Name: " + Name+ "\n"+ "Age: " +age+ "\n" + "Salary: " + salary+ "\n");
    }
}
