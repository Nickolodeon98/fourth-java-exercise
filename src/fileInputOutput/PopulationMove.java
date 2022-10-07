package fileInputOutput;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getToSido() {
        return toSido;
    }

    public int getFromSido() {
        return fromSido;
    }
}
