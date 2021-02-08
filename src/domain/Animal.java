package domain;

public class Animal {

    protected String name;

    protected int weight;

    public void Animal() {
        name = "default";
        weight = 0;
    }

    public void eat() {
        System.out.println("Eating the victim...");
    }

    public void speak() {
        System.out.println("'I see you lonely stranger -_-'");
    }

    @Override
    public String toString() {
        return "Animal: " + "\nname: " + name + ", weight=" + weight;
    }
}
