package generics11.coffees.exceptions;

import java.util.List;

public interface Processor<T, E extends Exception, E2 extends Exception> {
    void process(List<T> resultCollector) throws E,E2;
}
