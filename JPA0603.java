package javh3;
import java.util.Scanner;
public class JPA0603 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        while(true){
            System.out.println("Input:");
            int m = c.nextInt();
            int n = c.nextInt();
            if (m==999){
                break;
            }
            System.out.printf("%.0f\n",Math.pow(m, n));
            
        }
        
    }
    
}
