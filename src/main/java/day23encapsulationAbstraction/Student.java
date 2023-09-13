package day23encapsulationAbstraction;

public class Student {

    public String stdName;
    int stdGpa;
    private String psychologicalIssues = "Depression";

    private boolean succes = true;

    public String getPsychologicalIssues() {
        return psychologicalIssues;
    }

    public boolean isSucces() {
        return succes;
    }
    public void setSucces(boolean succes) {
        this.succes = succes;
    }

    public void setPsychologicalIssues(String psychologicalIssues){
        this.psychologicalIssues=psychologicalIssues;
    }
}
