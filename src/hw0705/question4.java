//package hw0705;
//
//public class question4 {
//    public static void main(String[] args) {
//        전사 a전사 = new 홍길동();
//        a전사.a무기 = new 활();
//
//        a전사.공격();
//        // 출력 => 홍길동이(가) 활(으)로 공격합니다.
//
//        a전사 = new 홍길순();
//        a전사.공격();
//        // 출력 => 홍길순이(가) 칼(으)로 공격합니다.
//
//        a전사.a무기 = new 창();
//        a전사.공격();
//        // 출력 => 홍길순이(가) 창(으)로 공격합니다.
//    }
//}
//
//class 전사 {
//    무기 a무기;
//    전사 a전사;
//
//    void 공격() {
//    }
//}
//class 홍길순 extends 전사{
//
//}
//class 홍길동 extends 전사{
//
//}
//
//abstract class 무기 {
//    abstract void 공격();
//}
//
//class 창 extends 무기 {
//    @Override
//    void 공격() {
//        System.out.println("창으로 공격합니다.");
//    }
//}
//
//class 활 extends 무기 {
//    @Override
//    void 공격() {
//        System.out.println("활로 공격합니다.");
//    }
//}