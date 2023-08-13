package day19constructorsaccesmodifiersstatic;

public class Teacher {

    public String teacherName = "Tom"; //everybody knows...accecible from entire the project

    protected long phone = 654687687L; //only a group...acecible from inside package and classes, outside the packega if the class are child

    int salary = 6000; // some people (default acces modifier no need to write defaulr) ...accecible from entire  package

    private String ssn = "876876987"; // in a class no one else
}
