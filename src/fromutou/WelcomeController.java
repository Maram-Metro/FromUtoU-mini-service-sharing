/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromutou;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ath77
 */
public class WelcomeController implements Initializable {
    @FXML
    Button start_btn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }   
    

    
    
    @FXML
    protected void handleStart(ActionEvent event)throws IOException{
          Parent root = FXMLLoader.load(getClass().getResource("RegesterFXML.fxml"));
          Scene scene2 = new Scene(root);
          Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
          window.setScene(scene2);
          window.show();
         
    }
}
