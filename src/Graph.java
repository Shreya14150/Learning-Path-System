import java.util.*;

public class Graph {
    private Map<String, List<String>> topicSubtopics;

    public Graph() {
        topicSubtopics = new HashMap<>();
    }

    public void addEdge(String topic, String subtopic) {
        topicSubtopics.computeIfAbsent(topic, k -> new ArrayList<>()).add(subtopic);
    }

    public List<String> getSubtopics(String topic) {
        return topicSubtopics.getOrDefault(topic, new ArrayList<>());
    }

    public void displaySubtopics(String topic) {
        List<String> subtopics = getSubtopics(topic);
        if (subtopics.isEmpty()) {
            System.out.println("No subtopics available.");
        } else {
            for (String sub : subtopics) {
                System.out.println("- " + sub);
            }
        }
    }
}