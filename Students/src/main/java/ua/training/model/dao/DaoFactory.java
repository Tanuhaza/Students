package ua.training.model.dao;

import ua.training.model.dao.Impl.JDBCDaoFactory;

public abstract class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract StudentDao createStudentDao();
    public  abstract GroupDao createGroupDao();
    public abstract SubjectDao createSubjectDao();
    public abstract CourseDao createCourseDao();
    public abstract ControlWorkDao createControlWorkDao();

    public static DaoFactory getInstance() {
        if(daoFactory==null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    DaoFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
    return null;
    }
}
