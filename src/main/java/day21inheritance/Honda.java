package day21inheritance;

public class Honda extends Vehicle {


    public void engine()
    {

        System.out.println("Honda uses engine");
    }
    public void brake()
    {

        System.out.println("Honda stops securely");
    }

    public Honda()
    {
        super();
        System.out.println("Honda constructor");

    }

    public Honda(int year)
    {
        super(("Luxry"));
        System.out.println("Honda constructor with int parameter");

    }

}
