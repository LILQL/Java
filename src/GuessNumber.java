import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int ramdomNumber = new Random().nextInt(10);
        // System.out.println("生产的随机数是；"+ ramdomNumber);
        System.out.println("已生成一个0-9的数字！");
        System.out.println("输入数字");
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        while (a != ramdomNumber) {
            if (a > ramdomNumber) {
                System.out.println("你回答的数字太大了！请重新输入!");
            } else {
                System.out.println("你回答的数字太小了！请重新输入");
            }
            System.out.println("请输入你选择的数字，并按回车键");
            a = sca.nextInt();
        }
        if (a == ramdomNumber) {
            System.out.println("恭喜您回答正确！这个数字就是" + ramdomNumber);
        }
    }
}