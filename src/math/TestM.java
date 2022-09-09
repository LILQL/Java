package math;
import java.util.Random;
public class TestM {
    public static void main(String[] args) {
        System.out.println("-1绝对值:"+Math.abs(-1));
        System.out.println(Math.max(-3.0, 4.5));
        System.out.println(Math.min(-3.0, 4.5));
        System.out.println(Math.round(4.5));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.pow(4,5));
        System.out.println(Math.PI);  
        System.out.println(Math.E);

        Random r = new Random();
        for(int i = 0; i < 10; i++){
            if(i!=9){
                System.out.print(r.nextInt(10)+" ");
                }else{
                System.out.println(r.nextInt(10)+" ");
                }
            }
        System.out.println("--------------------");
        Random r1 = new Random(10);
        for(int i = 0; i < 10; i++){
            System.out.print(r1.nextInt(10)+" ");
        }
    }
}
