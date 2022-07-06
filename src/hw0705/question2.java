package hw0705;

import java.util.Objects;

public class question2 {
    public static void main(String[] args) {
        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.
        a병사.공격();
        // 홍길동 이병이 공격합니다.(공격력 : 7)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 일병 입니다.
        a병사.공격();
        // 홍길동 일병이 공격합니다.(공격력 : 9)

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 상병 입니다.
        a병사.공격();
        // 홍길동 상병이 공격합니다.(공격력 : 11)
    }
}

class 병사 {
    String 이름;
    String 계급;
    int 공격력;

    병사() {
        계급 = "이병";
        공격력 = 7;
    }
    public void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.이름 + " " + this.계급 + "입니다. (공격력 : " + this.공격력 + ")");
    }

    public void 진급() {
        if (Objects.equals(this.계급, "이병")) {
            this.계급 = "일병";
        }
        else if (Objects.equals(this.계급, "일병")) {
            this.계급 = "상병";
        }
        else if (Objects.equals(this.계급, "상병")) {
            this.계급 = "병장";
        }
    }

    public void 공격() {
        this.공격력 += 2;
    }
}