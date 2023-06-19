package Qspiders_Programming.while_loop;

public class sum_of_all_digits {
    public static void main(String[] args) {
        int sum=0;
        int n=47843;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
