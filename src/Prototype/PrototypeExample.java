package Prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        DomesticCat domesticCat = new DomesticCat("Domestic Cat", 3);
        WildCat wildCat = new WildCat("Wild Cat", 5);

        try {
            DomesticCat clonedDomesticCat = (DomesticCat) domesticCat.clone();
            clonedDomesticCat.setName("Cloned Domestic Cat");

            WildCat clonedWildCat = (WildCat) wildCat.clone();
            clonedWildCat.setName("Cloned Wild Cat");

            System.out.println(domesticCat.getName()); // Output: Domestic Cat
            System.out.println(clonedDomesticCat.getName()); // Output: Cloned Domestic Cat

            System.out.println(wildCat.getName()); // Output: Wild Cat
            System.out.println(clonedWildCat.getName()); // Output: Cloned Wild Cat
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
