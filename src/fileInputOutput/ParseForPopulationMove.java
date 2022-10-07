package fileInputOutput;

import java.io.IOException;

public class ParseForPopulationMove implements ParseAccordingly<PopulationMove> {
    @Override
    public PopulationMove parse(String str) throws IOException {
        String[] info = str.split(", ");

        return new PopulationMove(Integer.parseInt(info[0]), Integer.parseInt(info[1]));
    }
}
