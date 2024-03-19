import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args){
        double sum = 0;
        int sum1 =0;
        while(true){
        Scanner c = new Scanner(System.in);
        System.out.print("Please enter meal dollers or enter -1 to stop : ");
        int a = c.nextInt();
        if (a== -1){
            break;
        }
        else{
            sum+=a;
            sum1+=1;
        }
        }
        
        System.out.printf("餐點總費用: %.1f \n",sum);
        System.out.printf("5到餐點平均費用: %.2f",sum/sum1);
    }
}
