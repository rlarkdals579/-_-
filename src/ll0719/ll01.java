package ll0719;

public class ll01 {
    public static void main(String[] args) {
        long sum = 0;
        long sum2 = 0;
        for(int i = 1; i < 100000; i++){
            if((i % 3 == 0 || i % 5 ==0) && ( i % 15 != 0)){
                sum += i;
            }
        }
        for(int a = 1; a < 100000; a++){
            if(a % 15 == 0){
                sum2 += a;
            }
        }
        System.out.println(sum + sum2);

    }
}
