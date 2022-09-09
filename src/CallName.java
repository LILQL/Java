import java.util.Random;
import java.util.Scanner;

public class CallName {
    public static void main(String[] args) {
        int[] names = new int[10];
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个名字:");
            Scanner sc = new Scanner(System.in);
            names[i] = sc.nextInt();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
        System.out.println("=============");

        int ramdomname = new Random().nextInt(10);
        System.out.println(names[ramdomname]);
    }

}
