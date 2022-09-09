package data;

import java.util.Calendar;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance(Locale.ENGLISH);
        System.out.println(c1);
        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MONTH));
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
    }
}
