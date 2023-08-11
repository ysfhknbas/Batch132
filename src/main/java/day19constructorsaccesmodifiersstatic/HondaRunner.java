package day19constructorsaccesmodifiersstatic;

public class HondaRunner {
    public static void main(String[] args) {
        Honda myHonda = new Honda();
        Honda myHonda2 = new Honda();
        System.out.println(myHonda.price);
        System.out.println(myHonda.numOfProduced);


        System.out.println(myHonda2.price);
        System.out.println(myHonda2.numOfProduced);

    }
}
