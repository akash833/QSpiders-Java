package Qspiders_Programming.while_loop;

public class count_no_of_digits {
    public static void main(String[] args) {
        int count=0;
        int n=23328;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
