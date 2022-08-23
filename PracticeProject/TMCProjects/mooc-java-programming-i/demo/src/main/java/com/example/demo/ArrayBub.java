package com.example.demo;


public class ArrayBub {
    private int count;
    private int[] list;

    public ArrayBub(int size) {
        this.count = 0;
        list = new int[size];
    }
    public void addNum(int num) {
        list[count] = num;
        count++;
    }
}
