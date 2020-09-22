package com.cursohexagonal.demo.ports.primary;

import com.cursohexagonal.demo.adapters.secondary.CourseRepositoryImpl;
import com.cursohexagonal.demo.domain.Course;
import com.cursohexagonal.demo.ports.secondary.CourseRepository;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class CourseServiceTest {

    private CourseRepositoryImpl repository = mock(CourseRepositoryImpl.class);

    private CourseService sut = new CourseService(repository);

    private Course course = mock(Course.class);

    @Test
    public void shouldGetAllCourses() {
        sut.getAllCourses();

        verify(repository).findAll();
    }

    @Test
    public void shouldSaveCourse() {
        sut.saveCourse(course);

        verify(repository).save(course);
    }


}
