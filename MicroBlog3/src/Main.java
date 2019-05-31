import java.lang.reflect.Array;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int userChoice = -1;
        User currentUser = null;
        ArrayList<User> allUsers = new ArrayList<>();
        ArrayList<Post> allPosts = new ArrayList<>();

        while (userChoice != 0 ) {
            out.println("---Main Menu---");
            out.println("Enter number to select your option");
            out.println();
            out.println("1. Create new User" + "\n" + "2. Become existing user" + "\n" +
                    "3. Create a post as current user" + "\n" + "4. Print all posts" + "\n" +
                    "5. Print all users" + "\n" + "Press 0 to exit");

            userChoice = keyboard.nextInt();

            if (userChoice == 1) {

                currentUser = Tools.CreateUser();
                allUsers.add(currentUser);

                ///add to array here fingers crossed.  Do same to get all posts on option 3F
            }
            else if (userChoice == 2) {
                currentUser = Tools.ChangeUser(allUsers, currentUser);
            }

            else if(userChoice == 3) {
                Post p = Tools.CreateNewPost(currentUser);
                allPosts.add(p);
            }

            else if(userChoice == 4) {
                out.println("All posts so far: ");

                for (Post p : allPosts) {
                    out.println(p.toString());
                }
            }

            else if(userChoice == 5){
                out.println("All users in the system are: ");

                for(User u : allUsers) {
                    out.println(u.getuName());
                }
            }
        }
    }
}
