package io.reactivex.internal.util;

import com.oplus.aiunit.vision.j08;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, j08<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> j08<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.j08
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
