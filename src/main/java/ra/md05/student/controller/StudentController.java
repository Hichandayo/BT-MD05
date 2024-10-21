package ra.md05.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.md05.student.dto.StudentResponse;
import ra.md05.student.model.entity.Student;
import ra.md05.student.repository.IStudentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private IStudentRepository iStudentRepository;

    @GetMapping
    public ResponseEntity<StudentResponse> getAll() {
        List<Student> students = iStudentRepository.findAll();
        //phuong thuc tinhx
        return ResponseEntity.ok().body(new StudentResponse(students, HttpStatus.OK));
    }
}
