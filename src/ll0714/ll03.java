package ll0714;

class ll03 {
    public static void main(String[] args) {
        ArrayList3 ar = new ArrayList3();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);
        ar.add(500);
        ar.add(600);
        ar.add(700);
        ar.add(800);
        ar.add(900);
        ar.add(1000);
        ar.add(1100);
        ar.add(1200);
        ar.add(1300);
        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300

        value = ar.get(3);
        System.out.println(value);
        // 출력 : 400
    }
}

class ArrayList3 {
    int[] datas;
    int lastIndex = -1;

    ArrayList3() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add(int data) {
        sizeUpIfFull();

        System.out.printf("데이터 %d 삽입됨\n", data);

        lastIndex++;

        datas[lastIndex] = data;
    }

    void sizeUpIfFull() {
        if ( isFull() ) {
            sizeUp();
        }
    }

    void sizeUp() {
        // 1 : 2배 더 큰 배열객체를 만든다.
        // 2 : 이사한다.
        // 3 : datas 가 더 이상 기존 배열객체를 가리키지 않고 이번에 새로 만든 배열 객체를 가리킨다.

        int[] newDatas = new int[datas.length * 2];

        for ( int i = 0; i < datas.length; i++ ) {
            newDatas[i] = datas[i];
        }

        System.out.printf("사이즈 업(%d => %d)\n", datas.length, newDatas.length);

        datas = newDatas;
    }

    boolean isFull() {
        return datas.length - 1 == lastIndex;
    }

    int get(int index) {
        return datas[index];
    }
}