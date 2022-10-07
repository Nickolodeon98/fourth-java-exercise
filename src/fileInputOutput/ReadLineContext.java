package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadLineContext<T> {
    ParseAccordingly<T> toParse;
    private String result;
    private String filename;

    public ReadLineContext(ParseAccordingly<T> toParse, String filename) {
        this.toParse = toParse;
        this.filename = filename;
        this.result = "";
    }

    public List<T> readByLine() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename), 16 * 1024);

        List<T> list = new ArrayList<>();
        while ((result = reader.readLine() )!= null) {
            T object = toParse.parse(result);
            list.add(object);
        }
//        System.out.println(result);

        reader.close();
        return list;
    }


    public ParseAccordingly<T> getToParse() {
        return toParse;
    }
}
