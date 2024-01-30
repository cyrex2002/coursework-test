import java.io.Serializable;

public class User implements Serializable {
    private String password;
    private String userName;
    private int firstTimePurchased = 0;

    public User(String password,String userName){
        this.password=password;
        this.userName=userName;
       // this.firstTimePurchased=firstTimePurchased;
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

    public Integer getFirstTimePurchased() {
        return firstTimePurchased;
    }

    public void setFirstTimePurchased(int firstTimePurchased) {
        this.firstTimePurchased = firstTimePurchased;
    }
}
