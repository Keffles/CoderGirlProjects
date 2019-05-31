public class User {

    private String avtr;

    private String uName;

    private String fname;

    private String lname;

    private String email;

    public User(String avtr, String uName, String fname, String lname, String email){
        this.avtr = avtr;

        this.uName = uName;

        this.fname = fname;

        this.lname = lname;

        this.email = email;
    }

    //get and set for fields because I'm scatter brained and tired

    public String getAvtr(){

        return avtr;

    }

    public void setAvtr(String avtr){
        this.avtr = avtr;

    }

    public String getuName(){

        return uName;
    }

    public void setuName(String uName){

        this.uName = uName;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {

        this.fname = fname;
    }

    public String getLname() {
        return lname;


    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

}
