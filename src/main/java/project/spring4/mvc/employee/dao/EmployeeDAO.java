package project.spring4.mvc.employee.dao;

import project.spring4.mvc.employee.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    int insertEmp(Employee emp);
    List<Employee> selectEmployee();
    Employee selectOneEmployee(int empid);
    int updateEmployee(Employee emp);
    int deleteEmployee(int empid);
}
