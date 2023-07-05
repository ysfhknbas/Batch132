package day05stringmanipulations;

public class StringManip02 {

    public static void main(String[] args) {

        //delete all "a" in a string
String s= "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
String s1= s.replace("a","");
        System.out.println(s1);



        String t="Ali is 14 years an 149.56";
        String t1=t.replaceAll("[0-9]","");
        System.out.println(t1);

        //count how many digits in a string

        String u="Tom is 17 years old and 176 ";
        int n = u.replaceAll("[^0-9]","").length();
        System.out.println(n);


    }

}
