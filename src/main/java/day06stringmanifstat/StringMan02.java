package day06stringmanifstat;

public class StringMan02 {
    public static void main(String[] args) {

        String s= "New York";
        boolean r1 = s.contains("ew");
        boolean r2 = s.contains("en");
        System.out.println(r1);
        System.out.println(r2);


        String t ="java is java, I like java";
        String ut = t.replaceFirst("java","python");
        System.out.println(ut);
        String uf =t.repeat(4).toLowerCase();
        System.out.println(uf);


        int n= 20000;
        if(n<300 || n>3000)
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println("regular");
        }


        int num =175;
        int remainder;
        remainder = num%2;

        if(remainder==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
