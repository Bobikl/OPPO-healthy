package io.reactivex.internal.util;

import com.oplus.aiunit.vision.nd1;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public enum ListAddBiConsumer implements nd1<List, Object, List> {
    INSTANCE;

    public static <T> nd1<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.nd1
    public List apply(List list, Object obj) throws Exception {
        list.add(obj);
        return list;
    }
}
