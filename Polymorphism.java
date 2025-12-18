class Animal{
    public void animalSound(){
        System.out.println("The animal make sound");
    }
}

 class Bird extends Animal {
    public void animalSound(){
      System.out.println("Bird say wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("Cat mee mee");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal Bird = new Bird();
        Animal Cat = new Cat();

        myDog.animalSound();
        Bird.animalSound();
        Cat.animalSound();
    }
}