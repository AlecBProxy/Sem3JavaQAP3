// Used for: Problem #1

public class Teacher extends Person {
    private String mySubject;
    private double mySalary;

    public Teacher (String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    public String getSubject(){
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}