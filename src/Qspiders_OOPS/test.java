package Qspiders_OOPS;

public class test {

    // method for xylemphloem
    public static int first_digit(int n){
        int num=n;
        while(num>9){
            num/=10;
        }
        return num;
    }

    public static int sum_of_digits(int n){
        if(n<=0){
            return 0;
        }
        return n%10 + sum_of_digits(n/10);
    }

    public static void xylemphloem(int n){
        int fd=first_digit(n);
        int ld= n%10;

        int sum_of_fl=fd+ld;
        int sum_of_middle=sum_of_digits(n)-sum_of_fl;
        if(sum_of_middle==sum_of_fl){
            System.out.println(n + " is a xylemphloem number");
        }else{
            System.out.println(n + " is not a xylemphloem number");
        }
    }
    // --------------- //
    // method for armstrong

    public static int count(int n){
        int num = n;
        int i=0;
        while(num>0){
            num/=10;
            i++;
        }
        System.out.println(i);
        return i;
    }

    public static int sum_of_pow(int n,int p){
        int sum=0;
        while(n>0){
            int r = n%10;
            int ans = 1;
            for(int i=0;i<p;i++){
                ans*=r;
            }
            sum+=ans;
            n/=10;
        }
        return sum;
    }

    public static void armstrong(int n){
        int count=count(n);
        int num=n;
        int sum=sum_of_pow(num,count);
        if(n==sum){
            System.out.println(n + " is a armstrong number");
        }else{
            System.out.println(n + " is not an armstrong number");
        }
    }

    // method for palindrome

    public static void main(String[] args) {
        xylemphloem(72342);
        armstrong(153);
    }
}
