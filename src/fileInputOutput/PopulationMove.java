package fileInputOutput;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove() {
    }

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

    public PopulationMove cntMoves(String line) {
        String[] info = line.split(",");

        return new PopulationMove(Integer.parseInt(info[0]), Integer.parseInt(info[6]));
    }
}
