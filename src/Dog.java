public class Dog {
    // 属性
    private int age;
    private String name;
    private String breed;
    private String furcolor;

    public void eat() {
        System.out.println(name + "正在吃aoligei");
    }

    public void sleep() {
        System.out.println("正在aaaaaaaaaah");
    }

    // age
    public void setAge(int age) {

        if (age < 0 || age > 100) {
            System.out.println("年龄不符合常规");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    // name
    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    // breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    // furColor

    public String getFurcolor() {
        return furcolor;
    }

    public void setFurcolor(String furcolor) {
        this.furcolor = furcolor;
    }

}