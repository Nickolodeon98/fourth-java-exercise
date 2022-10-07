package fileInputOutput;

import java.io.IOException;
import java.util.*;

public class PopulationStatisticsMain {
    public static void main(String[] args) throws IOException {
        String address = "./from---to.txt";

        ReadLineContext populationReader = new ReadLineContext(new ParseForPopulationMove(), address);
//        ReadLineContext patientsReader = new ReadLineContext(new ParseForPatients(), address);

        List<PopulationMove> pmList = populationReader.readByLine();
//        List<Patients> ptList = patientsReader.readByLine();


        PopulationStatistics ps = new PopulationStatistics();

        Map<String, Integer> moveCntMap = ps.getMoveCntMap(pmList);

//        for (Map.Entry entry : ps.getMoveCntMap(pmList).entrySet()) {
//            System.out.printf("시도코드 %s는 %d개 있습니다.\n", entry.getKey(), entry.getValue());
//        }

        List<String> mapToList = new ArrayList<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : moveCntMap.entrySet()) {
            String[] keySplitted = stringIntegerEntry.getKey().split(",");
            mapToList.add(String.format("[%s, %s, %s]\n", keySplitted[0], keySplitted[1], stringIntegerEntry.getValue()));
        }

        ps.writeToFile(mapToList, "./forAHeatmap.txt");

        /*change to string list before writing a new file*/
//        List<String> stringList = new ArrayList<>();
//        for (PopulationMove populationMove : pmList) {
//            stringList.add(populationMove.changeToString());
//        }


//        Set<String> noDuplicate = new HashSet<>();

//        for (PopulationMove populationMove : pmList) {
////            populationMove.sidoString()
//            System.out.printf("전입: %s, 전출: %s\n", populationMove.getFromSido(), populationMove.getToSido());
////            noDuplicate.add(populationMove.getFromSido());
////            noDuplicate.add(populationMove.getToSido());
//        }

//        PopulationStatistics populationStatistics = new PopulationStatistics(address);
//        populationStatistics.writeToFile(stringList, "./from---to.txt");
    }
}
