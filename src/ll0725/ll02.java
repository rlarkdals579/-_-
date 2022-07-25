package ll0725;

class ll02 {
    public static void main(String[] args) {
        View2.OnClickListener aOnClickListener;

        aOnClickListener = () -> System.out.println("클릭되었다는 사실을 전달받았습니다.");
        aOnClickListener.onClick();
        // 출력 => 클릭되었다는 사실을 전달받았습니다.
    }
}

class View2 {
    static interface OnClickListener {
        public void onClick();
    }
}
