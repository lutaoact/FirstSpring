package me.lutao.bean;

import me.lutao.StudentMapper;
import me.lutao.inter.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentDaoImp implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setJdbcTemplate(JdbcTemplate j) {
        jdbcTemplate = j;
    }

    @Override
    public void addStudent(Student s) {
        String sql = "INSERT INTO test_jdbc.student(ID,name,age,FM)VALUES(?,?,?,?)";
        jdbcTemplate.update(sql, s.getID(), s.getName(), s.getAge(), s.getFM());
    }

    @Override
    public void delStudentByID(String ID) {
        String sql = "DELETE FROM test_jdbc.student WHERE ID=?";
        jdbcTemplate.update(sql, ID);
    }

    @Override
    public void delStudentByName(String name) {

    }

    @Override
    public void delAllStudents() {

    }

    @Override
    public void updStudent(Student student) {

    }

    @Override
    public List<Student> allStudents() {
        String sql = "select * from test_jdbc.student";
        return jdbcTemplate.query(sql, new StudentMapper());
    }

    @Override
    public List<Student> queryStudentsByID(String ID) {
        return null;
    }

    @Override
    public List<Student> queryStudentsByName(String name) {
        return null;
    }

    @Override
    public List<Student> queryStudentsByAge(int age) {
        return null;
    }

    public void displayAll() {
        List<Student> students = allStudents();
        for (Student s : students) {
            s.display();
        }
    }
}
