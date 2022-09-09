package bank;
import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    ArrayList<BankUser> useRegister = new ArrayList<BankUser>();
    Scanner in = new Scanner(System.in);

    String name;        //用户名
    String word;        //密码

    public void addUser(BankUser user){             //将注册的信息添加进数组
        useRegister.add(user);
    }

    public void registerUser(){                     //注册
        System.out.print("请输入用户名：");
        name = in.nextLine();
        System.out.print("请输入密码：");
        word=in.nextLine();

        while(true){                                //密码不少于6位
            if(word.length()<6){
                System.out.println("密码长度不能小于6位，请重新输入：");
                word=in.nextLine();
            }
            else
                break;
        }

        BankUser customer = new BankUser(name,word);
        addUser(customer);
        System.out.println("注册成功！");
    }
}
