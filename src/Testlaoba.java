import java.util.Scanner;

public class Testlaoba {
    public static void main(String[] args) {
        Dog laobaDog = new Dog();
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.next();

        laobaDog.setAge(age);
        laobaDog.setName(name);
        laobaDog.setBreed("是学生");
        laobaDog.setFurcolor("114514");
        System.out.print(laobaDog.getAge() + "岁，叫作" + laobaDog.getName() + "," + laobaDog.getBreed() + ",口头禅是"
                + laobaDog.getFurcolor());

        /*
         * Dog laobaDog = new Dog();
         * laobaDog.name = "laoba";
         * laobaDog.age = 24;
         * laobaDog.breed = "田所浩二";
         * laobaDog.furcolor = "是学生";
         * System.out.print(laobaDog.age + "岁," + laobaDog.furcolor + ",");
         * laobaDog.eat();
         * System.out.print("并且");
         * laobaDog.sleep();
         */
    }
}
