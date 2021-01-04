package org.example.entity;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TITLE")
    private String title;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
