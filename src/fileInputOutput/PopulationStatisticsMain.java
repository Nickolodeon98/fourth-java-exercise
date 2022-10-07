package fileInputOutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatisticsMain {
    public static void main(String[] args) throws IOException {
        String address = "./from---to.txt";

        ReadLineContext populationReader = new ReadLineContext(new ParseForPopulationMove(), address);
        ReadLineContext patientsReader = new ReadLineContext(new ParseForPatients(), address);

        List<PopulationMove> pmList = populationReader.readByLine();
        List<Patients> ptList = patientsReader.readByLine();

        List<String> stringList = new ArrayList<>();

//        for (PopulationMove populationMove : pmList) {
//            stringList.add(populationMove.changeToString());
//        }

        for (PopulationMove populationMove : pmList) {
            System.out.printf("전입: %d, 전출: %d\n", populationMove.getFromSido(), populationMove.getToSido());
        }

//        PopulationStatistics populationStatistics = new PopulationStatistics(address);
//        populationStatistics.writeToFile(stringList, "./from---to.txt");
    }
}
