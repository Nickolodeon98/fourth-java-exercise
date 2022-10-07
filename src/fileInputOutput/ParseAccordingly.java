package fileInputOutput;

import java.util.List;

public interface ParseAccordingly<T> {
    T parse(String str);
}
