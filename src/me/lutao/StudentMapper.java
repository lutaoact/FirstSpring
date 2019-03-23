package me.lutao;

import me.lutao.bean.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setID(rs.getString("ID"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setFM(rs.getString("FM"));
        return student;
    }
}
