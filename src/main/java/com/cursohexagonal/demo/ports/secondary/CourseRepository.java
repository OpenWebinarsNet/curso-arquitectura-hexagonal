package com.cursohexagonal.demo.ports.secondary;

import com.cursohexagonal.demo.domain.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface CourseRepository {

    List<Course> findAll();

    Course save(Course course);
}
