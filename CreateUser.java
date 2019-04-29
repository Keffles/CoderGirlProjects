import static java.lang.System.out;
import java.util.Scanner;

public class CreateUser {

    private String avatarUrl;

    private String username;

    private String firstName;

    private String lastName;

    private String email;


    //Make required Constructor (I'm struggling with this so I like to add it)

    public CreateUser (String avatarUrl, String username, String firstName, String lastName, String email){
        Scanner keyboard = new Scanner (System.in);
        this.avatarUrl = keyboard.nextLine();
        this.username = keyboard.nextLine();
        this.firstName = keyboard.nextLine();
        this.lastName = keyboard.nextLine();
        this.email = keyboard.nextLine();
    }

    //Here we create getters and setters for each field
    // get
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl){
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName (String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {

        this.email = email;
    }

}
