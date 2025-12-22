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



        Account acc1 = new Account();
        acc1.name = "Rick";
        System.out.println(acc1.name);
        
    }
}
