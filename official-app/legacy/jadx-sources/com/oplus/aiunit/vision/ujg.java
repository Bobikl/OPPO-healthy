package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ujg {
    public static final List<ThreadLocal<?>> a = new ArrayList();

    public static synchronized <T> ThreadLocal<T> a(ThreadLocal<T> threadLocal) {
        a.add(threadLocal);
        return threadLocal;
    }
}
