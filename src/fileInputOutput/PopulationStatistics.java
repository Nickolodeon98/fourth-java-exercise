package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    private String address;
    private FileReader fr;
    private String result;

    public PopulationStatistics(String address) throws FileNotFoundException {
        this.address = address;
        this.fr = new FileReader(address);
        this.result = "";
    }

    public void readByChar() throws IOException {
        while (result.length() < 10) {
            char c = (char) fr.read();
            result += c;
        }
        System.out.println(result);
    }

    public void readByLine() throws IOException {
        BufferedReader reader = new BufferedReader(fr);

        while ((result = reader.readLine()) != null) {
            System.out.println(result);
        }
        reader.close();
    }

    public void readByLineV2() {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(address), StandardCharsets.UTF_8);
            while ((result = br.readLine()) != null) System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
