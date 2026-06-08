package OOPs_JAVA;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
    }

    public void printAge(){
        System.out.println(this.age);
    }

    public void printInfo(){
        System.out.println();
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Non-Parameter constructor
    Student(){
        System.out.println("Constructor called\n");
    }
    //Parameter Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(Student s3){
        this.name = s3.name;
        this.age = s3.age;
    }

}

public class OOPs {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ballpoint";

        pen1.write();
        pen2.write();

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();

        Student s1 = new Student();
        Student s2 = new Student("Rahi", 22);
        s1.name = "Parveen";
        s1.age = 24;


        s1.printName();
        s1.printAge();

        s1.printInfo();
        s2.printInfo();

    }
}
