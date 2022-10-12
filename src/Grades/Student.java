package Grades;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private double average;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String toString(){
         String student = String.format("Name: %s | Average: %.2f |", this.name, getAverageGrade());
        return student;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getAverageGrade() {
        double total = 0;
        average = 0;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
            average = total / grades.size();
        }
        return average;
    }

    public static void main(String[] args) {

    }
}
