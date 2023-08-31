package day22overridingEncapsulation;

public class Student {

    public String stdName;
    int stdGpa;
    private String psychologicalIssues = "Depression";

    public String getPsychologicalIssues() {
        return psychologicalIssues;
    }
}
