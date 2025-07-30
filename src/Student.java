public class Student {
    private String name;
    private String currentLevel;
    private String selectedTopic;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getSelectedTopic() {
        return selectedTopic;
    }

    public void setSelectedTopic(String selectedTopic) {
        this.selectedTopic = selectedTopic;
    }
}
