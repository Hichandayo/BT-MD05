package ra.md05.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ra.md05.student.model.entity.Student;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
}
