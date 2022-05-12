package Aufgabenblatt_8.Decorator;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Schmiede Schwerter");

        Schwert eisenschwert = new Eisenschwert();
        Schwert meteoritenschwert = new Meteoritenschwert();

        eisenschwert.zeichne();
        eisenschwert.schaden();

        meteoritenschwert.zeichne();
        meteoritenschwert.schaden();

        System.out.println();
        System.out.println("Verzaubere Schwerter");

        Schwert flammenEisenSchwert = new Feuerzauber(eisenschwert);
        Schwert flammenMeteoritenSchwert = new Feuerzauber(meteoritenschwert);

        flammenEisenSchwert.zeichne();
        flammenEisenSchwert.schaden();

        flammenMeteoritenSchwert.zeichne();
        flammenMeteoritenSchwert.schaden();

        System.out.println();
        System.out.println("Schärfe Schwerter");

        Schwert scharfesEisenSchwert = new Schaerfe(eisenschwert);
        Schwert scharfesMeteoritenSchwert = new Schaerfe(meteoritenschwert);

        scharfesEisenSchwert.zeichne();
        scharfesEisenSchwert.schaden();

        scharfesMeteoritenSchwert.zeichne();
        scharfesMeteoritenSchwert.schaden();

        System.out.println();
        System.out.println("Schärfe Flammenschwerter");

        Schwert scharfesFlammenEisenSchwert = new Schaerfe(flammenEisenSchwert);
        Schwert scharfesFlammenMeteoritenSchwert = new Schaerfe(flammenMeteoritenSchwert);

        scharfesFlammenEisenSchwert.zeichne();
        scharfesFlammenEisenSchwert.schaden();

        scharfesFlammenMeteoritenSchwert.zeichne();
        scharfesFlammenMeteoritenSchwert.schaden();

        System.out.println();
        System.out.println("Verzaubere geschäurfte Schweter");

        Schwert flammendesGeschaerftesEisenschwert = new Feuerzauber(scharfesEisenSchwert);
        Schwert flammendesGeschaerftesMeteoritenschwert = new Feuerzauber(scharfesMeteoritenSchwert);

        flammendesGeschaerftesEisenschwert.zeichne();
        flammendesGeschaerftesEisenschwert.schaden();

        flammendesGeschaerftesMeteoritenschwert.zeichne();
        flammendesGeschaerftesMeteoritenschwert.schaden();

    }
}
