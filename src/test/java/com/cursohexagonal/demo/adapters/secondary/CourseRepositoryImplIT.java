package com.cursohexagonal.demo.adapters.secondary;

import com.cursohexagonal.demo.domain.Course;
import com.cursohexagonal.demo.ports.secondary.CourseRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class CourseRepositoryImplIT {

    @Autowired
    public MockMvc mockMvc;

    CourseRepositoryImpl courseRepository = new CourseRepositoryImpl();

    @Before
    public void setup(){
        courseRepository.addCourse(new Course("Curso 10", 20));
    }

    @Test
    public void shouldGetAllCourses() throws Exception {
        mockMvc.perform(
                get("/courses")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }



}
