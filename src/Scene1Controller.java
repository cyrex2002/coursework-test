import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {

    @FXML
    User user = new User("1","1");

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

            if(username.equals(user.getUserName()) && password.equals(user.getPassword())) {

                Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setTitle("Shopping center");
                stage.setScene(scene);
                stage.show();



            }
            else{
                usernametxtf.clear();
                passwordtxtf.clear();
            }
    }





}
