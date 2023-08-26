package day21inheritance;

public class Vehicle
{

    public void move()
    {
        System.out.println("All vehicle move");
    }
    public void price()
    {
        System.out.println("All vehicle have price");
    }

    public Vehicle()
    {
        super();
        System.out.println("Vehicle constructor..");
    }

    public Vehicle(String name)
    {
        this();
        System.out.println("Vehicle constructor with String parameter");

    }
}
