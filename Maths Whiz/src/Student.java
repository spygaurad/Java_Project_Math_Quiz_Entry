/**
 * Created by Suraj on 9/18/2017.
 */
public class Student extends School{
    private String name;
    private School enrolledSchool;


    public Student(String name,School school)
    {
        this.name=name;
        this.enrolledSchool = school;

    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public School getSchool() {
        return enrolledSchool;
    }
}
