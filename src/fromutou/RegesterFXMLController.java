/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromutou;

import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Window;

/**
 *
 * @author hoodi
 */
public class RegesterFXMLController  {
    
    //---- Sigin----//
    @FXML
    private HBox hbox_sigin;
    @FXML
    private AnchorPane sigin_pane;
    @FXML
    private TextField siginusername;
    @FXML
    private PasswordField siginpassword;
    @FXML
    private Button loginbutton;
    
    //----Regester----//
    @FXML
    private HBox hbox_regester;
    @FXML
    private AnchorPane regester_pane;
    @FXML
    private TextField regestusername;
    @FXML
    private TextField email;
    @FXML
    private PasswordField regestpassword;
    @FXML
    private Button regesterbutton;
    
    
    //---- 
 @FXML
private void loginPaneShow(ActionEvent event) throws IOException {
sigin_pane.setVisible(true);
regester_pane.setVisible(false);
hbox_sigin.setVisible(true);
hbox_regester.setVisible(false);
}
@FXML
private void RegesterPaneShow(ActionEvent event) throws IOException {

sigin_pane.setVisible(false);
regester_pane.setVisible(true);
hbox_sigin.setVisible(false);
hbox_regester.setVisible(true);
}


//----------------------------------------

@FXML
private void loginAction(ActionEvent event) throws IOException, SQLException {
Window owner = loginbutton.getScene().getWindow();
if(siginusername.getText().equals("") && siginpassword.getText().equals(""))
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your name and password");
}
else if(siginusername.getText().equals("") && !siginpassword.getText().equals(""))
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your name");
}
else if(siginpassword.getText().equals("") && !siginusername.getText().equals(""))
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your password");
}
else if(!siginpassword.getText().equals("") && siginpassword.getText().length()<10)
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Password should be at least 10 digits!");
}
else{
FXMLLoader loader = new FXMLLoader();
loader.setLocation(getClass().getResource("ChoosePage_Controller.fxml"));
//getting the scene graph object
Parent root = loader.load();

Scene personal_info_scene = new Scene(root);
Stage personal_info_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
personal_info_stage.setScene(personal_info_scene);
personal_info_stage.show();

return;
}
}

 //-------------------------------------------------------------------
public static boolean isValid(String email)
{
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
"[a-zA-Z0-9_+&*-]+)*@" +
"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
"A-Z]{2,7}$";
Pattern pat = Pattern.compile(emailRegex);
if (email == null)
return false;
return pat.matcher(email).matches();
}
@FXML
public void registerAction(ActionEvent event) throws SQLException, IOException {

 Window owner = regesterbutton.getScene().getWindow();

if (regestusername.getText().isEmpty() && email.getText().isEmpty() && regestpassword.getText().isEmpty()) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please complete the form");
}
else if (!regestusername.getText().isEmpty() && email.getText().isEmpty() &&  regestpassword.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your email and password");
        }
       
        else if (regestusername.getText().isEmpty() && !email.getText().isEmpty() &&  regestpassword.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your username and password");
        }
         
        else if (regestusername.getText().isEmpty() && email.getText().isEmpty() &&  !regestpassword.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your username and email");
        }
else if (regestusername.getText().isEmpty()) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your name");
}

 else if (email.getText().isEmpty()) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your email");

}
 else if (regestpassword.getText().isEmpty()) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your Password");
}

 else if (!regestpassword.getText().isEmpty()&&regestpassword.getText().length() < 10) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Password is should be at least 10 digits!");

}
 else if (!isValid(email.getText()))
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "The email is invalid");
}
else{
     //user object 
     user new_user = new user(regestusername.getText(), email.getText(),regestpassword.getText());
     
     
FXMLLoader loader = new FXMLLoader();
loader.setLocation(getClass().getResource("ChoosePage_Controller.fxml"));
//getting the scene graph object
Parent root = loader.load();

Scene personal_info_scene = new Scene(root);
Stage personal_info_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
personal_info_stage.setScene(personal_info_scene);
personal_info_stage.show();
return;
}
}


 //end action
@FXML
public void keyPressedSignin(KeyEvent event) throws IOException, SQLException{
Window owner = loginbutton.getScene().getWindow();
if (event.getCode().equals(KeyCode.ENTER)){
if(siginusername.getText().equals("") && siginpassword.getText().equals(""))
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your name and password");
}
else if(siginusername.getText().equals("") && !siginpassword.getText().equals(""))
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your name");
}
else if(siginpassword.getText().equals("") && !siginusername.getText().equals(""))
{
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your password");
}
else{
FXMLLoader loader = new FXMLLoader();
loader.setLocation(getClass().getResource("ChoosePage_Controller.fxml"));
//getting the scene graph object
Parent root = loader.load();

Scene personal_info_scene = new Scene(root);
Stage personal_info_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
personal_info_stage.setScene(personal_info_scene);
personal_info_stage.show();
return;
}


}

}

//-----------------//

@FXML
public void keyPressedRegister(KeyEvent event) throws IOException, SQLException{
Window owner = regesterbutton.getScene().getWindow();
if (event.getCode().equals(KeyCode.ENTER)){
if (regestusername.getText().isEmpty() && email.getText().isEmpty() && regestpassword.getText().isEmpty()) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please complete the form");
return;
}
else if (!regestusername.getText().isEmpty() && email.getText().isEmpty() &&  regestpassword.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your email and password");
        }
       
        else if (regestusername.getText().isEmpty() && !email.getText().isEmpty() &&  regestpassword.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your username and password");
        }
         
        else if (regestusername.getText().isEmpty() && email.getText().isEmpty() &&  !regestpassword.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your username and email");
        }
else if (regestusername.getText().isEmpty()) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your name");
}

 else if (email.getText().isEmpty()) {
showAlert(Alert.AlertType.ERROR, owner, "Error!", "Please enter your email");
}

 else{


FXMLLoader loader = new FXMLLoader();
loader.setLocation(getClass().getResource("ChoosePage_Controller.fxml"));
//getting the scene graph object
Parent root = loader.load();

Scene personal_info_scene = new Scene(root);
Stage personal_info_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
personal_info_stage.setScene(personal_info_scene);
personal_info_stage.show();

}
}
}

//-----------------------//

 private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
Alert alert = new Alert(alertType);
alert.setTitle(title);
alert.getDialogPane().setPrefSize(280,100);
alert.setResizable(true);
alert.setHeaderText(null);
alert.setContentText(message);
alert.initOwner(owner);
alert.show();
}
}

   

   

    





