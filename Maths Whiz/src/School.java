/**
 * Created by Suraj on 9/18/2017.
 */
public class School {
    private String  name;
    private String registrationID;


    public School(String name,String registrationID)
    {
        this.name=name;
        this.registrationID=registrationID;

    }

    public School() {

    }

    public String getName() {
        return name;
    }

    public String getID() {
        return registrationID;
    }

}
