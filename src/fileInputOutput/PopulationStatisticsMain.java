package fileInputOutput;

import java.io.IOException;

public class PopulationStatisticsMain {
    public static void main(String[] args) throws IOException {
        String address = "C:\\LikeLion\\2022.10\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics(address);
        populationStatistics.readByLine();

        PopulationMove populationMove = new PopulationMove();

        populationMove = populationMove.cntMoves(populationStatistics.getResult());

        System.out.println(populationMove.getFromSido());
        System.out.println(populationMove.getToSido());

//        populationStatistics.readByLineV2();
    }
}
