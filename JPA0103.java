import java.util.Scanner;
public class JPA0103 {
    public static void main(String[] args) {
        int tot = 0;
        Scanner a = new Scanner(System.in);
        int x1 = a.nextInt();
        for(int i=1 ; i <= x1; i++){
            tot += i;
            
        }
    System.out.printf("1 + ... + %d = %d",x1,tot);    
    }
    
}
