package day10forloopwhileloop;

public class ForLoop01 {
    public static void main(String[] args) {

        /*
        int a=2, b=8;
        for (int i=a; i<b; i++)
        {
        a=a*(i+1);
        }
        System.out.println(a);

        Integer c = 654321;
        c.toString().charAt(0)
        */

        String str = "makkam";
        String rev;

        for (int i=0; i<str.length(); i++)
        {
        //rev.charAt(i)=str.charAt(str.length()-1-i);
        }


//        Integer a = 45678;
//        int c = 45678;
//        String b = a.toString();
//        int length = b.length();
//        int sum =0;
//        for(int i=1; i<=length;i++){
//
//           int k = c%10;
//           c=c/10;
//           sum = sum+k;
//        }
//        System.out.println(sum);


        String p = "abcdcba1";
        String q = "";
        for (int i=p.length()-1;i>=0;i--){
            q=q+p.charAt(i);
        }
        System.out.println(p);
        System.out.println(q);
        System.out.println(p+q);



        Integer fr = 12321453;
        String strt = fr.toString();
        String xy="";
        int sum=0;
        for(int i=0;i<strt.length();i++){
            if(strt.indexOf(strt.charAt(i))==strt.lastIndexOf(strt.charAt(i))){
                sum =sum+Integer.valueOf(xy+strt.charAt(i));
            }
        }
        System.out.println(sum);


    }
}
