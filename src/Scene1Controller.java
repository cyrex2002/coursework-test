import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Scene1Controller {

    @FXML
    User user = new User("pakaya","pakaya123");

    @FXML
    private String username;
    @FXML
    private String password;
    @FXML
    TextField usernametxtf,passwordtxtf;

    //@FXML
    //Button loginbttn;


    public void login(javafx.event.ActionEvent event) throws IOException{
            username = usernametxtf.getText();
            password = passwordtxtf.getText();

            if(username.equals(user.getUserName()) && password.equals(user.getPassword()))
             {System.out.println(username+" "+password);}
            else{
                usernametxtf.clear();
                passwordtxtf.clear();
            }
    }



}
