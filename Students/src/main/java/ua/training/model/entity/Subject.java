package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int id;
    private String name;

    private List<Student> studentList=new ArrayList<>();
    private List<ControlWork> controlWork;

    public Subject() {
    }

    public Subject(int id, String name, List<Student> studentList, List<ControlWork> controlWork) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
        this.controlWork = controlWork;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<ControlWork> getControlWork() {
        return controlWork;
    }

    public void setControlWork(List<ControlWork> controlWork) {
        this.controlWork = controlWork;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentList=" + studentList +
                ", controlWork=" + controlWork +
                '}';
    }
}
