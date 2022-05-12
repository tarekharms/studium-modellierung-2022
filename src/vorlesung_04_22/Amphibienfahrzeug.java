package vorlesung_04_22;

public class Amphibienfahrzeug implements Auto, Boot {
    @Override
    public void fahren() {
        System.out.println("Brumm brumm am Land");
    }

    @Override
    public void schwimmen() {
        System.out.println("Brumm brumm im Wasser");
    }
}
