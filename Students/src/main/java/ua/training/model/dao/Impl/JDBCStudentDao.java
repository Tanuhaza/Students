package ua.training.model.dao.Impl;

import ua.training.model.dao.StudentDao;
import ua.training.model.entity.Student;

import java.sql.Connection;
import java.util.List;

public class JDBCStudentDao implements StudentDao {

    private Connection connection;

    JDBCStudentDao(Connection connection){this.connection = connection;}

    @Override
    public void create(Student entity) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void update(Student entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
