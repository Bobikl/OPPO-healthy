package com.platform.usercenter.tools.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Lists {
    public static <T> boolean isNullOrEmpty(List<T> list) {
        return list == null || list.isEmpty();
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <E> ArrayList<E> newArrayList(List<E> list) {
        return new ArrayList<>(list);
    }

    public static <E> LinkedList<E> newLinkedList(List<E> list) {
        return new LinkedList<>(list);
    }
}
