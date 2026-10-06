package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

  // Instance method to convert Celsius to Fahrenheit
   public double temperatureFahrenheit() {
       return (this.temperatureCelsius*((double)9/5)+32);
   }
    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f°C (%.1f°F) and %s",
                                temperatureCelsius,
                                temperatureFahrenheit(),
                                conditions);
    }

//    // Static factory method to create a WeatherData record from Fahrenheit
      public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
                    return new WeatherData((tempFahrenheit-32)*((double)5/9),conditions);
    }
      public static void main(String[] args) {
            WeatherData record1=new WeatherData(25,"Sunny");
            System.out.println(record1.temperatureFahrenheit());
            System.out.println(record1.getSummary());
            WeatherData record2= WeatherData.fromFahrenheit(50,"Cloudy");
            System.out.println(record2.temperatureFahrenheit());
            System.out.println(record2.getSummary());
    }
    }
