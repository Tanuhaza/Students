package ua.training.model.dao.Impl;

import ua.training.model.dao.CourseDao;
import ua.training.model.entity.Course;

import java.sql.Connection;
import java.util.List;

public class JDBCCourseDao implements CourseDao{
    private Connection connection;

    JDBCCourseDao(Connection connection){this.connection = connection;}

    @Override
    public void create(Course entity) {

    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public void update(Course entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
