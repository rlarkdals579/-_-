package ll0706;

public class q6 {
    //D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다.
    // 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.

    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

class 오리 {
    비행아이템 a비행아이템;

    오리() {
        a비행아이템 = new 날개아이템();
    }

    void 날다() {
        a비행아이템.작동();
    }
}

class 흰오리 extends 오리 {
}

class 청둥오리 extends 오리 {
}

class 고무오리 extends 오리 {
    고무오리() {
        a비행아이템 = new 못나는아이템();

    }
}

class 고무2오리 extends 오리 {
    고무2오리(){
        a비행아이템 = new 못나는아이템();
    }
}

abstract class 비행아이템 {
    void 작동() {
    }
}

class 날개아이템 extends 비행아이템 {
    @Override
    void 작동(){
        System.out.println("날개로 날아갑니다.");
    }
}

class 못나는아이템 extends 비행아이템 {
    @Override
    void 작동() {
        System.out.println("난 못날아");
    }
}