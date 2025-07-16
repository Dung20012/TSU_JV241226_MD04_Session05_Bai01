package com.data.session_05.service;

import com.data.session_05.model.Student;
import com.data.session_05.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository repository = new StudentRepository();
    public List<Student> getAllStudents(){
        return  repository.getAllStudents();
    }
}
