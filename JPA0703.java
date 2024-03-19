package javh3;

import java.util.Scanner;

public class JPA0703 {
    public static void main (String[] args){
        while(true){
            Scanner d = new Scanner(System.in);
            System.out.println("Input:");
            int m = d.nextInt();
            int n = d.nextInt();
            if(m==999){
                break;
            }
            int max = 1;
 
        for (int i = 2; i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                max = i;
            }
        }
        System.out.println(max);

    }
}
}
