package arraylist;
import java.util.*;

public class Arr_Test {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        arr.add(1000);
        arr.add("phone");
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println("--------------");
        LinkedList arr2 =new LinkedList();
        arr2.add(1);
        arr2.add("123");
        arr2.add(true);
        arr2.add(0,"张三丰");
        arr2.addFirst(100.0);
        arr2.addLast("end");
        System.out.println(arr2.get(0));
        System.out.println(arr2.getLast());
        arr2.removeLast();
        arr2.remove(2);
        System.out.println(arr2);


    }

}
