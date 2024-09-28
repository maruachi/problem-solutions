package org.example._20240928_finalizer_and_cleaner;

public class AutoClosableTester implements AutoCloseable{
    public AutoClosableTester() {
    }

    @Override
    public void close() throws Exception {
        System.out.println("hello close");
    }
}
