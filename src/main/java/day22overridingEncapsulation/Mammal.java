package day22overridingEncapsulation;

public class Mammal extends Animal {
    public void feed(){
        System.out.println("Mammals feed babies");
    }


    public Mammal opccur(){
        return new Mammal();
    }
}
