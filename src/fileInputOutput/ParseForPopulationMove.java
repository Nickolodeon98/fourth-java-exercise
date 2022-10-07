package fileInputOutput;

public class ParseForPopulationMove implements ParseAccordingly<PopulationMove> {
    @Override
    public PopulationMove parse(String str) {
        String[] info = str.split(",");

        return new PopulationMove(Integer.parseInt(info[6]), Integer.parseInt(info[0]));
    }
}
