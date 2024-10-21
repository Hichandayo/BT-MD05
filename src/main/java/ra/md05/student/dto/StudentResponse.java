package ra.md05.student.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import ra.md05.student.model.entity.Student;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentResponse {
    private List<Student> data;
    private HttpStatus httpStatus;

}
