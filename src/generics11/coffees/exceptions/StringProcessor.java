package generics11.coffees.exceptions;

import java.util.List;

public class StringProcessor implements Processor<Integer,Failure1,Failure2>{
    private static int count= 3;
    @Override
    public void process(List<Integer> resultCollector) throws Failure1,Failure2 {
        if (count-- == 2) {
            resultCollector.add(1);
        } else {
            resultCollector.add(0);
    }
        if (count < 0) {
            throw new Failure1();
        }
        if (count == 0) {
            throw new Failure2();
        }
        }

    public static void main(String[] args) {
        ProcessRunner<Integer, Failure1,Failure2> runner = new ProcessRunner<>();
        runner.add(new StringProcessor());
        runner.add(new StringProcessor());
        runner.add(new StringProcessor());
        runner.add(new StringProcessor());
        try {
            runner.processAll();
        } catch (Failure1 failure1) {
            failure1.printStackTrace();
        }catch (Failure2 failure2){
            failure2.printStackTrace();
        }
    }
}
