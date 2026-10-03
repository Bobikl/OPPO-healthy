package io.reactivex.rxjava3.internal.util;

import com.oplus.aiunit.vision.md1;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public enum ListAddBiConsumer implements md1<List, Object, List> {
    INSTANCE;

    public static <T> md1<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.md1
    public List apply(List list, Object obj) {
        list.add(obj);
        return list;
    }
}
