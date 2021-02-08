package domain;

public class Psy_Dog extends Animal {

    public String type;

    public void Create_Phantom(int num) {
        System.out.println("~Creating " + num + " phantoms~");
    }

    public void Attack() {
        System.out.println("Psy Dog attacking!");
    }

    public Psy_Dog(String name, int weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }
    
    public Psy_Dog(String name) {
        this(name,20,"Adult");
    }
    
    public Psy_Dog() {
        this("Nipper",20,"Adult");
    }
}
