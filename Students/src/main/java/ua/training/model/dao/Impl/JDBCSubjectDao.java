package ua.training.model.dao.Impl;

import ua.training.model.dao.SubjectDao;
import ua.training.model.entity.Subject;

import java.sql.Connection;
import java.util.List;

public class JDBCSubjectDao implements SubjectDao {
    private Connection connection;

    public JDBCSubjectDao(Connection connection){this.connection=connection;}

    @Override
    public void create(Subject entity) {

    }

    @Override
    public Subject findById(int id) {
        return null;
    }

    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public void update(Subject entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
