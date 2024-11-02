import java.util.Scanner;
public class sfile {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Roll Number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    
                    if (name.isEmpty() || rollNumber.isEmpty() || grade.isEmpty() || email.isEmpty()) {
                        System.out.println("Error: All fields must be filled.");
                    } else {
                        sms.addStudent(new Student(name, rollNumber, grade, age, email));
                    }
                    break;

                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    String rollToRemove = scanner.nextLine();
                    sms.removeStudent(rollToRemove);
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    String rollToSearch = scanner.nextLine();
                    Student foundStudent = sms.searchStudent(rollToSearch);
                    if (foundStudent != null) {
                        System.out.println("Found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    sms.displayAllStudents();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
