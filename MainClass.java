

// public class MainClass {
//     public static void main(String[]args){
//         Person p1 = new Person();
//         p1.name = "Sam";
//         p1.age = 22;
//         System.out.println(p1.name + " " + p1.age);

//         Person p2 = new Person();
//         p2.name = "rick";
//         p2.age = 43;
//         System.out.println(p2.name + " " + p2.age);

//         p1.walk();
//         p2.eat();
//     }
    
// }
// class Person{
//     String name;
//     int age;

//     void walk(){
//         System.out.println(name + " is walking");
//     }

//     void eat(){
//         System.out.println(name + " is eating");
//     }
// }


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
}

public class MainClass {
  
    public static void main(String[] args) {
        Person p1 = new Person("Rohit", 33);
        System.out.println(p1.name + " " + p1.age);
    }
    
}
