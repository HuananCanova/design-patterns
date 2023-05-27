package MethodFactory;

public class WildCatFactory implements CatFactory{
    @Override
    public Cat createCat() {
        return new Cat("Wild cat", 9);
    }
}
