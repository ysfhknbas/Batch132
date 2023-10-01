package day27enumsexceptions;

public class E01 {
    public static void main(String[] args) {

        System.out.println(divide(5,2));
        System.out.println(divide(0,5));
        System.out.println(divide(5,0));


    }

   /* public static int divide(int a, int b){           error code
        return a/b;
    }
*/
    public static Object divider(int a, int b){

        if(b==0){
            return " ! ";
        }

        return a/b;
    }


    public static int divide (int a, int b){
        int result=0;

        try {
            result = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("kytfkuyl");
        }
        return result;


    }
}
