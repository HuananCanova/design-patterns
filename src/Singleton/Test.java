package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("Singleton.Cat");
        Cat cat = Cat.getInstance("Damon", 22);

        Constructor[] constructors = cat.getClass().getConstructors();

        for (Constructor constructor: constructors){
            System.out.println(constructor);
        }

        Field[] fields = aClass.getDeclaredFields();

        for (Field field: fields){
            System.out.println(field.getName());
        }


    }
}
