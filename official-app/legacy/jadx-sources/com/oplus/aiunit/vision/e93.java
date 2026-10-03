package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class e93 {
    @SafeVarargs
    public static <T> boolean a(T[]... tArr) {
        if (tArr == null) {
            return false;
        }
        for (T[] tArr2 : tArr) {
            if (tArr2 == null || tArr2.length == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Collection... collectionArr) {
        for (Collection collection : collectionArr) {
            if (collection == null || collection.size() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static <D> List<D> c(List<D> list) {
        return list == null ? Collections.emptyList() : list;
    }
}
