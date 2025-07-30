# DSA-Learning-Path-System


**DSALearningPath** is a Java-based adaptive learning planner that generates **personalized study paths** for students learning **Data Structures and Algorithms (DSA)**. Using a graph-based structure, the system dynamically builds topic sequences and estimates learning durations based on user preferences and topic complexity.

Whether you're a beginner starting your DSA journey or an advanced learner revisiting complex topics, this tool helps you plan your learning path in a structured and time-efficient way.

---

##  Features

-  **Adaptive Learning Plan**: Generates a plan tailored to your selected DSA topic and desired difficulty level.
-  **Graph-Based Topic Mapping**: Internally uses a directed graph to maintain topic dependencies and subtopics.
-  **Time Estimation**: Calculates how many days you'll need to complete the selected topic based on level (Easy, Medium, Hard).
-  **Dynamic Subtopic Expansion**: Reveals deeper subtopics upon topic selection for granular learning.
-  **Student-Centric Design**: Allows creation of learning paths for individual students.

---

##  Example Use Case

A student selects the topic **"Stack"** and chooses **"Medium"** difficulty.  
The system:
- Fetches subtopics like Stack using Arrays, Stack using Linked Lists, Applications of Stack.
- Assigns estimated days to each subtopic based on the difficulty.
- Outputs a complete, day-wise structured plan tailored to that student.

---

##  How It Works

1. **Student Input**: The user enters their name and selects a DSA topic and difficulty level.
2. **Graph Creation**: The system constructs a graph of that topic and its subtopics.
3. **Learning Plan Generation**: Each node (subtopic) is traversed, and based on the selected level, estimated time is calculated.
4. **Output**: A clean, structured learning plan is printed to the console.

---

## ⚙️ Tech Stack

- **Language**: Java

---

##  Why This Project?

Many learners dive into DSA without a clear structure or end up overwhelmed by vast topics. This tool provides a personalized roadmap, breaking down DSA into manageable parts with clear time commitments—making it easier to stay on track and achieve mastery.

---

### Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/DSALearningPath.git
### Video Explanation of project
https://drive.google.com/file/d/1Un_MmNeHVJktxQeVSrUooPpnYzoOjwwk/view?usp=drive_link
   
