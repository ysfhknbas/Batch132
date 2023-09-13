package day23encapsulationAbstraction;


public class StudentRunner {

    public static void main(String[] args) {

      Student myStd = new Student();
      System.out.println(myStd.getPsychologicalIssues());

      myStd.setPsychologicalIssues("bipolar");
        System.out.println(myStd.getPsychologicalIssues());

        myStd.setSucces(false);
        System.out.println(myStd.isSucces());


    }
}
