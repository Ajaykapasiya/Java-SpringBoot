package bank;

public class Bank {
    public static void main(String[] args) {

        Account acc1 = new Account();
        acc1.name = "customer1";
        acc1.email = "qewreew@gmail.com";
        acc1.setPassword("abcd");

        System.out.println(acc1.getPassword());
    }
}
