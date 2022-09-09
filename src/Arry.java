public class Arry {
    public static void main(String[] args) {
        System.out.println(max(4, 5));
        System.out.println(max(3, 5.4));

    }

    public static int max(int a, int b) {
        int z;
        z = a > b ? a : b;
        System.out.println(z);
        return z;

    }

    public static double max(double c, double b) {
        double z=0;
        z=c>b?c:b;
        System.out.println(z);
        return z;

    }
}
