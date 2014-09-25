package observerPattern_WeatherStation;

public interface Subject {
	//publisher, set up things first
	
	void registerOb(Observer o);

	void removeOb(Observer o);

	void notifyObs();
}
