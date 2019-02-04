package arrays.ex6ex7recursive_multidim_arrays;

import arrays.BerilliumSphere;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       printSpheres(getSpheres(2,2,3,3,3));

    }

    public static void printSpheres(Object spheres) {
        Class<?> clazz = spheres.getClass();
        if (clazz.isArray()) {
            for (Object item : (Object[]) spheres) {
                printSpheres(item);

            }
            System.out.println();
        } else {
            System.out.print(spheres+" ");
        }


    }
    public  static Object getSpheres(int ...levels) {
        if(levels.length==0) return null;
        if (levels.length == 1) {
           return Stream
                    .generate(BerilliumSphere::new)
                    .limit(levels[0])
                    .toArray();
        }
            Object[] array = new Object[levels[0]];
        int[] newlevels = Arrays.copyOfRange(levels, 1, levels.length);
            for (int i = 0; i < array.length; i++) {
                array[i] = getSpheres(newlevels);
            }
        return array;
        }



    public static BerilliumSphere[][] getTwoLevelSpheres(int firstLevel,int secondLevel){
       return Stream.generate(() -> Stream
                .generate(BerilliumSphere::new)
                .limit(secondLevel)
                .toArray(BerilliumSphere[]::new))
                .limit(firstLevel)
                .toArray(BerilliumSphere[][]::new);

    }

    public static void printTwoLevelSpheres(BerilliumSphere[][] array) {
        Stream
                .of(array)
                .peek(outer->System.out.println())
                .forEach(
                        (BerilliumSphere[] level)->{
                    Stream
                            .of(level)
                            .map(BerilliumSphere::toString)
                            .forEach(inner-> System.out.print(inner+" "));
                }
        );

    }

}
