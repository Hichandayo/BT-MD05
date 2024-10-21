package ra.md05.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.md05.student.model.entity.Employee;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByDepartmentId(Integer departmentId);
}
