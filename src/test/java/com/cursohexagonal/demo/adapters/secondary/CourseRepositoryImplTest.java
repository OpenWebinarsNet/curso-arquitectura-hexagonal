package com.cursohexagonal.demo.adapters.secondary;

import com.cursohexagonal.demo.domain.Course;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CourseRepositoryImplTest {

    private CourseRepositoryImpl sut = new CourseRepositoryImpl();

    private Course course = new Course("TITULO", 30);

    @Before
    public void setup() {
        sut.addCourse(new Course("Curso 1", 60));
        sut.addCourse(new Course("Curso 2", 40));
        sut.addCourse(new Course("Curso 3", 20));
    }

    @Test
    public void shouldObtainData() {
        List<Course> allCourses = sut.findAll();

        assertEquals(allCourses.get(0).getTitle(), "Curso 1");
        assertEquals(allCourses.get(1).getTitle(), "Curso 2");
        assertEquals(allCourses.get(2).getTitle(), "Curso 3");
    }

    @Test
    public void shouldSaveData() {
        Course courseSave = sut.save(course);

        assertEquals(courseSave.getTitle(), "TITULO");
    }

}
