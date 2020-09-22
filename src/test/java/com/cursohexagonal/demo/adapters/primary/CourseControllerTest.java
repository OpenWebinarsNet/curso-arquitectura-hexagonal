package com.cursohexagonal.demo.adapters.primary;

import com.cursohexagonal.demo.CourseRequest;
import com.cursohexagonal.demo.domain.Course;
import com.cursohexagonal.demo.ports.primary.CourseService;
import com.cursohexagonal.demo.ports.secondary.CourseRepository;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class CourseControllerTest {

    public CourseService courseService = mock(CourseService.class);

    public CourseController sut = new CourseController(courseService);

    public Course course = mock(Course.class);
    public CourseRequest courseRequest = mock(CourseRequest.class);

    @Test
    public void shouldGetAllCourses() {
        sut.getAllCourses();

        verify(courseService).getAllCourses();
    }

    @Test
    public void shouldSaveCourse() {
        sut.saveCourse(courseRequest);

        verify(courseService).saveCourse(course);
    }

}
