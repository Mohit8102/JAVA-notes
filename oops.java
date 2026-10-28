import bank.*;
class Student{
    public String name;
    protected String email;
    private String password; 
    static String school;

    public void setPass(String password){
        this.password = password;
    }
} 
public class oops {
    public static void main(String args[]){
        Account a1 = new Account();
        a1.name = "mohit";

        a1.printinfo();


        Student s1 = new Student();
        s1.name = "mohit";
        s1.email = "mohit2123@gmail.com";
        s1.setPass("the mohit");
        s1.school = "pcs";
        Student s2 = new Student();
        System.out.println(s2.school);
    }
}
//----------------------------------------------------------------------------------------------------------------------
// abstract class Animal {
//    abstract void walk();
//    void breathe() {
//        System.out.println("This animal breathes air");
//    }
//    Animal() {
//        System.out.println("You are about to create an Animal.");
//    }
// }


// class Horse extends Animal {
//    Horse() {
//        System.out.println("Wow, you have created a Horse!");
//    }
//    void walk() {
//        System.out.println("Horse walks on 4 legs");
//    }
// }


// class Chicken extends Animal {
//    Chicken() {
//        System.out.println("Wow, you have created a Chicken!");
//    }
//    void walk() {
//        System.out.println("Chicken walks on 2 legs");
//    }
// }


// public class OOPS {
//    public static void main(String args[]) {
//       Horse horse = new Horse();
//       horse.walk();
//       horse.breathe();
//    }
// }
//----------------------------------------------------------------------------------------------------------------------
// interface Animal {
//    void walk();
// }


// class Horse implements Animal {
//    public void walk() {
//        System.out.println("Horse walks on 4 legs");
//    }
// }


// class Chicken implements Animal {
//    public void walk() {
//        System.out.println("Chicken walks on 2 legs");
//    }
// }


// public class OOPS {
//    public static void main(String args[]) {
//       Horse horse = new Horse();
//       horse.walk();
//    }
// }