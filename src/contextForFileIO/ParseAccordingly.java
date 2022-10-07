package contextForFileIO;

import java.io.IOException;
import java.util.List;

public interface ParseAccordingly<T> {
    T parse(String str) throws IOException;
}
