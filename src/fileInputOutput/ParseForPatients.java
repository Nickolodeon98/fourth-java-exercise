package fileInputOutput;

public class ParseForPatients implements ParseAccordingly<Patients>{
    @Override
    public Patients parse(String str) {
        String[] info = str.split(",");

        return new Patients(info[3], info[2]);
    }
}
