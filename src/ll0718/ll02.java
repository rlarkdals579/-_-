package ll0718;

public class ll02 {
    public static void main(String[] args) {
        // 여기서 `저장소<>` 는 `저장소<Integer>` 가 생략된 표현이다.
        저장소<Integer> a정수저장소 = new 저장소<>();
        a정수저장소.set(10);
        System.out.println(a정수저장소.get() * a정수저장소.get());
        // 출력 => 100

        저장소<Boolean> a논리저장소 = new 저장소<>();
        a논리저장소.set(false);

        if (a논리저장소.get()) {
            System.out.println("참 : " + a논리저장소.get());
        } else {
            System.out.println("거짓 : " + a논리저장소.get());
        }
    }
}

class 저장소<T> {

    Object data;

    void set(T i) {
        this.data = i;
    }

    T get() {
        return (T)data;
    }
}

