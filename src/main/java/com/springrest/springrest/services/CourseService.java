package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getReviews();
    public Course getReviewbyId(long courseId);
    public Course postReview(Course course);
    public Course updateReview(Course course);
    public void deleteReview(long parseLong);
}
