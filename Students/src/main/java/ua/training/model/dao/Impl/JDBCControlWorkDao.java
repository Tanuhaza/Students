package ua.training.model.dao.Impl;

import ua.training.model.dao.ControlWorkDao;
import ua.training.model.entity.ControlWork;

import java.sql.Connection;
import java.util.List;

public class JDBCControlWorkDao implements ControlWorkDao {
    private Connection connection;

    JDBCControlWorkDao(Connection connection){this.connection = connection;}

    @Override
    public void create(ControlWork entity) {

    }

    @Override
    public ControlWork findById(int id) {
        return null;
    }

    @Override
    public List<ControlWork> findAll() {
        return null;
    }

    @Override
    public void update(ControlWork entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
