package Last;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person person = new Person("Huanan", 22);
        System.out.println(GeradorChaveValor.gera(person));
    }
}
