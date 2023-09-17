package day24interface;

public interface Ac {

    public abstract void cool();

    void heat();


    default void bacteriaKiller(){
        System.out.println("AC kills bacteria...");
    }

    static void climate(){
        System.out.println("climate...");
    }

    void run();

    int price=1500;



}
