package com.data.session_05.controller;

import com.data.session_05.model.Student;
import com.data.session_05.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("")
    public ModelAndView listStudents(){
        List<Student> students = studentService.getAllStudents();
        ModelAndView mv = new ModelAndView("student-list");
        mv.addObject("students",students);
        return  mv;
    }
}
