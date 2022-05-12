package Aufgabenblatt_8.Decorator;

public class Meteoritenschwert implements Schwert {

    @Override
    public void zeichne() {
        System.out.println("Ein Meteoritenschwert");
    }

    @Override
    public int schaden() {
        System.out.println("Das Meteoritenschwert macht 75 normalen Schaden");
        return 75;
    }
}
