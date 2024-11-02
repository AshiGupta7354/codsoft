public class Student {
    private String name;
    private String rollNumber;
    private String grade;
    private int age;
    private String email;

    public Student(String name, String rollNumber, String grade, int age, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{Name: '" + name + "', Roll Number: '" + rollNumber + "', Grade: '" + grade +
                "', Age: " + age + ", Email: '" + email + "'}";
    }

    // Getters and setters for each attribute
    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
