package org.example.domain;

import org.example.blogic.HibernateUtil;
import org.example.entity.Address;
import org.example.entity.Employee;
import org.example.entity.Project;
import org.example.service.AddressService;
import org.example.service.EmployeeService;
import org.example.service.ProjectService;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Domain {
    public static void main(String[] args) throws SQLException {

        AddressService addressService = new AddressService();
        EmployeeService employeeService = new EmployeeService();
        ProjectService projectService = new ProjectService();

        Address address = new Address();
        address.setCountry("DC");
        address.setCity("Gotham city");
        address.setStreet("Arkham street 1");
        address.setPostCode("12345");

        Project project = new Project();
        project.setTitle("Gotham PD");

        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Gordon");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1939, Calendar.MAY, 1);

        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        project.setEmployees(employees);

        Set<Project> projects = new HashSet<Project>();
        projects.add(project);
        employee.setProjects(projects);

        addressService.add(address);
        employeeService.add(employee);
        projectService.add(project);

        HibernateUtil.shutdown();
    }
}