package Qspiders_Programming.while_loop;

public class reverse_no {
    public static void main(String[] args) {
        int r_num=0;
        int num=434678;
        while(num>0){
            int r=num%10;
            r_num = r_num*10 + r;
            num/=10;
        }
        System.out.println(r_num);
    }
}
