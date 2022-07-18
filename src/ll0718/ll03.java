package ll0718;

class ll03 {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");
        aMap.put("A", false);
        aMap.put("A", true);

        System.out.println(aMap.get("A"));
        // 출력 : true
    }
}

class HashMap {
    private Object[] keys;
    private Object[] datas;
    int size = 0;

    HashMap() {
        keys = new Object[100];
        datas = new Object[100];
    }

    void put(Object key, Object data) {
        keys[size] = key;
        datas[size] = data;
        size++;
    }

    Object get(Object key) {
        Object v = null;
        int index = indexOfKey(key);

        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            v = datas[index];
        }

        return v;
    }

    int indexOfKey(Object key) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                index = i;
                break;
            }
        }

        return index;
    }
}



