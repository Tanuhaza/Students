package ua.training.model.dao.Impl;

import ua.training.model.dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

    @Override
    public StudentDao createStudentDao() {
        return new JDBCStudentDao(getConnection());
    }

    @Override
    public GroupDao createGroupDao() {
        return new JDBCGroupDao(getConnection());
    }

    @Override
    public SubjectDao createSubjectDao() {
        return new JDBCSubjectDao(getConnection());
    }

    @Override
    public CourseDao createCourseDao() {
        return new JDBCCourseDao(getConnection());
    }

    @Override
    public ControlWorkDao createControlWorkDao() {
        return new JDBCControlWorkDao(getConnection());
    }

    private Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentsdb",
                    "root" ,
                    "root" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
