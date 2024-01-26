import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Scene4Controller {



    @FXML
    private PasswordField newPassword;

    @FXML
    private TextField newUserName;

    @FXML
    private PasswordField reNewPassword;

    @FXML
    String newUserName1;
    @FXML
    String newPassword1;
    @FXML
    String reNewPassword1;


    List<User> userList = new ArrayList<>();

    @FXML
    public void addNewUser(ActionEvent event){


        newUserName1 = newUserName.getText();
        newPassword1 = newPassword.getText();
        reNewPassword1 = reNewPassword.getText();

        if(newPassword1.equals(reNewPassword1)){
//            load();

            User user = new User(newUserName1,newPassword1);
            userList.add(user);
            System.out.println(userList.get(0).getUserName());

            try {
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("userFile.dat"));
                output.writeObject(userList);
                output.close();
            }
            catch (IOException ioe){
                System.err.println("Error saving file");

            }

        }else{
            System.out.println("passwords is not matching");

        }
        //load();
        System.out.println(userList.get(0).getUserName());


    }
    @FXML
    public void load(){
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("userFile.dat"));
            userList = (List<User>)input.readObject();
        }catch (IOException ioe) {
            System.err.println("Error opening file");
        }catch (ClassNotFoundException cmfe){
            System.err.println("Object is not a List");
        }
    }

}


