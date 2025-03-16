// Used for: Problem #1

public class Demo {

    public static void main(String[] args) {

        Person jalen = new Person("Jalen Green", 22, "M");
        System.out.println(jalen);

        Student alperen = new Student("Alperen Sengun", 22, "M", "LA85129", 4.0);
        System.out.println(alperen);

        Teacher mrdrexler = new Teacher("Clyde Drexler", 62, "M", "Coaching Psychology", 50000);
        System.out.println(mrdrexler);

        CollegeStudent ashley = new CollegeStudent("Ashley Williams", 35, "F", "PLB123", 3.0, "English", 1);
        System.out.println(ashley);
    }
}
