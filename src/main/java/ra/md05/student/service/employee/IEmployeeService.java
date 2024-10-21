package ra.md05.student.service.employee;

import ra.md05.student.model.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(Integer id);
    void changeEmployeeStatus(Integer id);
    Employee add(Employee employee);
    Employee update(Employee employee, Integer id);
    void remove(Integer id);
    List<Employee> findAllEmployeeByDepartmentId(Integer categoryId);
}
