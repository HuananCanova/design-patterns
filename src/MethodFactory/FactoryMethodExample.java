package MethodFactory;

public class FactoryMethodExample {
    public static void main(String[] args) {
        CatFactory domesticCatFactory = new DomesticCatFactory();
        Cat domesticCat = domesticCatFactory.createCat();

        CatFactory wildCatFactory = new WildCatFactory();
        Cat wildCat = wildCatFactory.createCat();

        System.out.println(domesticCat.getName());
        System.out.println(wildCat.getName());
    }
}
