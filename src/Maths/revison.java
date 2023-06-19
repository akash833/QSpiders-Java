package Maths;

public class revison {
    public static void main(String[] args) {
        int a=1;
        int sum=0;
        while(a<=5){
            sum+=a;
            a++;
        }
        System.out.println(sum);
        digit_sum();
        table(5);
    }

    public static void digit_sum(){
        int a=234;
        int sum=0;
        while(a>0){
            int r=a%10;
            a/=10;
            sum+=r;
        }
        System.out.println(sum);
    }

    public static void table(int num){
        int i=1;
        while(i<=10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }
}
