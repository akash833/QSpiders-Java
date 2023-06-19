package Qspiders_OOPS;

public class student {
    int Roll_No;
    String Name;
    double percentage;
    int Age;

    student(int Roll_No,String Name,double percentage,int Age){
        this.Roll_No=Roll_No;
        this.Name=Name;
        this.percentage=percentage;
        this.Age=Age;
        System.out.println(Roll_No+" "+Name+" "+percentage+" "+Age);
    }
    student(int Roll_No,String Name,int Age){
        this.Roll_No=Roll_No;
        this.Name=Name;
        this.Age=Age;
        System.out.println(Roll_No+" "+Name+" "+Age);
    }
    student(int Roll_No,int Age){
        this.Roll_No=Roll_No;
        this.Age=Age;
        System.out.println(Roll_No+" "+Age);
    }
    student(int Roll_No){
        this.Roll_No=Roll_No;
        System.out.println(Roll_No);
    }
    student(int Age,double percentage){
        this.Age=Age;
        this.percentage=percentage;
        System.out.println(Age+" "+percentage);
    }
    public static void main(String[] args) {
        student s1=new student(123,"Akash",23.9,23);
        student s2=new student(124,"Akash",23);
        student s3=new student(125,23);
        student s4=new student(126);
        student s5=new student(85,23.5);
    }
}
