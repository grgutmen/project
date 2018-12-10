package observer;

public interface IObservable {
	public void addObserver(IObserver o);
	public void notifyObservers();
	public void removeObserver(IObserver o);

}
