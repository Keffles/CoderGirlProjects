import org.omg.CORBA.Current;

import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;


public class Tools {
    public static User CreateUser(){

        Scanner keyboard = new Scanner(System.in);
        out.println("Enter you first name: ");
        String fname = keyboard.nextLine();

        out.println("Enter your last name: ");
        String lname = keyboard.nextLine();

        out.println("Enter your avatar URL: ");
        String avtr = keyboard.nextLine();

        out.println("Enter your desired username: ");
        String uName = keyboard.nextLine();

        out.println("Enter your email: ");
        String email = keyboard.nextLine();

        User u = new User (avtr, uName, fname, lname, email);

        return u;

    }

    public static User ChangeUser (ArrayList<User>allUsers, User currentUser) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Enter your username: ");
        String findName = keyboard.nextLine();
        String msg = "";
        //ArrayList<String> allUsernames = new ArrayList<>();
        for (int i = 0; i < allUsers.size(); i++) {
            if (findName.equals(allUsers.get(i).getuName())) {
                // pos = allUsername.indexOf(findName);
                currentUser = allUsers.get(i);

                return currentUser;
            } //else {
                //msg = "User name not found, returning to main menu.";
                //out.println(msg);
            }

        return null;
    }


    public static Post CreateNewPost(User u) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter your post: ");
        String content = keyboard.nextLine();
        Post p = new Post(u, content);

        out.println(u.getuName() + "Wrote the following: " + "\n" + content);
        return p;
    }


}
