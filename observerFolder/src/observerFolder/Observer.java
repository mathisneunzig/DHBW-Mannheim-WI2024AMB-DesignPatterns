package observerFolder;

public class Observer {
    public String name;

    //Konstruktor - Hier wird gesagt, dass man das mit einem Namen instanziieren kann.
    public Observer(String name) {
        this.name = name;
    }

    //Konsolenausgabe mit Name + Message
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }

}
