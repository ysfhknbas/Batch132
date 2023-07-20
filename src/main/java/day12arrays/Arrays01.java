package day12arrays;

public class Arrays01 {
    public static void main(String[] args) {

        String sixthGrade[] = new String[5];
        sixthGrade[0]= "Ali";
        sixthGrade[3]="veli";
        System.out.println(sixthGrade[0]+"-"+sixthGrade[3]);
        
        
        String names[] = new String[5];
        
        names[0] ="Ali";
        names[1] = "veli";
        names[2] = "deli";
        names[3] = "gali";
        names[4] = "somali";


        int total = 0;
        for (String w: names)
        {
        total = total + w.length();
        }
        System.out.println(total);
        
        
        

    }
}
