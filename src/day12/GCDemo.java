package day12;

public class GCDemo {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.println("Total Memory : "+runtime.totalMemory());
        System.out.println("Free Memory : "+runtime.freeMemory());

        for(int i=0; i<100; i++){
            new Object();
        }
        System.out.println("Memory before GC : "+runtime.freeMemory());
        System.gc();
        System.out.println("Memory after GC : "+runtime.freeMemory());
    }
}
