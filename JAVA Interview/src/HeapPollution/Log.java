package HeapPollution;

import java.util.ArrayList;
import java.util.List;

public class Log {
    public static void printLogValues(List<Integer>... logNumberList) {
        Object[] objectList=logNumberList;
        List<String> stringValueList=new ArrayList<>();
        stringValueList.add("Hello");
        objectList[0]=stringValueList;
    }
}
