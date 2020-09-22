package com.cursohexagonal.demo;

import java.util.Objects;

public class CourseRequest {

        private String title;
        private int duration;

        public CourseRequest(String title, int duration) {
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
        CourseRequest that = (CourseRequest) o;
        return duration == that.duration &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}


