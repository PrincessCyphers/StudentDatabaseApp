import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentYear;
    private int studentID;
    private String courses;
    private int courseCost = 600;
    private int balance;
    private int tuitionBalance;

    // constructor asking for students name and year

    public Student (){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter student First name");
            this.firstName = in.nextLine();

            System.out.print("Enter student Last name");
            this.lastName = in.nextLine();

            System.out.print("Grade Placement: \n1 - Year 10\n2 - Year 11\n3 - Year 12/ Lower 6th Form\n4- Year 13/ Upper 6th Form\nEnter Student's placement: ");
            this.studentYear = in.nextLine();
            System.out.println(firstName + " " + lastName + " will be in " + studentYear);

            // ("Courses available: \n1 - History 101\n2 - Mathematics 101\n3 - English 101\n4 - Chemistry 101\n5 - Computer Sciences 101\nEnter Student Course"
    }



        // Generate ID

        // Course enrollment

        // View balance

        // Pay Tuition

        // Show status


}
