package Maths;

public class practice {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        char c = 'A';
        System.out.println(a+b+"a+b"+c+"c"); // 30a+bAc
        System.out.println("A"+a+"B"+a+c); // A10B10A
        System.out.println(b+c+"Hyy"+(c+a)); //85Hyy75
        System.out.println("Hello"+(a+b+c)+a+b); // Hello951020
        System.out.println((a+c)+'z'+"hyy"+(a+b+c)); // 75zhyy95
        System.out.println((a+c)+'z'+a+"hyy"+a+b+c); // 75zhyy1020A

        System.out.println(!(10!=10));
    }
}
