package Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Cat cat1 = Cat.getInstance("Damon", 2);
        Cat cat2 = Cat.getInstance("Devil", 5);


        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());

        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());

    }
}
