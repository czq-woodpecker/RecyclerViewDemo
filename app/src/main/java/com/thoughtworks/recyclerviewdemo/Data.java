package com.thoughtworks.recyclerviewdemo;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private String title;
    private String description;
    private int number;

    public Data(String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static List<Data> getDataList(int size) {
        List<Data> dataList = new ArrayList<Data>();

        int key = 0;
        for (int i = 0; i < size; i++) {
            key = i + 1;
            dataList.add(new Data("title" + key, "desp" + key, key ));
        }

        return dataList;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }
}
