package org.example._20240928_finalizer_and_cleaner;

public class Main {
    public static void main(String[] args) {
        FinalizerTester finalizerTester = new FinalizerTester();
        CleanerTester cleanerTester = new CleanerTester();
        finalizerTester = null;
        cleanerTester = null;
        try (AutoClosableTester autoClosableTester = new AutoClosableTester()) {
            System.gc();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("hello world");
    }
}
