package aufgabenblatt_7.state;

public class Laufend implements VideoaufnahmeZustand {
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
        return new Pausiert();
    }

    @Override
    public VideoaufnahmeZustand weiter() {
        return this;
    }

    @Override
    public VideoaufnahmeZustand stop() {
        return new Gestoppt();
    }
}
