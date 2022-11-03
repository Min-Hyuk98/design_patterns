public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(90, 70, 23.5f);
        weatherData.setMeasurements(80, 80, 27.8f);
    }
}
