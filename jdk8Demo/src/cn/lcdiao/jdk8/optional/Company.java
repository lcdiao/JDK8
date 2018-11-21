package cn.lcdiao.jdk8.optional;

import java.util.List;

/**
 * Created by lcd on 2018/11/21.
 */
public class Company {
    private String name;
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

