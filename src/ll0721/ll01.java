package ll0721;

class ll01 {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 개());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}

class Button {
    private buttonClicker aListener;

    public void setClickEventListener(buttonClicker aListner) {
        this.aListener = aListner;
    }

    public void fireClick() {
        aListener.onClick();

    }
}

class 고양이 implements buttonClicker {
    public void EventResponse(){
        System.out.println("고양이는 방금 버튼을 클릭했다.");
    }
    public void onClick(){
        EventResponse();
    }

}

class 개 implements buttonClicker {
    public void EventResponse(){
        System.out.println("개는 방금 버튼을 클릭했다.");
    }
    public void onClick(){
        EventResponse();
    }

}

class 부엉이 implements buttonClicker {
    public void EventResponse(){
        System.out.println("부엉이는 방금 버튼을 클릭했다.");
    }
    public void onClick(){
        EventResponse();
    }

}

interface buttonClicker {
    public void onClick();
}