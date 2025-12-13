import java.util.*;

import javax.script.ScriptContext;

// public class Test2 {
//     public static void main(String[]args){
//      List<Object> arr = new ArrayList<>();
//     int[] arr1 = {1,2,3,4};

//     for (int i = 0; i < arr1.length; i++) {
//         System.out.println(arr1[i]);
//     }

//     }
// }

// public class Test2 {
//     public static void main(String[] args) {

//          Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your name: ");
//         String name = sc.next();

//         System.out.println("Enter your age: ");
//         int age = sc.nextInt();
        

//         System.out.println("Hello " + name + ", you are " + age + " years old.");

//         for (int i = 0; i <= 10; i++) {
//             System.out.println(i);
            
//         }

//         System.out.println("Enter the number: ");
//         int a = sc.nextInt();

//         if(a%2 == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }



//     }
// }

// public class Test2{

// public static void main(String[]args) {
//     // int[] marks = {50, 80, 90};
//     // // for (int i = 0; i < marks.length; i++) {
//     // //     System.out.println(marks[i]);  
//     // // }

//     // for(int s :  marks){
//     //     System.out.println(s);
//     // }


//     Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    System.out.println(a);

//    String name = sc.nextLine();
//    System.out.println(name);



// }
// }

static void checkEvenOdd(int num){
    if (num%2 == 0) {
        System.err.println("Even");
    }
    else{
        System.err.println("Odd");
    }
    checkEvenOdd(10);
}
