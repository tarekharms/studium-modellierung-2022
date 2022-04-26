package aufgabenblatt_7.state;

public class Bereit implements VideoaufnahmeZustand {
    @Override
    public VideoaufnahmeZustand ok() {
        return this;
    }

    @Override
    public VideoaufnahmeZustand start() {
        return new Laufend();
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
