package student;



import java.util.Random;

public class Student {

private int id;
public static int nextId;
private String name;
private String surname;
private String group;
private Subject[] subjects;
private enum Subjects {

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    Student(){

    }

    public Student(int id, int nextId, String name, String surname, String group, SubjectsNames[] nameSubjects)
    {
        this.id=id;
        this.nextId=nextId;
        this.name=name;
        this.surname=surname;
        this.group=group;
        this.subjects=new Subject[nameSubjects.length];
        for(int i=0; i<subjects.length; i++)
        {
            subjects[i] = new Subject(nameSubjects[i]);
        }
    }


    public double serMark()
    {
        double sumMarks = 0;
        for (Subject subject : subjects)
        {
            sumMarks+=subject.getMark();
        }
        return sumMarks / subjects.length;
    }


    public void displaySubjects()
    {
        for (Subject subject : subjects)
        {
            System.out.printf("NameSubject: %s\n Mark: %.1f\n Passed: %b\n",subject.getNameSubject(),subject.getMark(),subject.getPassed());
        }
    }

//enum




    public enum SubjectsNames{
        Web,
        Java_programming,
        Networks,
        Data_Bases,
        TPPS
    }


    //Вложенный класс




    public class Subject {

        //private String nameSubject;
        private SubjectsNames nameSubject;
        private double mark;
        private boolean passed;

        public Subject()
        {

        }

        public double getMark() {
            return mark;
        }

        public boolean getPassed() {
            return this.passed;
        }

        public SubjectsNames getNameSubject() {
            return nameSubject;
        }

        public void setMark(double mark) {
            this.mark = mark;
        }

        public void setNameSubject(SubjectsNames nameSubject) {
            this.nameSubject = nameSubject;
        }

        public void setPassed(boolean passed) {
            this.passed = passed;
        }

        public Subject(SubjectsNames nSubject)
        {
            Random number = new Random();
            this.nameSubject = nSubject;
            this.mark = 2 + number.nextDouble() * 3;
            this.passed = passed_or_not();
        }

        private boolean passed_or_not()
        {
            if(this.mark <= 2)
            {
                return false;
            }
            else return true;
        }
    }



}

