package Pattern;

public class basic_of_oops {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Akash";
        p1.age=23;

        Person p2=new Person();
        p2.name="Anuj";
        p2.age=45;

        System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.age+" "+p2.name);

        p1.walk();
        p1.eat();
    }
}

class Person{
    String name;
    int age;

    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
}
