package day24interface;

public class Honda implements Ac,Engine{
    @Override
    public void cool() {
        System.out.println("AC cools well..");
    }

    @Override
    public void heat() {
        System.out.println("Ac heats well...");
    }

    @Override
    public void run() {
        System.out.println("Engines run..");
    }
}
