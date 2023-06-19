package Qspiders_Programming.Pattern;

public class pattern21 {
    public static void main(String[] args) {
        int n=5;
        int x=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<n;k++){
                System.out.print(x);
                if(x==1){
                    x=0;
                }else{
                    x=1;
                }
            }
            System.out.println();
        }
    }
}
