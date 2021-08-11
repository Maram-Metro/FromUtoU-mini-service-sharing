/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromutou;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hoodi
 */
public class ChoosePage_Controller implements Initializable {
   
   
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
   
        
   
    
  @FXML
private void move_provider(MouseEvent e) throws IOException {
Parent Back = FXMLLoader.load(getClass().getResource("Provider.fxml"));
Scene back = new Scene(Back);
Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
stage.setScene(back);
}  
 
  @FXML
private void move_asker(MouseEvent e) throws IOException {
Parent Back = FXMLLoader.load(getClass().getResource("SerAskerInt.fxml"));
Scene back = new Scene(Back);
Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
stage.setScene(back);
}  
 
}
