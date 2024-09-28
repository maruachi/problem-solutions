package org.example._20240928_finalizer_and_cleaner;

import java.lang.ref.Cleaner;

public class CleanerTester {
    private static final Cleaner cleaner = Cleaner.create();

    private static class CleanerTesterCleaner implements Runnable {
        @Override
        public void run() {
            System.out.println("hello cleaner");
        }
    }

    public CleanerTester() {
        Cleaner.Cleanable register = cleaner.register(this, new CleanerTesterCleaner());
    }
}
