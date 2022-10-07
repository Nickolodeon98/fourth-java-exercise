package fileInputOutput;

import java.io.IOException;

public class PopulationStatisticsMain {
    public static void main(String[] args) throws IOException {
        String address = "C:\\LikeLion\\2022.10\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics(address);
        populationStatistics.readByLine();
        populationStatistics.readByLineV2();
    }
}
