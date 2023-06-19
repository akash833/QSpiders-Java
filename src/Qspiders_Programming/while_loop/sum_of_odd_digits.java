package Qspiders_Programming.while_loop;

public class sum_of_odd_digits {
    public static void main(String[] args) {
        int sum=0;
        int n=785458;
        while(n>0){
            int r=n%10;
            if(r%2==1){
                sum+=r;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
