package ll0713;

public class ll01 {
    public static void main(String[] args) {
        String name1 = "안녕";
        String name2 = "안녕";

        String name3 = new String("안녕");
        String name4 = new String("안녕");

        if (name1 == name2) {
            System.out.println("1,2 같음");
        } else {
            System.out.println("1,2 다름");
        }

        if (name3 == name4) {
            System.out.println("3,4 같음");

        } else {
            System.out.println("3,4 다름");
        }

    }
}
