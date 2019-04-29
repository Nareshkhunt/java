package encapsulation;

/**
 * Created by User on 20/12/2015.
 */
public class Student {
    //data member
    private String name;

    // setter method  - write only access
    public void setName(String somename){
        this.name=somename;
    }

    // getter method - read only access
    public String getName(){
        return name;
    }


}
