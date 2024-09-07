/** UnitConverterUIMenuController allow the menu buttons to be responsive on the main.
*
* @author Buqwana Xolisile
* @version 01/09/2024
*  
*/
import javafx.stage.Stage;

public class UnitConverterUIMenuController
{  
    private static Stage primaryStage;
    private static UnitConverterUIController unitConverterUIController;

    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setUnitConverterUIController(UnitConverterUIController controller) {
        unitConverterUIController = controller;
    }

    public static UnitConverterUIController getUnitConverterUIController() {
        return unitConverterUIController;
    }
}
 