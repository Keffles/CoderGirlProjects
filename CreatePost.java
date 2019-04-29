import java.util.Scanner;
import static java.lang.System.out;

public class CreatePost {

    private static int postCounter = 0;


    private CreateUser User;

    private int id;

    private String content;

    private String url;

    //Constructor here

    public CreatePost(CreateUser User, String content) {

        Scanner keyboard = new Scanner (System.in);
        postCounter++;

        //set id

        this.id = postCounter;

        this.User = User;

        this.content = keyboard.nextLine();
    }

    //new post object with user, content and url

    public CreatePost(CreateUser User, String content, String url) {

        Scanner keyboard = new Scanner (System.in);
        postCounter++;

        this.id = postCounter;

        //fill fields with data from constructor

        this.User = User;

        this.content = keyboard.nextLine();

        this.url = keyboard.nextLine();
    }

    //Getter to return the post id

    public int getId() {

        return this.id;
    }

    public String toString() {

        return "Post number: " + this.id + "\n" +
                this.content + "\n" +
                "Written by: " + this.User.getUsername() + "\n" +
                "Url: " + (this.url != null ? this.url : "");

    }


}
