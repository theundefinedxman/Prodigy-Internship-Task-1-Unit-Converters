/** UnitConverterUIController which allows the UI to have responsive menu features.
*
* @author Buqwana Xolisile
* @version 01/09/2024
*  
*/
public class TemperatureConversions
{
  private String temperatureToBeConverted;
  
  public TemperatureConversions(){
  }
  public TemperatureConversions(String temperatureToBeConverted){
     this.temperatureToBeConverted = temperatureToBeConverted;
  }
  /**
   *
   * Conversion of Temperature between Celsius unit and Kelvin unit: K= C+ 273.15
   * Celsius to Fahrenheit: F = 9/5 (C) + 32 or F = 1.80 (C) + 32
   * Conversion of Temperature between Fahrenheit unit and Celsius unit: C = (F − 32)X 59
   * Conversion of Temperature between Fahrenheit unit and Kelvin unit: F = 9/5 (K - 273) + 32
   * Kelvin to Celsius: C = K - 273
   * Kelvin to Fahrenheit: F = (K − 273.15) × 9/5 + 32
   *
   */
  public String getConversion(String temperatureUnit,String temperatureUnitToBeConvertedTo)
  {
         if((temperatureUnit.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return String.format("%.2f°C = %.2f K",Double.parseDouble(temperatureToBeConverted),Double.parseDouble(temperatureToBeConverted)+273.15);
         else if ((temperatureUnit.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return String.format("%.2f°C = %.2f°F",Double.parseDouble(temperatureToBeConverted),1.80*(Double.parseDouble(temperatureToBeConverted))+32);
         else if ((temperatureUnit.equals("Fahrenheit"))&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return String.format("%.2f°F = %.2f°C",Double.parseDouble(temperatureToBeConverted),((Double.parseDouble(temperatureToBeConverted)-32)/1.8));
         else if ((temperatureUnit.equals("Fahrenheit"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return String.format("%.2f°F = %.2f K",Double.parseDouble(temperatureToBeConverted),(((((Double.parseDouble(temperatureToBeConverted))-32)/1.8)+273.15)));
         else if ((temperatureUnit.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return String.format("%.2f K = %.2f°C",Double.parseDouble(temperatureToBeConverted),Double.parseDouble(temperatureToBeConverted)-273.15);
         else if ((temperatureUnit.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return String.format("%.2f K = %.2f°F",Double.parseDouble(temperatureToBeConverted),1.8*(Double.parseDouble(temperatureToBeConverted)-273)+32);      
         else if ((temperatureUnit.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return String.format("%.2f K = %.2f K",Double.parseDouble(temperatureToBeConverted),Double.parseDouble(temperatureToBeConverted));
         else if ((temperatureUnit.equals("Fahrenheit"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return String.format("%.2f°F = %.2f°F",Double.parseDouble(temperatureToBeConverted),Double.parseDouble(temperatureToBeConverted));
         else if ((temperatureUnit.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return String.format("%.2f°C = %.2f°C",Double.parseDouble(temperatureToBeConverted),Double.parseDouble(temperatureToBeConverted));
         return null;
   }
   public String getConvertedTemperature(String temperatureUnit,String temperatureUnitToBeConvertedTo)
   {
         if((temperatureUnit.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return String.format("%.2f K",Double.parseDouble(temperatureToBeConverted)+273.15);
         else if ((temperatureUnit.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return String.format("%.2f°F",1.80*(Double.parseDouble(temperatureToBeConverted))+32);
         else if ((temperatureUnit.equals("Fahrenheit"))&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return String.format("%.2f°C",((Double.parseDouble(temperatureToBeConverted)-32)/1.8));
         else if ((temperatureUnit.equals("Fahrenheit"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return String.format("%.2f K",(((((Double.parseDouble(temperatureToBeConverted))-32)/1.8)+273.15)));
         else if ((temperatureUnit.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return String.format("%.2f°C",Double.parseDouble(temperatureToBeConverted)-273.15);
         else if ((temperatureUnit.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return String.format("%.2f°F",1.8*(Double.parseDouble(temperatureToBeConverted)-273)+32);      
         else if ((temperatureUnit.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return String.format("%.2f K",Double.parseDouble(temperatureToBeConverted));
         else if ((temperatureUnit.equals("Fahrenheit"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return String.format("%.2f°F",Double.parseDouble(temperatureToBeConverted));
         else if ((temperatureUnit.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return String.format("%.2f°C",Double.parseDouble(temperatureToBeConverted));
         return null;
   }

}
 