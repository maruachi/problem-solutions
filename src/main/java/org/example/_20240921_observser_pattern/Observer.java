package org.example._20240921_observser_pattern;

public interface Observer<T,V> {
    void update(T targetObject, V newValue,  V oldValue);
}
