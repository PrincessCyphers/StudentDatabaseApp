import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentYear;
    private String studentID;
    private static int ID = 1000;
    private String courses = " ";
    private static int courseCost = 600;
    private int balance;
    private int tuitionBalance;

    // constructor asking for students name and year

    public Student (){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter student First name: ");
            this.firstName = in.nextLine();

            System.out.print("Enter student Last name: ");
            this.lastName = in.nextLine();

            System.out.print("Grade Placement: \n1 - Year 10\n2 - Year 11\n3 - Year 12/ Lower 6th Form\n4- Year 13/ Upper 6th Form\nEnter Student's placement: ");
            this.studentYear = in.nextLine();

            setStudentID();
            System.out.println(firstName + " " + lastName + " will be in " + studentYear + " " + studentID);

    }

        // Generate ID using grade as first number
    private void setStudentID() {
        ID++;
        this.studentID = studentYear + "" + ID;
    }
        // Course enrollment "\\
    public void enroll () {
        System.out.println("Courses available: \nHistory 101 \nMathematics 101 \nEnglish 101 \nChemistry 101 \nComputer Sciences 101");
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            }
            else {break; }
        } while (1 !=0);

        System.out.println("Enrolled in: " + courses);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is £" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: £" + payment);
        viewBalance();
    }

    // Show status


}
