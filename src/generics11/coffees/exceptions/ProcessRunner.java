package generics11.coffees.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ProcessRunner<T, E extends Exception,E2 extends Exception> extends ArrayList<Processor<T, E,E2>> {
    List<T> processAll() throws E ,E2{
        List<T> resultCollector = new ArrayList<>();
        for (Processor<T, E,E2> processor : this) {
            processor.process(resultCollector);

        }
        return resultCollector;
    }


}
