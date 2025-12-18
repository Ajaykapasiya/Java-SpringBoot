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

public class Ops {
   public static  void main(String[]args){
      Pen pen1 = new Pen();
      pen1.name = "Pilot";
      pen1.type = "Ballpoint";

      pen1.write();
      pen1.printColour();
      pen1.printType();
   }
}