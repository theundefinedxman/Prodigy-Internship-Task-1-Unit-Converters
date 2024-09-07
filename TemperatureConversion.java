/** UnitConverterUIController which allows the UI to have responsive menu features.
*
* @author Buqwana Xolisile
* @version 01/09/2024
*  
*/
public class TemperatureConversions
{
  private static String temperatureToBeConverted;
  private static String convertedTemperature;
  private static String temperatureUnit;
  //private static String temperatureUnitToBeConvertedTo;
  
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
   * Kelvin to Fahrenheit: F = 9/5 (K - 273) + 32
   *
   */
  public static double Conversions(String temperatureUnit,String temperatureUnitToBeConvertedTo)
  {
         if((temperatureUnitToBeConvertedTo.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return Double.parseDouble(temperatureToBeConverted)+273.15;
         else if ((temperatureUnitToBeConvertedTo.equals("Celsius"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return 1.80*(Double.parseDouble(temperatureToBeConverted))+32;
         else if ((temperatureUnitToBeConvertedTo.equals("Fahrenheit"))&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return ((Double.parseDouble(temperatureToBeConverted)-32)*59);
         else if ((temperatureUnitToBeConvertedTo.equals("Fahrenheit"))&&(temperatureUnitToBeConvertedTo.equals("Kelvin")))
            return(((((Double.parseDouble(temperatureToBeConverted))*1.8) - 273)+32));
         else if ((temperatureUnitToBeConvertedTo.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Celsius")))
            return Double.parseDouble(temperatureToBeConverted)-273.15;
         else if ((temperatureUnitToBeConvertedTo.equals("Kelvin"))&&(temperatureUnitToBeConvertedTo.equals("Fahrenheit")))
            return 1.8*(Double.parseDouble(temperatureToBeConverted)-273)+32;
         else 
            return Double.parseDouble(temperatureToBeConverted);
  }
 //  public String toString()
//   {
//     return String.format(".8%",TemperatureConversion.Conversions)  
//   }
//   

  
  


  
  

}