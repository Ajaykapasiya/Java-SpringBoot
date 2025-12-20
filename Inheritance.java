import bank.Account;

class Shape {
    String colour;
}

class Triangle extends Shape {

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.colour = "Blue";
        System.out.println(t1.colour);

        bank.Account account1 = new bank.Account();
        account1.name = "Sam";
        System.out.println(account1.name);

    }
}
