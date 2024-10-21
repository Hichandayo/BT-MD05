package ra.md05.student.service.department;

import ra.md05.student.model.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> findAll();
    Department findById(Integer id);
    Department add(Department department);
    Department update(Department department, Integer id);
    void changeDepartmentStatus(Integer id);
    void remove(Integer id);
}
