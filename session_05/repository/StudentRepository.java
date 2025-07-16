package com.data.session_05.repository;

import com.data.session_05.model.Student;
import com.data.session_05.utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from students";
        try {
            Connection conn = Database.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setStudentName(rs.getString("student_name"));
                student.setEmail(rs.getString("email"));
                student.setBirthday(rs.getString("birthday"));
                student.setAvgMark(rs.getDouble("avg_mark"));
                students.add(student);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return students;
    }
}
