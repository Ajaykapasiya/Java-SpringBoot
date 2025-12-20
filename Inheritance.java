import bank.*;


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



        bank.Account acc1 = new bank.Account();
        acc1.name = "Rick";
        
    }
}
