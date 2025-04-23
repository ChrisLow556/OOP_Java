package lab2;

public class Student {
    private String name;
    private Course [] courseList = new Course[10];
    private int noCourses = 0;

    Student(){

    }

    Student(String name){
        this.name = name;
    }

    public void addCourse(Course c){
        for(int i=0; i<noCourses; i++){
            if(c==courseList[i]){
                return;
            }
        }
        courseList[noCourses] = c;
        noCourses++;
        c.addStudent(this);
    }

    public String getStudentName(){
        return name;
    }

    public void getRegisteredCourses(){
        for (int i = 0; i<noCourses; i++){
            System.out.println(courseList[i].getCourseName());
        }
    }
}


