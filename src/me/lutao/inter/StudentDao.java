package me.lutao.inter;

import me.lutao.bean.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDao {

    void setJdbcTemplate(JdbcTemplate j);

    void addStudent(Student student);

    void delStudentByID(String ID);

    void delStudentByName(String name);

    void delAllStudents();

    void updStudent(Student student);

    List<Student> allStudents();

    List<Student> queryStudentsByID(String ID);

    List<Student> queryStudentsByName(String name);

    List<Student> queryStudentsByAge(int age);
}
