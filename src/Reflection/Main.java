package Reflection;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(20l,"Notebook", "hardwaregame",12);
        JSONConverter jsonConverter = new JSONConverter();
        String json = jsonConverter.toJson(product);
        System.out.println(json);
    }
}
