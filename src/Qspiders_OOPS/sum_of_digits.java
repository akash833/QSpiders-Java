package Qspiders_OOPS;

public class sum_of_digits {
    public static void main(String[] args) {
//        System.out.println(sum(735,0));
        System.out.println(sum2(735));
    }
    public static int sum(int num,int s){
        if(num==0){
            return s;
        }

        int r= num%10;
        s+=r;
        num/=10;

        return sum(num,s);
    }

    public static int sum2(int num){
        if(num==0){
            return 0;
        }

        return num%10 + sum2(num/10);
    }
}
