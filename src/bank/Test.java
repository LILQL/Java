package bank;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Register register = new Register();
        Land land = new Land(register);
        Scanner in = new Scanner(System.in);

        String number;

        while(true){
            
        /*------------------初始界面------------------*/  
            System.out.println("欢迎使用银行账户管理系统");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            System.out.print("请输入要执行的操作：");
            number = in.nextLine();
        /*--------------------------------------------*/

            if(number.equals("2")){                 //注册
                register.registerUser();
            }
            else if(number.equals("1")){            //登录
                land.userLand();
            }
            else if(number.equals("3"))             //退出
                break;
        }
    }
}

