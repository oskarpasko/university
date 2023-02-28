package Logowanie;

public class Person implements Comparable<Person>{
    private String fname, lname, login, password;

    public Person()
    {
        fname = "";
        lname = "";
        login = "";
        password = "";
    }

    public Person(String fname, String lname, String login, String password) {
        this.fname = fname;
        this.lname = lname;
        this.login = login;
        this.password = password;
    }

    public String getFname() {return fname;}
    public String getLname() {return lname;}
    public String getLogin() {return login;}
    public String getPassword() {
        return password;
    }

    public void setFname(String fname) {this.fname = fname;}
    public void setLname(String lname) {this.lname = lname;}
    public void setLogin(String login) {this.login = login;}
    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {return fname+" "+lname+" "+login;}

    @Override
    public int compareTo(Person p) {

        if(this.getLname().compareTo(p.getLname()) == 0)
            return this.getFname().compareTo(p.getFname());
        return 0;
    }
}
