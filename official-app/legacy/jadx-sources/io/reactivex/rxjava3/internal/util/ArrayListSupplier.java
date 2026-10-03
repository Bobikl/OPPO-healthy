package io.reactivex.rxjava3.internal.util;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public enum ArrayListSupplier implements f4j<List<Object>>, d08<Object, List<Object>> {
    INSTANCE;

    public static <T, O> d08<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static <T> f4j<List<T>> asSupplier() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.d08
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // com.oplus.aiunit.vision.f4j
    public List<Object> get() {
        return new ArrayList();
    }
}
