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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ath77
 */
public class RequestServiceController implements Initializable {
    
    private String user_accept;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
      @FXML
private void back(MouseEvent e) throws IOException {
Parent Back = FXMLLoader.load(getClass().getResource("Service_page.fxml"));
Scene back = new Scene(Back);
Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
stage.setScene(back);
}  


        @FXML
    protected void handleSend(ActionEvent event)throws IOException{
           
      FXMLLoader loader = new FXMLLoader(getClass().getResource("SerAskerInt.fxml"));
      Parent root = (Parent)loader.load();
      SerAskerIntController secondControl_1 = loader.getController();
      
      user_accept = "true";
      secondControl_1.check_accept(user_accept);

     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     window.setScene(new Scene(root));
     window.show();
    }

}
