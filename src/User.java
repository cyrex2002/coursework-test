public class User {
    private String password;
    private String userName;

    public User(String password,String userName){
        this.password=password;
        this.userName=userName;
    }

    public String getPassword(){
        return password;
    }
    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public void setUserName(String userName){
        this.userName=password;
    }
}
