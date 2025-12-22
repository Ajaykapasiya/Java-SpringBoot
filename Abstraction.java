abstract class Animal {
  abstract void walk();
    
}

class Horse extends Animal{
    public void walk(){
        System.out.println("qwerty");
    }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("asdfghj");
    }
}

public class Abstraction {
    public static void main(String[] args) {
       Horse ho = new Horse();
       ho.walk();
       
       Dog do1 = new Dog();
       do1.walk();

    }
}
