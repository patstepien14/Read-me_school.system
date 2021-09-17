School.java
package com.company;

import java.util.List;

public class School {
    private List<Teachers> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;


    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teachers teachers) {
        teachers.add(teachers);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int MoneyEarned) {
        this.totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        this.totalMoneyEarned-=moneySpent;

    }

    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;

    }
}
