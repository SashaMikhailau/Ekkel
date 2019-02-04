package arrays.ex3ex4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        printThreeLevelArray(createThreeLevelArray(5,5,5,1,5));
    }

    public static double[][] createTwoLevelArray(int firstLvl, int secondLvl, double startValue, double endValue) {
        Random random = new Random(47);
        double[][] array = new double[firstLvl][secondLvl];
        for (double[] element : array) {
            for (int i = 0; i < element.length; i++) {
                element[i] = random.nextDouble() * (endValue - startValue) + startValue;
            }
        }
        return array;
    }
    public static double[][][] createThreeLevelArray(int firstLevel,int secondLevel,int thirdLevel,double startVlaue,double endValue) {
        double[][][] array = new double[firstLevel][secondLevel][thirdLevel];
        for (int i = 0; i < array.length; i++) {
            array[i] = createTwoLevelArray(secondLevel, thirdLevel, startVlaue, endValue);
        }
        return array;
    }

    public static void printThreeLevelArray(double[][][] array) {
        for (int i = 0; i < array.length;i++) {
            printArray(array[i]);
            System.out.println("---------------------------");
        }
    }

    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%.2f ",array[i][j]));
            }
            System.out.println();
        }
    }
}
