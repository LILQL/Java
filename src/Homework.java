public class Homework {
    StringBuffer sb = new StringBuffer("abc");
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append(sb1);
        System.out.println(sb1);
        System.out.println(sb1);
    }
}
