package ra.md05.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.md05.student.model.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
}

