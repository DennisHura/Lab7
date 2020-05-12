package com.company;

import student.Student;
import p.P;
import utils.Utils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###.#");







        Student[] students = new Student[5];

        students[0] = new Student( 1, 2, "Jack" , "Sparrow","KB-71", Student.SubjectsNames.values());
        students[1] = new Student( 2, 3, "Vlad" , "Bags","KB-71", Student.SubjectsNames.values());
        students[2] = new Student( 3, 4, "Vilely" , "Vonka","KB-72", Student.SubjectsNames.values());
        students[3] = new Student( 4, 5, "Santa" , "Claus","KB-71", Student.SubjectsNames.values());
        students[4] = new Student( 5, 6, "Dipper" , "Paints","KB-72", Student.SubjectsNames.values());

        for (Student student : students)
        {
            P.rintln("studentID: " + student.getId() + "\n" + "Name: " + student.getName() + "\n" + "Surname: " + student.getSurname() + "\n" + "Group: " + student.getGroup());
            System.out.println("Middle Mark is "+ df.format(student.serMark()));
            student.displaySubjects();
            P.rintln("");
        }

        Student bestStudent = Utils.getTheBestStudent(students);
        System.out.println("Best mark have " + bestStudent.getName() + " " + bestStudent.getSurname() + " from " + bestStudent.getGroup() +". His(her) middle mark is "+ df.format(bestStudent.serMark()));
        String bestSubject = Utils.getTheBestSubject(students);
        P.rintln(bestSubject);
    }
}
