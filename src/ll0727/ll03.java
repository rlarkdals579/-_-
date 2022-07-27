package ll0727;


class ll03 {
    public static void main(String[] args) {
        Activity activity = new MainActivity();
        activity.onCreate();
    }
}

abstract class Activity {
    abstract public void onCreate();
}

class MainActivity extends Activity {
    @Override
    public void onCreate() {
        System.out.println("메인 액티비티가 실행되었습니다. 4번");

        // 아래 코드가 실행되도록 해주세요.
        View.OnClickListener a = new 사과();
        View aButton = new Button(this);
        aButton.setOnClickListener(a);

        aButton.fireClickEvent();
        // 출력 : 사과는 버튼이 클릭되었다는 사실을 방금 알았습니다.!
        // 조건 : 위 문구는 사과 클래스 안의 메서드에 의해서 출력되어야 합니다.
    }
}

abstract class View {
    private OnClickListener onClickListener;

    static interface OnClickListener {
        void onClick();
    }

    void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void fireClickEvent() {
        this.onClickListener.onClick();
    }
}

class Button extends View {
    Button(Activity activity) {
    }
}

class 사과 implements View.OnClickListener {
    public void onClick() {
        System.out.println("사과는 버튼이 클릭되었다는 사실을 방금 알았습니다.!");
    }

}


