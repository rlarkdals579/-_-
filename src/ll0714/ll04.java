package ll0714;

class ll04 {
    public static void main(String[] args) {
        ArrayList44 ar = new ArrayList44();
        ar.add2(100);
        ar.add2(200);
        ar.add2(300);
        ar.add2(400);

        ar.remove(2);
        int value = ar.get(2);
        System.out.println(value);
        // 출력 : 400

        ar.remove(0);
        value = ar.get(0);
        System.out.println(value);
        // 출력 : 200

        ar.add2(78);
        value = ar.get(2);
        System.out.println(value);
        // 출력 : 78
    }
}

class ArrayList44 {
    int[] datas;
    int lastIndex = -1;

    ArrayList44() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add2(int data) {
        if (lastIndex + 1 >= datas.length) {

            int[] newArr = new int[datas.length * 2];

            for (int i = 0; i < datas.length; i++) {
                newArr[i] = datas[i];
            }

            datas = newArr;
        }

        lastIndex++;

        datas[lastIndex] = data;
    }

    int get(int index) {
        return datas[index];
    }

    int size() {
        return lastIndex + 1;
    }

    void remove(int index) {
        for (int i = index; i < lastIndex; i++) {
            datas[i] = datas[i + 1];
        }

        lastIndex--;
    }
}