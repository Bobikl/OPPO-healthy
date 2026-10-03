package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface lza {
    static <E> boolean a(List<E> list) {
        return list == null || list.isEmpty();
    }

    static <E> boolean b(List<E> list, int i) {
        return list != null && list.size() >= i;
    }
}
