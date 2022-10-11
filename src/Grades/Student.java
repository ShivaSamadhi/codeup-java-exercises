package Grades;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private String name;
    ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getAverageGrade(){
        Iterator<Integer> iter = grades.iterator();
        System.out.println(iter);
        return 1;
        }

}
