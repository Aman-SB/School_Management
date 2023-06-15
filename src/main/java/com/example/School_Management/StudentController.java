package com.example.School_Management;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer,Student> studentDb= new HashMap<>();
    @GetMapping("/get_info") //requesting data from the db
    public Student getStudent(@RequestParam("id") int admission_No){
        return studentDb.get(admission_No);
    }

    @PostMapping("/add") // inserting data into db
    public String insertStudentData(@RequestBody Student student){
        studentDb.put(student.getAdmission_no(),student);
        return "Student data Inserted into db";
    }

    @GetMapping(value = "/get/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int admission_No){
        return studentDb.get(admission_No);
    }


}
