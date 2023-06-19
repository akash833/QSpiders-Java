package Qspiders_Programming.loop_statement;

public class natural_no {
    public static void main(String[] args) {
        int i=0;
        do{
            if(i%2==1){
                System.out.println(i);
            }
            i++;
        }while(i<2*10);
    }
}
