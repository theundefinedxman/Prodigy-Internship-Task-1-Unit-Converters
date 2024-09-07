/** UnitConverterUI a UI application that renders temperature conversions.
*
* @author Buqwana Xolisile
* @version 01/09/2024
*  
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
 
public class UnitConverterUI extends Application
{
   /** Loads the fxml file.
   *  To set the Stage.
   *  Then the scene from the root.
   *  
   *  
   */
   public void start(Stage stage) throws Exception {
   
      FXMLLoader loader = new FXMLLoader(getClass().getResource("UnitConverterUI.fxml"));
      Parent root = loader.load();
      
      UnitConverterUIController controller = loader.getController();
      UnitConverterUIMenuController.setPrimaryStage(stage);
      UnitConverterUIMenuController.setUnitConverterUIController(controller);
      
      Image icon = new Image("converter_icon.jpeg");
      
      stage.getIcons().add(icon);
      Scene scene = new Scene(root,700,600);
      stage.setTitle("Unit Converter");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String[] args){
      launch(args);
   }
}