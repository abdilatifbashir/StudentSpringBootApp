package com.example.practise1.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/vi/student")
public class StudentController {
    @GetMapping()
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
