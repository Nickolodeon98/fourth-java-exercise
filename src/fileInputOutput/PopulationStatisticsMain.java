package fileInputOutput;

import java.io.IOException;
import java.util.List;

public class PopulationStatisticsMain {
    public static void main(String[] args) throws IOException {
        String address = "C:\\LikeLion\\2022.10\\2021_인구관련연간자료_20220927_66125.csv";

        ReadLineContext populationReader = new ReadLineContext(new ParseForPopulationMove(), address);
        ReadLineContext patientsReader = new ReadLineContext(new ParseForPatients(), address);

        List<PopulationMove> pmList = populationReader.readByLine();
        List<Patients> ptList = patientsReader.readByLine();

        for (Patients patients : ptList) {
            System.out.println(patients.getName());
            System.out.println(patients.getYear());
        }
        System.out.println(ptList.size());

//        for (PopulationMove populationMove : pmList) {
//            System.out.println(populationMove.getFromSido());
//            System.out.println(populationMove.getToSido());
//        }
//        System.out.println(pmList.size());

        PopulationStatistics populationStatistics = new PopulationStatistics(address);
        populationStatistics.createAFile("./from_to.txt");
    }
}
