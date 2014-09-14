package observerPattern_WeatherStation;

public interface Subject {
	void registerOb(Observer o);

	void removeOb(Observer o);

	void notifyObs();
}
