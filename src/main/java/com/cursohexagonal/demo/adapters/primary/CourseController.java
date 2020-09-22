package com.cursohexagonal.demo.adapters.primary;

import com.cursohexagonal.demo.CourseRequest;
import com.cursohexagonal.demo.converters.CourseConverter;
import com.cursohexagonal.demo.domain.Course;
import com.cursohexagonal.demo.ports.primary.CourseService;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@Component
public class CourseController {

    @Autowired
    private CourseService courseService;

    private CourseConverter converter = Mappers.getMapper(CourseConverter.class);

    public CourseController() {

    }

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestParam CourseRequest course) {
        Course courseConverted = converter.convertCourseRequest(course);
        return courseService.saveCourse(courseConverted);
    }
}
