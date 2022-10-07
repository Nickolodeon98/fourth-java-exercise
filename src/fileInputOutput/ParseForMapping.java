package fileInputOutput;

public class ParseForMapping implements ParseAccordingly<Mapping>{

    @Override
    public Mapping parse(String str) {
        String[] info = str.split(",");

        return new Mapping(info[0], info[1]);
    }
}
