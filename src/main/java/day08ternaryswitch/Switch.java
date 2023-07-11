package day08ternaryswitch;

public class Switch {
    public static void main(String[] args) {

        //numbrer of days

        int dayn = 3;

        switch (dayn)
        {
            case  1:
                System.out.println("sunday");
                break;
            case  2:
                System.out.println("monday");
                break;
            case  3:
                System.out.println(dayn*2);
                break;
            case  4:
                System.out.println("wednesday");
                break;
            case  5:
                System.out.println("thursday");
                break;
            case  6:
                System.out.println("friday");
                break;
            case  7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("not valid");
        }


        int num = 9;
        switch (num+3) {


            case 5:
                System.out.println("sunday");
                break;
            case 11:
                System.out.println("monday");
                break;

        }




    }
}
