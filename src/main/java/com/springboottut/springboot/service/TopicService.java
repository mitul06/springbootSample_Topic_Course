package com.springboottut.springboot.service;

import com.springboottut.springboot.domain.Topic;
import com.springboottut.springboot.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllofTopics(){
//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopicbyId(String id){
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);
    }

    public void addTopicbyService(Topic topic) {
//        topics.add(topic);
        topicRepository.save(topic);
    }

    public Topic updateTopicbyService(String id, Topic topic) {
//        for (int i=0; i < topics.size(); i++){
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        return topicRepository.save(topic);
    }

    public void deleteTopicbyService(String id) {
        topicRepository.deleteById(id);
        //        topics.removeIf(t  -> t.getId().equals(id));
    }
}
