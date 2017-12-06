package ua.training.model.dao.Impl;

import ua.training.model.dao.GroupDao;
import ua.training.model.entity.Group;
import ua.training.model.entity.Student;

import java.sql.Connection;
import java.util.List;

public class JDBCGroupDao implements GroupDao {
    private Connection connection;

    JDBCGroupDao(Connection connection){this.connection = connection;}

    @Override
    public void create(Group entity) {

    }

    @Override
    public Group findById(int id) {
        return null;
    }

    @Override
    public List<Group> findAll() {
        return null;
    }

    @Override
    public void update(Group entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
