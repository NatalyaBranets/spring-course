package org.example.service;

import org.example.blogic.SessionUtil;
import org.example.dao.EmployeeDAO;
import org.example.dao.ProjectDAO;
import org.example.entity.Employee;
import org.example.entity.Project;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class ProjectService extends SessionUtil implements ProjectDAO {

    public void add(Project project) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(project);
        closeTransactionSession();
    }

    public List<Project> getAll() throws SQLException {
        openTransactionSession();
        String sql = "SELECT * FROM PROJECT";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Project.class);
        List<Project> projectList = query.list();
        closeTransactionSession();

        return projectList;
    }

    public Project getById(Long id) throws SQLException {
        openTransactionSession();

        String sql = "SELECT * FROM PROJECT WHERE ID = :id";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Project.class);
        query.setParameter("id", id);

        Project project = (Project) query.getSingleResult();

        closeTransactionSession();

        return project;
    }

    public void update(Project project) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.update(project);

        closeTransactionSession();
    }

    public void remove(Project project) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.remove(project);

        closeTransactionSession();
    }
}
