package com.springboottut.springboot.repository;

import com.springboottut.springboot.domain.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

//    public List<Course> getCoursesByTopic(String topicId);
//    public List<Course> findByName(String name);

    public List<Course> findByTopicId(String topicId);
}
