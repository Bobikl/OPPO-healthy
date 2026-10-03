package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.heytap.health.devicemanager.lock.LockList;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        LockList lockList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lockList.add(arrayList.get(i).freeze());
        }
        return lockList;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        LockList lockList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            lockList.add(it.next().freeze());
        }
        return lockList;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        LockList lockList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e2 : eArr) {
            lockList.add(e2.freeze());
        }
        return lockList;
    }
}
