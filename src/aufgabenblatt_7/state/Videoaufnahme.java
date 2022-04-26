package aufgabenblatt_7.state;

public class Videoaufnahme {
    private VideoaufnahmeZustand zustand;

    public Videoaufnahme()
    {
        this.zustand = new Bereit();
    }

    public void start()
    {
        this.zustand = zustand.start();
    }

    public void weiter()
    {
        this.zustand = zustand.weiter();
    }

    public void pause()
    {
        this.zustand = zustand.pause();
    }

    public void stop()
    {
        this.zustand = zustand.stop();
    }

    public void ok()
    {
        this.zustand = zustand.ok();
    }
}
