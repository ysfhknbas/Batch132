package day19constructorsaccesmodifiersstatic;

public class StudentsRunner {
    public static void main(String[] args) {

        Students std1 = new Students("Tom",13,true,"male");
        Students std2 = new Students("Ali",21,false);
        Students std3 = new Students();

        System.out.println(std1.stdName);
        System.out.println(std2.gender);
        System.out.println(std3.age);




    }





}
