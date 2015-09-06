package com.anil.prac2;

/**
 * Created by This1 on 28/08/2015.
 */
public class Box {
    int length;
    int height;
    int breadth;
    BoxEnum Color = BoxEnum.BLUE;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", height=" + height +
                ", breadth=" + breadth +
                ", Color=" + Color +
                '}';
    }
}
