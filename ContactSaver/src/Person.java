import java.util.ArrayList;

public class Person {

    private  String username;
    private  String firstName;
    private  String lastName;
    private ArrayList<String> email;

    public Person() {
        username = "Username";
        lastName = "Last";
        firstName = "First";
    }

    public Person(String username, String firstName, String lastName ) {
        this.firstName =  (firstName);
        this.lastName =  (lastName);
        this.username =  (username);
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}