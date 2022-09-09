package bank;

import java.util.Scanner;

public class Land {
    Scanner in = new Scanner(System.in);

    String name;                //用户名
    String word;                //密码
    String number;              //操作选项
    Register register;

    public Land (Register register){
        this.register=register;
    }

    public void userLand(){                 //登录
        System.out.print("用户名：");
        name = in.nextLine();
        System.out.print("密码：");
        word = in.nextLine();

        while (true){
            int i = 0;          //用于标记是否登录成功，方便退出循环
            int k = 0;
            for(BankUser user:register.useRegister){
                if(user.getUserName().equals(name)){
                    while (true){
                        int n = 0;
                        if(user.getPassword().equals(word)){
                            System.out.println("登录成功！");
                            i = 1;
                            n = 1;

                            /*--------------登录之后的界面--------------*/
                            System.out.println("当前用户："+name);
                            System.out.println("1.查询账户余额");
                            System.out.println("2.转入");
                            System.out.println("3.支出");
                            System.out.println("4.查询交易记录");
                            System.out.println("5.退出");
                            System.out.println("请输入要执行的操作：");
                            /*----------------------------------------*/

                            while(true){                       //实现银行职能重复进行
                                number = in.nextLine();
                                user.userResearch(number);
                                if(number.equals("5")){
                                    k = 0;
                                    break;
                                }
                            }

                        }
                        else{
                            System.out.print("密码错误，请重新输入：");
                            word = in.nextLine();
                        }
                        if(n==1)break;
                    }
                }
                if(i==1)break;
                k++;
            }

            if(k==register.useRegister.size()){                 //遍历数组，若没相同用户名即不存在
                System.out.println("用户名不存在,请重新输入!");
                System.out.print("用户名：");
                name = in.nextLine();
                System.out.print("密码：");
                word = in.nextLine();
            }

            if(i==1)break;
        }
    }
}
