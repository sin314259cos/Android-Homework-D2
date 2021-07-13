package com.example.projectchapter2.recycler;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {

    public static List<TestData> getData() {
        List<TestData> result = new ArrayList();
        result.add(new TestData("不", "666w"));
        result.add(new TestData("知", "514w"));
        result.add(new TestData("道？", "233w"));
        result.add(new TestData("在", "114w"));
        result.add(new TestData("这", "98w"));
        result.add(new TestData("里", "66w"));
        result.add(new TestData("面", "43w"));
        result.add(new TestData("写", "23"));
        result.add(new TestData("什", "14w"));
        result.add(new TestData("么", "10w"));
        result.add(new TestData("好", "0.0001w"));
        return result;
    }

}
