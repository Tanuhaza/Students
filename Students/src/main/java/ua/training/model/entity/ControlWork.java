package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class ControlWork {
        private  int id;
        private float mark;
        private String name;

        private List<Assesment> assesmentList=new ArrayList<>();
        private Subject subject;

        public ControlWork() {
        }

    public ControlWork(int id, float mark, String name, List<Assesment> assesmentList, Subject subject) {
        this.id = id;
        this.mark = mark;
        this.name = name;
        this.assesmentList = assesmentList;
        this.subject = subject;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getMark() {
            return mark;
        }

        public void setMark(float mark) {
            this.mark = mark;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Assesment> getAssesmentList() {
        return assesmentList;
    }

    public void setAssesmentList(List<Assesment> studentList) {
        this.assesmentList = studentList;
    }

    public Subject getSubject() {
            return subject;
        }

        public void setSubject(Subject subject) {
            this.subject = subject;
        }

    @Override
    public String toString() {
        return "ControlWork{" +
                "id=" + id +
                ", mark=" + mark +
                ", name='" + name + '\'' +
                ", studentList=" + assesmentList +
                ", subject=" + subject +
                '}';
    }
}

