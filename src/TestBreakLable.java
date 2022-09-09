public class TestBreakLable {
    public static void main(String[] arg) {
        lable: for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                System.out.println("i=" + i + "," + "j=" + j);
                if (j == 2)
                    break lable;
            }
        }
    }
}
