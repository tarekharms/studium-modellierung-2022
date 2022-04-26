package aufgabenblatt_7.state;

public interface VideoaufnahmeZustand {
    public VideoaufnahmeZustand ok();

    public VideoaufnahmeZustand start();

    public VideoaufnahmeZustand pause();

    public VideoaufnahmeZustand weiter();

    public VideoaufnahmeZustand stop();

}
