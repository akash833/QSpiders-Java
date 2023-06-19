package Qspiders_Programming.do_while_loop;

public class Ascii_From_A_Z {
    public static void main(String[] args) {
        char ch='A';
        do{
            System.out.println(ch +" -> " + (int)ch);
            ch++;
        }while(ch<='Z');
    }
}
