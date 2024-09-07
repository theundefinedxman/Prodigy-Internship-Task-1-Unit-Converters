/** UnitConverterTemperatureController which allows the temperature scene to have responsive and controlled features.
*
* @author Buqwana Xolisile
* @version 01/09/2024
*  
*/
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class UnitConverterTemperatureController implements Initializable {

    @FXML
    private ComboBox<String> comboboxTempOne;

    @FXML
    private ComboBox<String> comboboxTempTwo;
    
    @FXML
    private Button convertButton;
    
    @FXML
    private Button clearButton;
      
    @FXML
    private TextField prompTextTemp;
   
    @FXML
    private Label convertTempLabel;
    @FXML
    private Label answerLabel;


    /**
     * <p>Required by Initializable interface 
     * Called to initialize a controller after
     * the root element has been processed</p>
     *
     */
    public void initialize(URL location, ResourceBundle resources) {
    }
    /**
     * <p> Accessor Methods to get useful values of the class</p>
     *
     */
    public String getCurrentToTemp()
    {
      return comboboxTempOne.getValue();
    }
    public String getConvertTo()
    {
      return comboboxTempTwo.getValue();
    }
    public String getTemperatureToBeConverted()
    {
       return prompTextTemp.getText(); 
    }
    /**
     * <p> Mutator Methods to get useful values of the class</p>
     *
     */
    public void setConvertedTemperature(String convertedTemp)
    {
       convertTempLabel.setText(convertedTemp);
    }
    public void setAnswerLabel(String answer)
    {
       answerLabel.setText(answer);
    }
    /**
     * <p>clearAction Method which clears all labels and text fields in UI</p>
     *
     */
    public void clearAction(ActionEvent clearEvent)
    {
       prompTextTemp.clear();
       convertTempLabel.setText("");
       answerLabel.setText("");
    }
    /**
     * <p>convertAction Method which clears all labels and text fields in UI</p>
     *
     */
    public void convertAction(ActionEvent clearEvent)
    {
       TemperatureConversions temperatureToBeConverted = new TemperatureConversions(this.getTemperatureToBeConverted());
       this.setConvertedTemperature(temperatureToBeConverted.getConvertedTemperature(this.getCurrentToTemp(),this.comboboxTempTwo.getValue()));
       this.setAnswerLabel(temperatureToBeConverted.getConversion(this.getCurrentToTemp(),this.comboboxTempTwo.getValue()));
    }

    /**
     * <p>comboBoxInitialize Method which intializes all values of the comboBox</p>
     *
     */
    public void comboBoxInitialize() {
        comboboxTempOne.setItems(FXCollections.observableArrayList("Fahrenheit", "Celsius", "Kelvin"));
        comboboxTempTwo.setItems(FXCollections.observableArrayList("Fahrenheit", "Celsius", "Kelvin"));
    }
}
 