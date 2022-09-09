package bank;
import java.util.ArrayList;
import java.util.Scanner;

public class BankUser {
    ArrayList<Double> record = new ArrayList<Double>();
    Scanner in = new Scanner(System.in);

    private String userName;            //用户名
    private String password;            //密码
    double sum = 0.0;                   //银行账户总额
    double input;                       //转入金额
    double output;                      //支出金额

    public BankUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void userResearch(String number){                //用于实现银行的基本业务，即登录后的相关操作
        if(number.equals("1")){                             //查询账户余额
            System.out.println("账户余额为"+sum);
        }
        else if(number.equals("2")){                         //转入金额
            System.out.print("请输入转入多少金额：");
            input = in.nextDouble();
            sum += input;
            record.add(input);
            System.out.println("交易完成！");
        }
        else if(number.equals("3")){                         //支出金额
            System.out.println("请输入支出多少金额：");
            output = in.nextDouble();
            sum -= output;
            record.add(-output);
            System.out.println("交易完成！");
        }
        else if(number.equals("4")){                          //交易明细
            for(int j=1;j<=record.size();j++){
                if(record.get(j-1)>=0.0)
                    System.out.println(j+". +"+record.get(j-1));
                else
                    System.out.println(j+". "+record.get(j-1));
            }

        }
        else{                                                 //返回上个界面
            number="5";
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
