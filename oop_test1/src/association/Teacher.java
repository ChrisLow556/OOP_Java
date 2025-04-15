package association;
//The teacher class is associated with the student classs
public class Teacher {
    private String name;
    private Student [] studentList = new Student[10];
    private int studentCount = 0;

    Teacher(String name){
        this.name = name;
    }

    public void addStudent(Student student){
        studentList[studentCount] = student;
        studentCount++;
    }
}
