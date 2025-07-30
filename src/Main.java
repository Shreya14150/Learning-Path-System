import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = null;
        Graph graph = new Graph();
        LearningPlan learningPlan = new LearningPlan();

        // Setup prerequisites for each topic
        graph.addEdge("Trees (Binary Trees, BSTs)", "Arrays");
        graph.addEdge("Trees (Binary Trees, BSTs)", "Recursion");
        graph.addEdge("Trees (Binary Trees, BSTs)", "Basic Pointers (or References)");

        graph.addEdge("Binary Heaps and Priority Queues", "Arrays");
        graph.addEdge("Binary Heaps and Priority Queues", "Trees");
        graph.addEdge("Binary Heaps and Priority Queues", "Complete Binary Trees");
        graph.addEdge("Binary Heaps and Priority Queues", "Recursion (Heapify)");

        graph.addEdge("Graphs (BFS, DFS, Shortest Paths)", "Queues");
        graph.addEdge("Graphs (BFS, DFS, Shortest Paths)", "Stacks");
        graph.addEdge("Graphs (BFS, DFS, Shortest Paths)", "Recursion");
        graph.addEdge("Graphs (BFS, DFS, Shortest Paths)", "Adjacency Matrix/List basics");

        graph.addEdge("Dynamic Programming (DP)", "Recursion");
        graph.addEdge("Dynamic Programming (DP)", "Memoization");
        graph.addEdge("Dynamic Programming (DP)", "Mathematical thinking");

        graph.addEdge("Segment Trees / Fenwick Trees", "Arrays");
        graph.addEdge("Segment Trees / Fenwick Trees", "Recursion");
        graph.addEdge("Segment Trees / Fenwick Trees", "Range Queries");
        graph.addEdge("Segment Trees / Fenwick Trees", "Divide and Conquer");

        graph.addEdge("Greedy Algorithms", "Sorting");
        graph.addEdge("Greedy Algorithms", "Basic Optimization Concepts");

        Map<Character, String> menuMap = new LinkedHashMap<>();
        menuMap.put('a', "Trees (Binary Trees, BSTs)");
        menuMap.put('b', "Binary Heaps and Priority Queues");
        menuMap.put('c', "Graphs (BFS, DFS, Shortest Paths)");
        menuMap.put('d', "Dynamic Programming (DP)");
        menuMap.put('e', "Segment Trees / Fenwick Trees");
        menuMap.put('f', "Greedy Algorithms");

        System.out.println("\nWelcome to DSA Learning System");
        System.out.println("1. Enter your name ");
        System.out.println("2. What DSA topic do you want to learn?");
        System.out.println("3. Select Learning Level (Easy / Medium / Hard)");
        System.out.println("4. View Learning Plan with Timelines");
        System.out.println("5. View Tips for the Selected Topic");
        System.out.println("6. Exit");

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    student = new Student(name);
                    System.out.println("Student " + name + " added successfully.");
                    break;

                case 2:
                    if (student == null) {
                        System.out.println("Please add a student first.");
                    } else {
                        System.out.println("Select DSA Topic:");
                        for (Map.Entry<Character, String> entry : menuMap.entrySet()) {
                            System.out.println(entry.getKey() + ". " + entry.getValue());
                        }
                        System.out.print("Enter your choice (a–f): ");
                        char opt = scanner.nextLine().toLowerCase().charAt(0);
                        String topic = menuMap.get(opt);
                        if (topic != null) {
                            student.setSelectedTopic(topic);
                            System.out.println("\nYou selected: " + topic);
                            System.out.println("Important prerequisites for " + topic + ":");
                            graph.displaySubtopics(topic);
                        } else {
                            System.out.println("Invalid selection.");
                        }
                    }
                    break;

                case 3:
                    if (student == null) {
                        System.out.println("Please add a student first.");
                    } else {
                        System.out.print("Choose level (Easy / Medium / Hard): ");
                        String level = scanner.nextLine();
                        student.setCurrentLevel(level);
                        System.out.println("Learning level set to: " + level);
                    }
                    break;

                case 4:
                    if (student == null 
                        || student.getSelectedTopic() == null 
                        || student.getCurrentLevel() == null) {
                        System.out.println("Please complete topic and level selection first.");
                    } else {
                        learningPlan.displayLearningPlan(
                            student.getSelectedTopic(), 
                            student.getCurrentLevel(), 
                            graph
                        );
                    }
                    break;

                case 5:
                    if (student == null || student.getSelectedTopic() == null) {
                        System.out.println("Please select a topic first.");
                    } else {
                        learningPlan.displayTips(student.getSelectedTopic());
                    }
                    break;

                case 6:
                    System.out.println("Exiting the system...");
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}