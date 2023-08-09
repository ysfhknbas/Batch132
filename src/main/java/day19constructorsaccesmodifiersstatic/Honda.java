package day19constructorsaccesmodifiersstatic;

public class Honda {

    public static int numOfProduced =0;

    public int price = 20000;

    public Honda()
    {
    numOfProduced++;
    price = price + 200;
    }
}
