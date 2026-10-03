package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class cza {
    public static <E> boolean a(List<E> list, E e2) {
        if (list == null || e2 == null || list.isEmpty()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        while (it.hasNext()) {
            if (e2.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <E> List<E> b(List<E> list, List<E> list2) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!a(list2, list.get(i))) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    public static <E> List<E> c(List<E> list, List<E> list2) {
        ArrayList arrayList = new ArrayList();
        if (list2 == null) {
            return null;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!a(list, list2.get(i))) {
                arrayList.add(list2.get(i));
            }
        }
        return arrayList;
    }
}
