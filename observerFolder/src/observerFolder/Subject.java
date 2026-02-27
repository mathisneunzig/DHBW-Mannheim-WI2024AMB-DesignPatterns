package observerFolder;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //Liste an Observern
    public List<Observer> observers = new ArrayList<>();
    //BBC News
    public String news;

    //Observer in die Liste
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //Observer aus der Liste
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //Observerliste durchgehen und update aufrufen
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    //Observer Notifizieren
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

}
