package aufgabenblatt_7.state;

public class Gestoppt implements VideoaufnahmeZustand {
    @Override
    public VideoaufnahmeZustand ok() {
        return new Bereit();
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
        return this;
    }

    @Override
    public VideoaufnahmeZustand stop() {
        return this;
    }
}
