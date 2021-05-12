package com.example.practise1.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
//        Map<String,String> req = new HashMap<>();
//        req.put("hello","world");
//        return new ObjectMapper().writeValueAsString(req);
        Student student = new Student(
                1l,
                "mariam",
                "bashir@gmail.com",
                LocalDate.of(200, Month.APRIL,5),
                21

        );
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        return list;
    }

}
