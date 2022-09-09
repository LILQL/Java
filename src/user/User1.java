package user;

class User
{
private String name;
private String password;
private static int count=0;//count用于统计个数必须用static 声明成全局属性
public User(){
  count++;
}//无参，在此用于返回count，并且无参数也不会报错
public User(String name){
  this.name=name;
  count++;
}//为用户名赋值,只输姓名不会报错
public User(String name,String password){
  this.name=name;
  this.password=password;
  count++;
}//为用户名和口令赋值，三种调用方式都可以

public String getName(){
  return name;
}
public void setName(String name){
  this.name=name;
}
public String getPassword(){
  return password;
}
public void setPassword(String password){
  this.password=password;
}

public void print(){
  System.out.println("用户名："+name+"\t"+"口令："+password);
}
public void count(){
  System.out.println("用户个数："+(count-1));
}
}


