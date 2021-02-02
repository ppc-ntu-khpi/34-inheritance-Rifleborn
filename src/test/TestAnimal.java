package test;
import domain.Psy_Dog;

public class TestAnimal {

    public static void main(String[] args) {
        Psy_Dog psy_dog = new Psy_Dog("Nipper");
        
        System.out.println(psy_dog);
        
        psy_dog.toString();
        psy_dog.speak();
        psy_dog.Attack();
        psy_dog.Create_Phantom(6);
        psy_dog.eat();
    }
}
