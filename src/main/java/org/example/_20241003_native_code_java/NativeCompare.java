package org.example._20241003_native_code_java;

public class NativeCompare {
    static {
        System.load("/Users/dgyim/myworks/java/problem-solutions/src/main/java/org/example/_20241003_native_code_java/libNativeCompare.so");
    }
    public native int addRangeNative(int start, int nd);

    public int addRangeJava(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        NativeCompare nativeCompare = new NativeCompare();

        int start = 1;
        int end = 1000000000;

        long startTime = 0;
        long endTime = 0;

        startTime = System.nanoTime();
        nativeCompare.addRangeJava(start, end);
        endTime = System.nanoTime();

        long elapsedTime = (endTime - startTime) / 1_000_000L;
        System.out.println("addRangeJava elapsedTime = " + elapsedTime + "ms");

        startTime = System.nanoTime();
        nativeCompare.addRangeNative(start, end);
        endTime = System.nanoTime();

        elapsedTime = (endTime - startTime) / 1_000_000L;
        System.out.println("addRangeNative elapsedTime = " + elapsedTime + "ms");
    }

}
