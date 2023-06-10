package com.example.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> RetrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn Springboot", "Someone"),
                new Course(2, "Learn AWS", "Someone"),
                new Course(3,"n","a")
        );
    }
}
