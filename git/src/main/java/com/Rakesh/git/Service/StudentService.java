package com.Rakesh.git.Service;

import com.Rakesh.git.Model.Student;
import com.Rakesh.git.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveDetails(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getDetails(){
        return studentRepository.findAll();
    }

    public Student getdetail(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student setstd(Student student){
        Student stdtemp=studentRepository.findById(student.getId()).orElse(null);
        if(stdtemp!=null){
            stdtemp.setName(student.getName());
            stdtemp.setMarks(student.getMarks());
            studentRepository.save(stdtemp);
            return stdtemp;
        }

        return null;
    }

    public void deletestd(int id){
        studentRepository.deleteById(id);
    }

}