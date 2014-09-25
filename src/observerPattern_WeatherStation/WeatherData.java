package observerPattern_WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> obs;// maintain all obs

	// its properties
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		obs = new ArrayList<>();
	}

	public void measureChanged() {
		this.notifyObs();
	}

	// after setting, it should notify obs
	public void setMeasure(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measureChanged();
	}

	@Override
	public void registerOb(Observer o) {
		obs.add(o);
	}

	@Override
	public void removeOb(Observer o) {
		int i = obs.indexOf(o);
		if (i >= 0)
			obs.remove(i);
	}

	@Override
	public void notifyObs() {
		for (int i = 0; i < obs.size(); i++) {
			Observer ob = obs.get(i);
			// all updating with the same stuff
			ob.update(temperature, humidity, pressure);
		}
	}

}
