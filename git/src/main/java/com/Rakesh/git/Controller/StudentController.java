package com.Rakesh.git.Controller;

import com.Rakesh.git.Model.Student;
import com.Rakesh.git.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/savestd")
    public Student SaveDetails(@RequestBody Student student)
    {
        return studentService.saveDetails(student);
    }

    @GetMapping("/getstd")
    public List<Student> getstd(){
        return studentService.getDetails();
    }

    @GetMapping("/getstd/{id}")
    public Student getdetails(@PathVariable int id){
        return studentService.getdetail(id);
    }

    @PutMapping("/updatestd")
    public Student updatedetails(@RequestBody Student student){
        return studentService.setstd(student);
    }

    @DeleteMapping("/deletestd/{id}")
    public String deletestd(@PathVariable int id){
        studentService.deletestd(id);
        return "record is deleted";
    }
}
