package ll0707;

public class ll01 {
    public static void main(String[] args) {
        new 사람2();
        // 출력 : 사람이 태어났습니다.

        new 사람2(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람2(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}

class 사람2 {
    int age;

    사람2() {
        System.out.println("사람이 태어났습니다.");
    }

    사람2(int age) {
        System.out.println("태어나부터gi " + age + "살인 사람이 태어났습니다.");
    }
}

