package Aufgabenblatt_8.Decorator;

public class Eisenschwert implements Schwert {

    @Override
    public void zeichne() {
        System.out.println("Ein Eisenschwert");
    }

    @Override
    public int schaden() {
        System.out.println("Das Eisenschwert macht 50 normalen Schaden");
        return 50;
    }
}
