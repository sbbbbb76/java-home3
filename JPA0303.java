public class JPA0303 {
    public static void main(String[] args) {
        int tot = 0;
        for(int i=1 ; i <= 1000; i++){
            for (int a=1 ; a <= i ; a++){
                if (i%a == 0){
                    tot += i;
                }
                if(i == a){
                    if (tot == a){
                        System.out.println(a);
                        tot = 0;
                        break;
                    }else {
                        tot =0;
                        break;
                    }
                }
            }
                 
        }
        System.out.printf("1~1000的完美數有 : ");
    } 
}
