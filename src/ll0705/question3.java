package ll0705;

public class question3 {
    public static void main(String[] args) {
        int 결과 = 계산기.get_n부터_m까지의_수_중에서_3의배수의_합(3, 100);

        System.out.println(결과);
        // 출력 => ???
    }
}

class 계산기 {
    static int get_n부터_m까지의_수_중에서_3의배수의_합(int a, int b) {
        int sum = 0;
        while (a <= b) {
            if (a % 3 == 0) {
                sum += a;
            }
            a++;
        }
        return sum;
    }
}

