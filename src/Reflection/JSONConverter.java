package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JSONConverter {
    public String toJson(Object o){
        StringBuilder stringBuilder =  new StringBuilder("{\n");
        Method[] methods = o.getClass().getDeclaredMethods();
        for (Method method: methods){
            if (method.isAnnotationPresent(JSON.class)){
                String propertyName = method.getName().substring(3);
                String propertyValue;

                try {
                propertyValue = method.invoke(o).toString();
                } catch (Exception e) {
                    propertyValue = "null";
                }
                stringBuilder.append(" \"").append(propertyName).append("\":\"").append(propertyValue).append("\",\n");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
