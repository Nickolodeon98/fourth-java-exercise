package fileInputOutput;

import org.apache.commons.math3.genetics.Population;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    private String address;
    private FileReader fr;
    private String result;

    public String getResult() {
        return result;
    }

    public PopulationStatistics() {
    }

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

    public void readByLineV2() {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(address), StandardCharsets.UTF_8);
            while ((result = br.readLine()) != null) System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createAFile(String filename) {
        File file = new File(filename);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(List<String> strs, String filename) throws IOException {
        File file = new File(filename);

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String str : strs) {
            bw.write(str);
        }
        bw.close();
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();

        for (PopulationMove populationMove : pml) {
            String key = populationMove.getFromSido() + "," + populationMove.getToSido();
            if (moveCntMap.get(key) != null) moveCntMap.put(key, moveCntMap.get(key) + 1);
            else moveCntMap.put(key, 1);
        }

        return moveCntMap;
    }
}
