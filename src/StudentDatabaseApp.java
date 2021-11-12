/* Database admin for a uni & must create app to manage student enrollments & balance
App should:
- Ask user num of students to be added
- Prompt user to enter name & year of student
- Give student unique 5-digit ID with first number as their school year
- Allow enrolment onto History 101, Mathematics 101, English 101, Chemistry 101, Computer Science 101
- Show each course cost as £600
- Allow student to view balance & pay tuition
- Show student status - name, ID, course enrolled & balance
 */

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // ask how mny students are being entered
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();


        // create n number of students


    }
}
