Student.java
package com.company;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    // To create a new student by initializing.-constructor
    //Fees for every student is $30,000.
    //Fees paid initially is 0.
    // id for the student: unique.
    // name of the student.
    //grade of the student.

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }


    //Not going to alter students'name,student's id.

    // Used to update the student's grade.

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Add the fees to the fees paid.
    // feespaid= 10,000+5000+ 15000
    //The school is going receive the funds.

    public void payFees(int fees) {
        this.feesPaid += fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFess() {
        return feesTotal - feesPaid;
    }
    public String toString(){
        return "Student's name : "+ name
                +"\nStudent's grade : "+ grade;
    }
}
