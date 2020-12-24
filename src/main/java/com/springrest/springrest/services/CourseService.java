package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getReviews();
    public Course getReviewbyId(Long courseId);
    public Course postReview(Course course);
}
