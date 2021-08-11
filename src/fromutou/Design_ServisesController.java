/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromutou;

import java.io.IOException;
import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
 * @author ath77
 */
public class Design_ServisesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
@FXML
protected void move_service(MouseEvent e) throws IOException {
Parent Back = FXMLLoader.load(getClass().getResource("Service_page.fxml"));
Scene back = new Scene(Back);
Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
stage.setScene(back);
}  

@FXML
private void back(MouseEvent e) throws IOException {
Parent Back = FXMLLoader.load(getClass().getResource("SerAskerInt.fxml"));
Scene back = new Scene(Back);
Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
stage.setScene(back);
}  


    @FXML
    protected void handleSwitch(ActionEvent event)throws IOException{
          Parent root = FXMLLoader.load(getClass().getResource("Provider.fxml"));
          Scene scene2 = new Scene(root);
          Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
          window.setScene(scene2);
          window.show();
    }

 @FXML
protected void Exit(ActionEvent event)throws IOException{
exit(0);
}
}
