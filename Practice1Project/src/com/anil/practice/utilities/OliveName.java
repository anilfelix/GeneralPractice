package com.anil.practice.utilities;

/**
 * Created by This1 on 28/08/2015.
 */
public enum OliveName {
    KALAMATA("kalamata"), LIGURIAN("ligua"), ANIL("anil"), HELLO("hello");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
