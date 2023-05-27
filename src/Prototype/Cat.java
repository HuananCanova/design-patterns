package Prototype;

import lombok.Data;

@Data
abstract class Cat implements Cloneable {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Cat clone() throws CloneNotSupportedException {
        return (Cat) super.clone();
    }
}

