public class TestIfElse {
    public static void main(String[] args) {
        double PI = 3.14;
        int r = -2;
        double perimeter = 0.0;
        double area = 0.0;
        if (r >= 0) {
            perimeter = 2 * r * PI;
            area = r * r * PI;
            System.out.println(
                    "圆半径" + r + "的周长为；" + perimeter + ",面积为；" + area);
        } else {
            System.out.println("圆的半径不能是负数!");
        }
    }
}
