package observerPattern_WeatherStation_Java;

import java.util.Observable;
import java.util.Observer;

import observerPattern_WeatherStation.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Observable weatherData;

	public CurrentConditionDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		// subscribe from subject
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(temperature + " " + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData wd = (WeatherData) o;// get its publisher
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			display();
		}
	}

}
