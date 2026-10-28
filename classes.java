class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Shape {
    String color;
}
class Triangle extends Shape{
    public void printInfo(){
        System.out.println(this.color);
    }
}
public class classes {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "mohit";
        s1.age = 20;

        Student s2 = new Student();
        s2.printInfo("rohit", 21);
        s2.printInfo();
        

        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.printInfo();
    }
}
