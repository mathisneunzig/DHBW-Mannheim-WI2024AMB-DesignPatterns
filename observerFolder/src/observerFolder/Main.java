package observerFolder;

public class Main {
    public static void main(String[] args) {

        //Es gibt ein Thema: Software
        Subject Software = new Subject();

        //Es gibt 2 Zuhörer
        Observer Gigachad_Dev = new Observer("Gigachad_Dev");
        Observer Betamale_Dev = new Observer("Betamale_Dev");

        //Die Zuhörer hören dem Thema zu
        Software.registerObserver(Gigachad_Dev);
        Software.registerObserver(Betamale_Dev);

        //Das Thema sagt den Zuhörern etwas
        Software.setNews("Intellij ist besser als alles was Marius vorschlägt.");

        // Beispiel 2

        Subject Postbote = new Subject();

        Observer Peter = new Observer("Peter");
        Observer Alice = new Observer("Alice");
        Observer Herbert = new Observer("Herbert");

        Postbote.registerObserver(Peter);
        Postbote.registerObserver(Alice);
        Postbote.registerObserver(Herbert);

        Postbote.setNews("Habt angst!!! Ich komme.");



    }
}