package string;

public class String_t {
    public static void main(String[] args) {
        String s="abcdefg";
        String s1="a b c";
        System.out.println(s.charAt(4));
        System.out.println(s.contains("abc"));
        System.out.println(s.equalsIgnoreCase("aBcaBcaBc"));
        System.out.println(s.indexOf("cab"));
        System.out.println(s.length());
        System.out.println(s.replace("abc","xqc"));//新串replace
        System.out.println(s);
        System.out.println("---");
        System.out.println(s.substring(0,5));
        System.out.println(s.toUpperCase());
        System.out.println(s1.replace("a b c","abc"));
        char[] c =s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(i==c.length-1){
                System.out.println(c[i]);
            }else{
                System.out.print(c[i]+",");
            }
        }
        String s2="abc-ab-c";
        String[] ss = s2.split("-");
        for(int i=0;i<ss.length;i++)
        {
            if(i==ss.length-1){
                System.out.print(ss[i]);
            }else{
                System.out.print(ss[i]+",");
                }
            }
    

    }

}
