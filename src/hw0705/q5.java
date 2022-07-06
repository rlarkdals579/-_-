package hw0705;

public class q5 {
    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }
}


abstract class 전사 {
    무기 a무기;
    void 공격() {
        a무기.사용();
    }
}

class 전사타입A extends 전사 {
    전사타입A(){
        a무기 = new 칼();
    }
}

class 전사타입B extends 전사 {
    전사타입B(){
        a무기 = new 칼();
    }
}

class 전사타입C extends 전사 {
    전사타입C(){
        a무기 = new 활();
    }
}

class 전사타입D extends 전사 {
    전사타입D(){
        a무기 = new 활();
    }
}

abstract class 무기{
    String 무기이름;
    void 사용(){
        System.out.println(무기이름 + "(으)로 공격합니다.");
    }
}

class 칼 extends 무기{
    칼(){
        this.무기이름 = "칼";
    }
}

class 활 extends 무기{
    활(){
        this.무기이름 = "활";
    }
}