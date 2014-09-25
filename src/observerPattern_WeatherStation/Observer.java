package observerPattern_WeatherStation;

public interface Observer {
	//specifically for weather station
	void update(float tmp, float humidity, float pressure);

}
