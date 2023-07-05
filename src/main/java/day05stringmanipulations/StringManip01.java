package day05stringmanipulations;

public class StringManip01 {

    public static void main(String[] args) {

        String s="Alabama";

        boolean result1 = s.charAt(6)=='a';
        System.out.println(result1);

        boolean result2 =s.startsWith("a",5);
        System.out.println(result2);


    }

}
