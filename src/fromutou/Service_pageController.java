/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromutou;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ath77
 */
public class Service_pageController implements Initializable {
    @FXML
    private Pagination pagination;

    /**
     * Initializes the controller class.
     * @throws java.io.IOException
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
      //Setting number of pages
      pagination.setPageCount(3);
      //Creating contents for various pages
      pagination.setPageFactory((Integer pageIndex) -> pageContent(pageIndex));
    }    
    
    public ImageView pageContent(int pageIndex){
      try{
         //Creating the image view
         ImageView imageView = new ImageView();
         //Setting the image view parameters
         imageView.setFitWidth(180);
         imageView.setFitHeight(130);
         imageView.setPreserveRatio(true);
         String [] img = {"adv1.jpg", "adv2.jpg","adv3.jpg"};
         for(int i = pageIndex; i<pageIndex+1; i++) {
            //creating the image object
            InputStream stream = new FileInputStream("D:\\pictures\\"+img[i]);
            Image image = new Image(stream);
            imageView.setImage(image);
         }
         return imageView;
      }catch (Exception e) {}
      return null;
   }


        @FXML
    protected void handleReq(ActionEvent event)throws IOException{
          Parent root = FXMLLoader.load(getClass().getResource("RequestService.fxml"));
          Scene scene2 = new Scene(root);
          Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
          window.setScene(scene2);
          window.show();
    }

  @FXML
private void back(MouseEvent e) throws IOException {
Parent Back = FXMLLoader.load(getClass().getResource("Design_Servises.fxml"));
Scene back = new Scene(Back);
Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
stage.setScene(back);
}  

}
