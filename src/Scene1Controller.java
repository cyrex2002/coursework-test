
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {



    @FXML
    private String username;
    @FXML
    private String password;
    @FXML
    TextField usernametxtf,passwordtxtf;
    @FXML
    Label passworderr;



    List<User> userList;

    @FXML
    public void login(javafx.event.ActionEvent event) throws IOException{
            username = usernametxtf.getText();
            password = passwordtxtf.getText();

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("userFile.dat"));
            userList = (List<User>)input.readObject();
        }catch (IOException ioe) {
            System.err.println("Error opening file");
        }catch (ClassNotFoundException cmfe){
            System.err.println("Object is not a List");
        }

        for(User user:userList){

            if (user.getUserName().equals(username)&&user.getPassword().equals(password)){
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setTitle("Shopping center");
                stage.setScene(scene);
                stage.show();
                SharedDataModel.getInstance().setUsername(username);
            }else {
                passworderr.setText("User name or password is incorrect");
                usernametxtf.clear();
                passwordtxtf.clear();
            }
        }

    }

    public void signUp(ActionEvent event) throws  IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene4.fxml")));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Sign Up!!");
        stage.setScene(scene);
        stage.show();

    }





}
