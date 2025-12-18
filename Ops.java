class Pen{
    String name;
    String type;

   public void write(){
    System.out.println("Write");
   }
}

public class Ops {
   static  void main(String[]args){
      Pen pen1 = new Pen();
      pen1.name = "Pilot";
      pen1.type = "ballpoint";
   }
}