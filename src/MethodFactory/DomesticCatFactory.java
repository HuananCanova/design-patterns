package MethodFactory;

public class DomesticCatFactory implements CatFactory{
    @Override
    public Cat createCat() {
        return new Cat("Domestic cat", 3);
    }
}
