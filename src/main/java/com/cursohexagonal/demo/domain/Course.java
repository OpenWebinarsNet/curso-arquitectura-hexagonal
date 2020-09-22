package com.cursohexagonal.demo.domain;


import java.util.Objects;

public class Course {

    private String title;
    private int duration;

    public Course() {

    }
    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return duration == course.duration &&
                Objects.equals(title, course.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
