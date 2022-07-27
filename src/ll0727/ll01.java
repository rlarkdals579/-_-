package ll0727;


class ll01 {
    public static void main(String[] args) {
        Activity2 activity = new MainActivity2();
        activity.onCreate();
        // 출력 => 메인 액티비티가 실행되었습니다.
    }
}

abstract class Activity2 {
    abstract public void onCreate();
}

class MainActivity2 extends Activity2{
    @Override
    public void onCreate(){
        System.out.println("메인 액티비티 실행");
    }
}