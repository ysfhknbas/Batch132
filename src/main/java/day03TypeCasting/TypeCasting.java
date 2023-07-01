package day03TypeCasting;

public class TypeCasting {

    public static void main(String[] args) {

        int x= 12 ,y=64;
        String s= "tom";
        System.out.println(x+y+s);
        System.out.println(s+x+y);


        //AutoWidenning

        short t = 12;
        long m = t;


        int big=400;
        byte small = (byte) big;


        //Exlipicitly Narrowing

        //AutoBoxing-Wrapper Clas

        int i = 23;
        Integer wi =i;



        System.out.println(small);


    }
}
