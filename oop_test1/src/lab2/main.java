package lab2;

public class Main {
    public static void main(String[] args) {
        Student peter = new Student("Peter Jones");
        Student kim = new Student("Kim Smith");
        Course dataStructures = new Course("Data Structures");
        Course databaseSystems = new Course("Database Systems");

        peter.addCourse(dataStructures);
        kim.addCourse(dataStructures);
        databaseSystems.addStudent(kim);

        System.out.println("Student " + kim.getStudentName() + " is taking:");
        kim.getRegisteredCourses();
        System.out.println();
        System.out.println("Student" + peter.getStudentName() + "is taking:");
        peter.getRegisteredCourses();
        System.out.println();

        System.out.println("The Students registered in " + dataStructures.getCourseName() + " include:");
        dataStructures.getRegisteredStudents();
        System.out.println();
        System.out.println("The Students registered in " + databaseSystems.getCourseName() + " include:");
        databaseSystems.getRegisteredStudents();
    }
}
