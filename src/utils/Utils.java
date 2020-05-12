package utils;

import p.P;
import student.Student;
import java.text.DecimalFormat;

public class Utils {

    public static String getTheBestSubject(Student[] students)
    {
        DecimalFormat df = new DecimalFormat("###.#");

        double[] marksSumma = new double[students.length];

        for (Student student : students) {
            for (int i = 0; i < student.getSubjects().length; i++)
            {
                marksSumma[i]+=student.getSubjects()[i].getMark();
            }
        }

        double maxMark = marksSumma[0] / students.length;
        int count = 0;

        for(int i = 1; i < marksSumma.length; i++)
        {
            if(maxMark < (marksSumma[i] / students.length))
            {
                maxMark = marksSumma[i] / students.length;
                count = i;
            }
        }
        return System.out.printf("Best subject is " + students[0].getSubjects()[count].getNameSubject() +" , middle mark is " + df.format(maxMark) + "\n").toString();

    }



    public static Student getTheBestStudent(Student[] students)
    {
        Student bestStudent = students[0];

        for(int i = 1; i < students.length;i++)
        {
            if(bestStudent.serMark() < students[i].serMark())
            {
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }

}
