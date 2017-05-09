package io.javatutorials.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "Javascript", "Javascript description")
    );

    public List<Topic> getTopics() {
        return topics;
    }
}
