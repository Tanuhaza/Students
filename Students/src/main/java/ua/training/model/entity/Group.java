package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private int groupName;

    private Course course;

    List<Student> studentList=new ArrayList<>();

    public Group() {
    }

    public Group(int id, int groupName, Course course, List<Student> studentList) {
        this.id = id;
        this.groupName = groupName;
        this.course = course;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupName() {
        return groupName;
    }

    public void setGroupName(int groupName) {
        this.groupName = groupName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName=" + groupName +
                ", course=" + course +
                ", studentList=" + studentList +
                '}';
    }
}
