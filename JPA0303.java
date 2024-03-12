package javh3;
public class JPA0303 {
    public static void main(String[] args) {
        System.out.print("Perfect numbers from 1 to 1000: ");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.print("  "+i);
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}