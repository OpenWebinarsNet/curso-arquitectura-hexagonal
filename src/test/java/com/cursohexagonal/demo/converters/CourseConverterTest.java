package com.cursohexagonal.demo.converters;

import com.cursohexagonal.demo.CourseRequest;
import com.cursohexagonal.demo.domain.Course;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.*;

public class CourseConverterTest {

    Course courseExpected = new Course("Curso 1", 30);
    CourseRequest courseRequest = new CourseRequest("Curso 1", 30);
    CourseConverter converter = Mappers.getMapper(CourseConverter.class);


    @Test
    public void shouldConvertRequestToDomain() {
        Course courseActual = converter.convertCourseRequest(courseRequest);
        assertEquals(courseExpected, courseActual);
    }

}
