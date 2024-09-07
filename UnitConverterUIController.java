/** UnitConverterUIController which allows the UI to have responsive menu features.
*
* @author Buqwana Xolisile
* @version 01/09/2024
*  
*/
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.util.Duration;
import javafx.fxml.Initializable;
import javafx.animation.Timeline;
import javafx.animation.KeyValue;
import javafx.animation.KeyFrame;
import javafx.animation.Interpolator;

/** <p>Implements Initializable To intialize the controller</p>
 * 
 */
public class UnitConverterUIController implements Initializable
{
   @FXML
   private Button menuButton;
   @FXML
   private Button helpButton;
   @FXML
   private Button lengthButton; 
   
   @FXML
   private ImageView imageViewMenu;
   
   @FXML
   public Pane converterPane;

   private Image closeImage;
   private Image menuImage;
   
   
  /**
    * <p>menuAction is a Action Method which changes the menu icon to cross icon.<\p>
    * <p>Making use of the of the URL class which is able to make comparison of image icons <\p>   
    * <p>When menu icon is clicked a pop up menu will appear through seamless animation<\p>
    * <p>When cross icon is clicked the pop up menu will disappear through seamless animation<\p>  
    *
    */
   public void menuAction(ActionEvent menuEvent) throws Exception {
       Image currentImage = imageViewMenu.getImage();
       if (currentImage == closeImage) {
          imageViewMenu.setImage(menuImage);
          
          if (!converterPane.getChildren().isEmpty()) {
              Parent root2 = (Parent) converterPane.getChildren().get(converterPane.getChildren().size() - 1); 
              Timeline timeline = new Timeline();
              KeyValue kv = new KeyValue(root2.translateXProperty(), -root2.getScene().getWidth(), Interpolator.EASE_IN);
              KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
   
              timeline.getKeyFrames().add(kf);
              timeline.setOnFinished(e -> converterPane.getChildren().remove(root2));
              timeline.play();
           }
       } else {
           imageViewMenu.setImage(closeImage);
           Parent root2 = FXMLLoader.load(getClass().getResource("UnitConverterMenu.fxml"));
           converterPane.getChildren().clear();
           Scene scene =  menuButton.getScene();
           root2.translateXProperty().set(-scene.getWidth());
           converterPane.getChildren().add(root2);
           Timeline timeline = new  Timeline();
           KeyValue fv = new KeyValue(root2.translateXProperty(),0,Interpolator.EASE_IN);
           KeyFrame kf = new KeyFrame(Duration.seconds(0.01),fv);
       
           timeline.getKeyFrames().add(kf);
           timeline.play();
       }
   }
   /**
    * <p> helpAction() is a void Method which performs the following</p>
    * <p>Inserts the help scene on the Main Stage scene</p>
    *
    */
   public void helpAction(ActionEvent helpEvent) throws Exception{
      Parent root2 = FXMLLoader.load(getClass().getResource("UnitConverterHelp.fxml"));
      converterPane.getChildren().clear();
      Scene scene =  helpButton.getScene();
      root2.translateYProperty().set(scene.getWidth());
      converterPane.getChildren().add(root2);
           
      Timeline timeline = new  Timeline();
      KeyValue fv = new KeyValue(root2.translateYProperty(),0,Interpolator.EASE_IN);
      KeyFrame kf = new KeyFrame(Duration.seconds(1),fv);
       
      timeline.getKeyFrames().add(kf);
      timeline.play();
   }
   /**
    * <p>errorAction() is a void Method which performs the following</p>
    * <p>Instantiates the controller,to get control of the Main Stage scene</p>
    * <p>form there inserts the temporay error scene for the length and Mass button</p>
    *
    */
   public void errorAction(ActionEvent errorEvent) throws Exception{
      UnitConverterUIController controller =  UnitConverterUIMenuController.getUnitConverterUIController();
      if (controller != null) {
         Pane converterPane = controller.getConverterPane();
         converterPane.getChildren().clear();
         Parent root3 = FXMLLoader.load(getClass().getResource("UnitConverterError.fxml"));
         converterPane.getChildren().add(root3);
      } 
      else {
            System.out.println("Controller is not initialized.");// For Debugging Purposes
      }
   }
    /**
    * <p>temperaturerAction() is a void Method which performs the following</p>
    * <p>Instantiates the controller,to get control of the Main Stage scene</p>
    * <p>form there inserts the temperature conversion scene for the temperature button</p>
    *
    */
   public void temperatureAction(ActionEvent temperatureEvent) throws Exception{
      UnitConverterUIController controller =  UnitConverterUIMenuController.getUnitConverterUIController();
      if (controller != null) {
         Pane converterPane = controller.getConverterPane();
         converterPane.getChildren().clear();
         FXMLLoader loader1 = new FXMLLoader(getClass().getResource("UnitConverterTemperature.fxml"));
         Parent root3 = loader1.load();
         UnitConverterTemperatureController temperatureController = loader1.getController();
         if (temperatureController != null)
         temperatureController.comboBoxInitialize();
         else
            System.out.println("Failed to load controller.");// For Debugging Purposes
         converterPane.getChildren().add(root3);  
      } 
      else {
            System.out.println("Controller is not initialized.");// For Debugging Purposes
      }
   }
   /**
    * <p>Required by Initializable interface</p> 
    * <p>Called to initialize a controller after</p>
    * <p>the root element has been processed</p>
    *
    *
    * Intializing two Image objects within this method to make use of URL class
    *
    */
   public void initialize(URL url ,ResourceBundle rb){
      closeImage = new Image(getClass().getResourceAsStream("closeMenu.png"));
      menuImage = new Image(getClass().getResourceAsStream("menu_bar.png"));      
   }
   /**
    * <p>getConverterPane() is a Accessor Method</p>
    * <p>which returns a converterPanefrom the Main Stage scene</p>
    *
    */
   public Pane getConverterPane() {
        return converterPane;
   }
   /**
    * closeAction is a Method which retrieves and closes the stage
    *
    */
   public void closeAction(ActionEvent closeEvent){
      Stage stage = (Stage) ((Node)  closeEvent.getSource()).getScene().getWindow(); 
      stage.close(); 
   }
}