package Singleton;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Cat {
    private String name;
    private int age;

    private static Cat instance;

    private Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Cat getInstance(String name, int age) {
        if (instance == null){
            instance = new Cat(name, age);
        }
        return instance;
    }
}
