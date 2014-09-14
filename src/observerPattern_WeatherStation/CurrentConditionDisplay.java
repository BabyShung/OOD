package observerPattern_WeatherStation;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		// subscribe from subject
		weatherData.registerOb(this);
	}

	@Override
	public void update(float tmp, float humidity, float pressure) {
		this.temperature = tmp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println(temperature + " " + humidity);
	}

}
