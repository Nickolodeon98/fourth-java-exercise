package fileInputOutput;

import org.apache.commons.math3.genetics.Population;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove() {
    }



    public PopulationMove(int fromSido, int toSido) throws IOException {
//        this.fromSido = sidoString(fromSido);
//        this.toSido = sidoString(toSido);
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getToSido() {
        return toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public void translate() {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get("C:\\LikeLion\\2022.10\\adm_code.xls"));
            String line = "";
            while ((line = br.readLine()) !=  null) {
                String[] convertInfo = line.split("");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String changeToString() {
        return fromSido + ", " + toSido + "\n";
    }


}
