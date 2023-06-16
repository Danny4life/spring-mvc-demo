package com.osiki.student.management.system.controller;

import com.osiki.student.management.system.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    // create handler method to handle list of students and return model and view

    @GetMapping("/students")
    public String listStudents(Model model){

         model.addAttribute("students", studentService.getAllStudents());

         // return the view

        return "students";

    }
}
