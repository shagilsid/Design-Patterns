public interface IObserverable {
    void register(IObserver observer);
    void unregister(IObserver observer);
    void notifyObservers();
}
