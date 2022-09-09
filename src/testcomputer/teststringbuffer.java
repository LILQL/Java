package testcomputer;

public class teststringbuffer {
    public static void main(String[] args){
        String str ="abc";
        str.substring(1);
        System.out.println(str);

        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append(sb1);

        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);
    }
}
