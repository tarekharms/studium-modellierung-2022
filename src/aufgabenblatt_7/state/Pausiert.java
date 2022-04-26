package aufgabenblatt_7.state;

public class Pausiert implements VideoaufnahmeZustand {
    @Override
    public VideoaufnahmeZustand ok() {
        return this;
    }

    @Override
    public VideoaufnahmeZustand start() {
        return this;
    }

    @Override
    public VideoaufnahmeZustand pause() {
        return this;
    }

    @Override
    public VideoaufnahmeZustand weiter() {
        return new Laufend();
    }

    @Override
    public VideoaufnahmeZustand stop() {
        return new Gestoppt();
    }
}
