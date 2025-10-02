public class Temperature {
    // Attribute to store temperature in Fahrenheit
    private double fTemp;
    // Constructor to initialize temperature
    public Temperature(double f) {
        fTemp = f;
    }
   //setter and getter for Fahrenheit temperature
    public void setFahrenheit(double f) {
        fTemp = f;
    }
    public double getFahrenheit() {
        return fTemp;
    }

    // Methods to convert Fahrenheit to Celsius and Kelvin
    public double getCelsius() {
        return (5.0 / 9) * (fTemp - 32);
    }

    public double getKelvin() {
        return (5.0 / 9) * (fTemp - 32) + 273;
    }
}
