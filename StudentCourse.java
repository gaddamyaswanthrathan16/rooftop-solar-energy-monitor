import java.util.Scanner;

class Student {
    String name;
    String rollNumber;
    double marks;
    String courseName;
    int credits;

    Student(String name, String rollNumber, double marks, String courseName, int credits) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.credits = credits;
    }

    boolean checkEligibility() {
        if (marks >= 50) {
            return true;
        } else {
            return false;
        }
    }

    double calculateFee() {
        return credits * 1500;
    }

    double calculateScholarship(double fee) {
        if (marks >= 85) {
            return fee * 0.20;
        } else if (marks >= 70) {
            return fee * 0.10;
        } else {
            return 0;
        }
    }

    double calculateFinalFee(double fee, double scholarship) {
        return fee - scholarship;
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + credits);

        if (checkEligibility()) {
            System.out.println("Eligibility: Eligible");
            double fee = calculateFee();
            double scholarship = calculateScholarship(fee);
            double finalFee = calculateFinalFee(fee, scholarship);

            System.out.println("Course Fee: " + fee);
            System.out.println("Scholarship: " + scholarship);
            System.out.println("Final Fee: " + finalFee);
        } else {
            System.out.println("Eligibility: Not Eligible");
            System.out.println("Registration denied. Marks are below 50.");
        }
    }
}

public class StudentCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Credits: ");
        int credits = sc.nextInt();

        Student student = new Student(name, roll, marks, course, credits);

        student.displayDetails();

        sc.close();
    }
}