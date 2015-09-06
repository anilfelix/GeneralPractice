package com.anil.prac7;

/**
 * Created by This1 on 31/08/2015.
 */
public enum OliveEnum {
    ANIL("anil"), ASHOK("ashok"), KARLO("karlo");
    String name;

    OliveEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
