package Qspiders_Programming.For_Loop;

public class sum_of_prime {
    public static void main(String[] args) {
        int a=40,b=50;
        int sum=0;

        for(int i=a;i<=b;i++){
            boolean flag=false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
