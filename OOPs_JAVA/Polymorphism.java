package OOPs_JAVA;

class Students{
    String name;
    int age;

    public void printInfor(String name){
        System.out.println(name);
    }
    public void printInfor(int age){
        System.out.println(age);
    }
    public void printInfor(String name, int age){
        System.out.println(name+" "+age);
    }

    public void printInfor(){
        System.out.println(name+ " " +age);
    }


}
public class Polymorphism {
    public static void main(String args[]){
        Students s1 = new Students();
        s1.name = "Parveen";
        s1.age = 24;

        s1.printInfor();
        s1.printInfor(s1.age);
        s1.printInfor(s1.name);
        s1.printInfor(s1.name, s1.age);
    }
}
