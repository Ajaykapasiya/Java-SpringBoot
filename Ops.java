class Pen{
    String name;
    String type;

   public void write(){
    System.out.println("Write");
   }
   public void printColour(){
    System.out.println(this.name);
   }
   public void printType(){
    System.out.println(this.type);
   }
}

class Student{
    String name;
    int age; 
    int rollno ;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }

    Student(){
        System.out.println("Non-parameterized constructor, also known as a default constructor");
    }

}



public class Ops {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rick";
        s1.age = 23;
        s1.rollno = 457834;

        s1.printName();
    }
}