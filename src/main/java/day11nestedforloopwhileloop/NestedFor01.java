package day11nestedforloopwhileloop;

public class NestedFor01 {
    public static void main(String[] args) {

        for (int i=1; i<6;i++)

        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
