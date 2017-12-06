package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id ;
    private int courseNumber;

    private List<Group> groupList=new ArrayList<>();

    public Course() {
    }

    public Course(int id, int courseNumber, List<Group> groupList) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.groupList = groupList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseNumber=" + courseNumber +
                ", groupList=" + groupList +
                '}';
    }
}
