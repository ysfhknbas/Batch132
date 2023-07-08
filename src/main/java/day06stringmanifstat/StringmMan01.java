package day06stringmanifstat;

public class StringmMan01 {
    public static void main(String[] args) {

       String s="Alabama";
       int idxA=s.indexOf('a');  //char
        System.out.println(idxA);

        String t="java is easy to learn, java is common in the market, java is OOP";
        int idxT= t.indexOf("java");  //String
        System.out.println(idxT);

        String u="miami";
        int idxM = u.lastIndexOf('m');
        System.out.println(idxM);

        String v="Learn Java earn money";
        int idxEarn =v.lastIndexOf("earn");
        System.out.println(idxEarn);

    }

}
