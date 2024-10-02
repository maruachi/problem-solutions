package org.example._20241001_equals;

import java.util.Objects;

public class MyIdentifier {
    private final String name;
    private final int value;

    public MyIdentifier(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        //1. 자기 참조인지 검사
        if (this == o) return true;

        //2. 자기 타입인지 검사
        if (o == null || getClass() != o.getClass()) return false;

        //3. 자기 타입으로 형변환
        MyIdentifier that = (MyIdentifier) o;

        //4. 핵심 필드 일치여부 검사
        return value == that.value && Objects.equals(name, that.name);
    }
}
