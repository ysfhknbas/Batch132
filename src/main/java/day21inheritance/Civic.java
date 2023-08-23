package day21inheritance;

public class Civic extends Honda
{

    public void ecosystem()
    {
        System.out.println("Civic is not expensive");
    }

    public Civic()
    {
        System.out.println("Civic constructor..");
    }

    public Civic(boolean hybrid)
    {
        super(2021);
        System.out.println("Civic consructor with boolean parameters");
    }
}
