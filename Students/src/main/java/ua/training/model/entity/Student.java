package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private  String firstName;
    private  String lastName;

    private Group group;

    List<Subject> subjectList = new ArrayList<>();
    List<Assesment> assesmentList = new ArrayList<>();

    public Student() {
    }

    public Student(int id, String firstName, String lastName, Group group, List<Subject> subjectList, List<Assesment> assesmentList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.subjectList = subjectList;
        this.assesmentList = assesmentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public List<Assesment> getControlWorkList() {
        return assesmentList;
    }

    public void setControlWorkList(List<Assesment> assesmentList) {
        this.assesmentList = assesmentList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", subjectList=" + subjectList +
                ", controlWorkList=" + assesmentList +
                '}';
    }
}
