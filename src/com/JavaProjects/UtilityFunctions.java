package com.JavaProjects;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UtilityFunctions {
    public static ArrayList<Card> subArrayList(int start, int end, ArrayList<Card> arrayList) {
        ArrayList<Card> subArrayList = new ArrayList<>();
        for (var i = start; i <= end; i++) {
            subArrayList.add(arrayList.get(i));
        }
        return subArrayList;
    }
}
