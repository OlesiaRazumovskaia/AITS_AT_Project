package HomeworckOOP;

public class MultipleFour {
    public static void main(String[] args) {
        for (int i = 100; i > 3; i--) {
            if (checkMultiple(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkMultiple(int i) {
        return i % 4 == 0;
    }
}
