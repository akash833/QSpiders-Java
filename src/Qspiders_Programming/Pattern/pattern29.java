package Qspiders_Programming.Pattern;

public class pattern29 {
    public static void main(String[] args) {
        int n=5;
        int star=n;
        for(int i=1;i<=2*n-1;i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            if (i < n) {
                star--;
            } else {
                star++;
            }
            System.out.println();
        }
    }
}
