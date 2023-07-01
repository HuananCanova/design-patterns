package Last;

import Reflection.JSON;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GeradorChaveValor {
    public static String gera(Object o) throws InvocationTargetException, IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder("{\n");

        Method[] methods = o.getClass().getDeclaredMethods();

        for (Method method: methods) {
            if (method.isAnnotationPresent(JSON.class)){
                Object valor = method.invoke(o);
                System.out.println(valor);

                if (valor instanceof Number){
                }
                String nome = method.getName().substring(3).toLowerCase() + method.getName().substring(4);
                stringBuilder.append(nome).append(" = ").append(valor).append("\n");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
