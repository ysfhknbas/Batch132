package day04stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*check those
        i) it sholud start with "J"
        ii) it sholud have at least 8 characters
        iii) Last 3 characters should "AVA"
         */

        String pw ="J76sVA";
        boolean first = pw.charAt(0)=='J';
        boolean sec = pw.length()>7;
        boolean th = pw.substring((pw.length())-3,pw.length()).equals("AVA");

        System.out.println(first);
        System.out.println(sec);
        System.out.println(th);


    }
}
