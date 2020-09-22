package com.cursohexagonal.demo.converters;

import com.cursohexagonal.demo.CourseRequest;
import com.cursohexagonal.demo.domain.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseConverter {

    Course convertCourseRequest(CourseRequest courseRequest);
}
