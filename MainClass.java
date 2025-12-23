

public class MainClass {
    public static void main(String[]args){
        Person p1 = new Person();
        p1.name = "Sam";
        p1.age = 22;
        System.out.println(p1.name + " " + p1.age);

        // Person p2 = new Person();
        // p2.name = "rick";
        // p2.age = 43;
    }
    
}
class Person{
    String name;
    int age;
}
