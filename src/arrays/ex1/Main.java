package arrays.ex1;

import arrays.BerilliumSphere;

import java.util.stream.Stream;

public class Main {
    private final static BerilliumSphere[] spheres = {new BerilliumSphere(), new BerilliumSphere(), new BerilliumSphere()};
    private final static BerilliumSphere[] spheres2 =  new BerilliumSphere[]{new BerilliumSphere(), new BerilliumSphere(), new BerilliumSphere()};
    public static void testSpheres(BerilliumSphere[] spheres) {
        for (BerilliumSphere sphere : spheres) {
            System.out.println(sphere);
        }
    }

    public static BerilliumSphere[] getSpheres(int count) {
        BerilliumSphere[] spheres = new BerilliumSphere[count];
        for (int i = 0; i < count; i++) {
            spheres[i] = new BerilliumSphere();
        }
        spheres = Stream.generate(BerilliumSphere::new).limit(count).toArray(BerilliumSphere[]::new);
        return spheres;
    }

    public static void main(String[] args) {
        testSpheres(getSpheres(5));

    }
}
