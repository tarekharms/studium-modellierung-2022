package Aufgabenblatt_8.Decorator;

public class Feuerzauber extends Verbesserung {

    public Feuerzauber(Schwert schwert) {
        super(schwert);
    }

    public void zeichne() {
        this.schwert.zeichne();
        System.out.println("Und es Brennt");
    }

    public int schaden() {
        int schaden = this.schwert.schaden() + 25;
        System.out.println("Plus 25 Flammenschaden");
        return schaden;
    }
}
