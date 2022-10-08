package Aufgabenblatt_8.Decorator;

public class Goldschwert implements Schwert {

    @Override
    public void zeichne() {
        System.out.println("Ein Goldschwert");
    }

    @Override
    public int schaden() {
        System.out.println("Das Goldschwert macht 75 normalen Schaden");
        return 75;
    }
}
