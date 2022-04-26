package aufgabenblatt_7.zustand;

public class Videoaufnahme {
    private Zustand zustand;

    private enum Zustand
    {
        Bereit,
        Laufend,
        Pausiert,
        Gestoppt
    }

    public Videoaufnahme()
    {
        this.zustand = Zustand.Bereit;
    }

    public void start()
    {
        if(this.zustand == Zustand.Bereit)
        {
            this.zustand = Zustand.Laufend;
        }
    }

    public void pause()
    {
        if(this.zustand == Zustand.Laufend)
        {
            this.zustand = Zustand.Pausiert;
        }
    }

    public void weiter()
    {
        if(this.zustand == Zustand.Pausiert)
        {
            this.zustand = Zustand.Laufend;
        }
    }

    public void stop()
    {
        if(this.zustand == Zustand.Laufend || this.zustand == Zustand.Pausiert)
        {
            this.zustand = Zustand.Gestoppt;
        }
    }

    public void ok()
    {
        if(this.zustand == Zustand.Gestoppt)
        {
            this.zustand = Zustand.Bereit;
        }
    }
}
