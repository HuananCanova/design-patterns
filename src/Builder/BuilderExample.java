package Builder;

public class BuilderExample {
    public static void main(String[] args) {
        Cat cat1 = new Cat.Builder()
                .name("Damon")
                .age(22)
                .build();

        Cat cat2 = new Cat.Builder()
                .name("Tom")
                .age(9)
                .build();

        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());

        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());

    }
}
