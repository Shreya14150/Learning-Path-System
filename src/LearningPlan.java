import java.util.*;

public class LearningPlan {
    private final Map<String, Map<String, Double>> learningPlans;

    public LearningPlan() {
        learningPlans = new HashMap<>();
        initializePlans();
    }

    private void initializePlans() {
        Map<String, Double> easyPlan = new LinkedHashMap<>();
        easyPlan.put("Arrays", 1.0);
        easyPlan.put("Recursion", 1.0);
        easyPlan.put("Basic Pointers (or References)", 1.0);
        easyPlan.put("Arrays", 1.0);
        easyPlan.put("Trees", 1.0);
        easyPlan.put("Complete Binary Trees", 1.0);
        easyPlan.put("Recursion (Heapify)", 1.0);
        easyPlan.put("Queues", 1.0);
        easyPlan.put("Stacks", 1.0);
        easyPlan.put("Adjacency Matrix/List basics", 1.0);
        easyPlan.put("Recursion", 1.0);
        easyPlan.put("Memoization", 1.0);
        easyPlan.put("Mathematical thinking", 1.0);
        easyPlan.put("Arrays", 1.0);
        easyPlan.put("Recursion", 1.0);
        easyPlan.put("Range Queries", 1.0);
        easyPlan.put("Divide and Conquer", 1.0);
        easyPlan.put("Sorting", 1.0);
        easyPlan.put("Basic Optimization Concepts", 1.0);

        Map<String, Double> mediumPlan = new LinkedHashMap<>();
        mediumPlan.put("Arrays", 1.5);
        mediumPlan.put("Recursion", 1.5);
        mediumPlan.put("Basic Pointers (or References)", 1.5);
        mediumPlan.put("Arrays", 1.5);
        mediumPlan.put("Trees", 1.5);
        mediumPlan.put("Complete Binary Trees", 1.5);
        mediumPlan.put("Recursion (Heapify)", 1.5);
        mediumPlan.put("Queues", 1.5);
        mediumPlan.put("Stacks", 1.5);
        mediumPlan.put("Adjacency Matrix/List basics", 1.5);
        mediumPlan.put("Recursion", 1.5);
        mediumPlan.put("Memoization", 1.5);
        mediumPlan.put("Mathematical thinking", 1.5);
        mediumPlan.put("Arrays", 1.5);
        mediumPlan.put("Recursion", 1.5);
        mediumPlan.put("Range Queries", 1.5);
        mediumPlan.put("Divide and Conquer", 1.5);
        mediumPlan.put("Sorting", 1.5);
        mediumPlan.put("Basic Optimization Concepts", 1.5);

        Map<String, Double> hardPlan = new LinkedHashMap<>();
        hardPlan.put("Arrays", 2.0);
        hardPlan.put("Recursion", 2.0);
        hardPlan.put("Basic Pointers (or References)", 2.0);
        hardPlan.put("Arrays", 2.0);
        hardPlan.put("Trees", 2.0);
        hardPlan.put("Complete Binary Trees", 2.0);
        hardPlan.put("Recursion (Heapify)", 2.0);
        hardPlan.put("Queues", 2.0);
        hardPlan.put("Stacks", 2.0);
        hardPlan.put("Adjacency Matrix/List basics", 2.0);
        hardPlan.put("Recursion", 2.0);
        hardPlan.put("Memoization", 2.0);
        hardPlan.put("Mathematical thinking", 2.0);
        hardPlan.put("Arrays", 2.0);
        hardPlan.put("Recursion", 2.0);
        hardPlan.put("Range Queries", 2.0);
        hardPlan.put("Divide and Conquer", 2.0);
        hardPlan.put("Sorting", 2.0);
        hardPlan.put("Basic Optimization Concepts", 2.0);

        learningPlans.put("Easy", easyPlan);
        learningPlans.put("Medium", mediumPlan);
        learningPlans.put("Hard", hardPlan);
    }

    public void displayLearningPlan(String topic, String level, Graph graph) {
        if (!learningPlans.containsKey(level)) {
            System.out.println("No plan available for this level.");
            return;
        }

        List<String> prerequisites = graph.getSubtopics(topic);
        if (prerequisites.isEmpty()) {
            System.out.println("No prerequisites found for this topic.");
            return;
        }

        Map<String, Double> plan = learningPlans.get(level);

        System.out.println("Learning Plan for " + topic + " at " + level + " level:");
        for (String pre : prerequisites) {
            Double hours = plan.get(pre);
            if (hours != null) {
                System.out.println(pre + " -> " + hours + " hours");
            }
        }
    }

    public void displayTips(String topic) {
        Map<String, List<String>> tips = new HashMap<>();
        tips.put("Trees (Binary Trees, BSTs)", Arrays.asList(
            "Master recursion and understand tree traversals deeply.",
            "Visualize tree balancing techniques like AVL and Red-Black trees.",
            "Practice in-order traversal to understand BST properties.",
            "More info:https://www.geeksforgeeks.org/"
        ));
        tips.put("Binary Heaps and Priority Queues", Arrays.asList(
            "Focus on heapify operations and how insertions/deletions maintain heap properties.",
            "Understand the structure and properties of min-heaps vs max-heaps.",
            "Learn to apply heaps in algorithms like Dijkstra’s and Huffman coding.",
            "More info:https://www.geeksforgeeks.org/"
        ));
        tips.put("Graphs (BFS, DFS, Shortest Paths)", Arrays.asList(
            "Learn the differences between BFS (level-order) and DFS (depth-first).",
            "Practice representing graphs with adjacency lists and matrices.",
            "Understand applications like cycle detection and connected components.",
            "More info:https://www.geeksforgeeks.org/"
        ));
        tips.put("Dynamic Programming (DP)", Arrays.asList(
            "Identify overlapping subproblems and use memoization or tabulation.",
            "Master top-down vs bottom-up DP approaches.",
            "Solve classical DP problems like 0/1 Knapsack and LCS.",
            "More info:https://www.geeksforgeeks.org/"
        ));
        tips.put("Segment Trees / Fenwick Trees", Arrays.asList(
            "Understand how segment trees handle range queries efficiently.",
            "Focus on update operations while maintaining tree structure.",
            "Practice range sum and range minimum queries (RMQ) problems.",
            "More info:https://www.geeksforgeeks.org/"
        ));
        tips.put("Greedy Algorithms", Arrays.asList(
            "Ensure the greedy choice property leads to a global optimum.",
            "Solve problems like Huffman coding and activity selection.",
            "Study proof techniques to validate greedy correctness.",
            "More info:https://www.geeksforgeeks.org/"
        ));

        List<String> list = tips.get(topic);
        if (list != null) {
            System.out.println("Tips for " + topic + ":");
            for (String tip : list) {
                System.out.println("- " + tip);
            }
        } else {
            System.out.println("No tips available for this topic.");
        }
    }
}