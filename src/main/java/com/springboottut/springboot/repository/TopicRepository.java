package com.springboottut.springboot.repository;

import com.springboottut.springboot.domain.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
