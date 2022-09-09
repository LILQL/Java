package string.system;

public class Test1 {
    public static void main(String[] args){
        //from 1970-01-01 00:00:00 to now;
        //计时器 现在-启动时间
        long time = System.currentTimeMillis();
        System.out.println(time);
        
        System.out.println(System.getProperty("java.version"));
    }
}
