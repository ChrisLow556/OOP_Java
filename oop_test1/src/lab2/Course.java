package lab2;

public class Course {
    private Student[] classList = new Student[10];
    private String courseName;
    private int noStudents = 0;

    Course(){

    }

    Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(Student s){
        for(int i=0; i<noStudents; i++){
            if(s==classList[i]){
                return;
            }
        }
        classList [noStudents] = s;
        noStudents++;
        s.addCourse(this);
    }

    public String getCourseName(){
        return courseName;
    }

    public void getRegisteredStudents(){
        for(int i = 0; i<noStudents; i++){
            System.out.println(classList[i].getStudentName());
        }
    }
}
