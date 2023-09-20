package day24interface;

public class CarRummer {
    public static void main(String[] args) {

        Honda myHonda = new Honda();

        myHonda.cool();
        myHonda.heat();
        myHonda.run();
        myHonda.bacteriaKiller();
        Ac.climate();
        System.out.println(Ac.price);
        System.out.println(Engine.price);

    }
}
