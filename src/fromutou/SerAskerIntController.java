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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lujam
 */
public class SerAskerIntController implements Initializable {
    @FXML
    Pane accept_req;
    private String user_accept= "false";
;    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(user_accept=="false"){
        accept_req.setOpacity(0);
         } 
        else {accept_req.setOpacity(1);}
    }    


    @FXML
private void move_design_Classification(MouseEvent e) throws IOException {
Parent Back = FXMLLoader.load(getClass().getResource("Design_Servises.fxml"));
Scene back = new Scene(Back);
Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
stage.setScene(back);
} 


    @FXML
    protected void handleSwitch(ActionEvent event)throws IOException{
/*
          Parent root = FXMLLoader.load(getClass().getResource("Provider.fxml"));
          Scene scene2 = new Scene(root);
          Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
          window.setScene(scene2);
          window.show();
*/
    }

    
        @FXML
    protected void handleOkbutton(ActionEvent event)throws IOException{
          user_accept="false";
          accept_req.setOpacity(0);
    }


    public void check_accept(String user_accept){
            this.user_accept =user_accept;
                if("false".equals(user_accept)){
                    accept_req.setOpacity(0);
                 } 
                    else {accept_req.setOpacity(1);}
    
    }
        
 @FXML
protected void Exit(ActionEvent event)throws IOException{
exit(0);
}
}

