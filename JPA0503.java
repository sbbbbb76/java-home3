package javh3;
import java.util.Scanner;
public class JPA0503 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int sum=1;
        for (int b=1;b<=3;b++){
            System.out.print("please enter one value : ");
            int a=c.nextInt();
            if (a>=1 && a<=10){
                for (int i=1; i<=a;i++){
                    sum*=i;
                }
                System.out.println(a+"! = "+sum);
                sum=1;
            }else{
                System.out.println("Error, the value is out of range.");
            }

        }
        
        
    }
}
