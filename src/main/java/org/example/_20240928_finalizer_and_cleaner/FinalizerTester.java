package org.example._20240928_finalizer_and_cleaner;

public class FinalizerTester {
    public FinalizerTester() {
        System.out.println("create finalizerTester");
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        System.out.println("hello finalize");
        super.finalize();
    }
}
