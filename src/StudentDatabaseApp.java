import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // ask how mny students are being entered
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of students. array will be used maintain the students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }






    }
}
