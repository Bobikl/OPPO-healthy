package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public interface ch0 {
    public static final int STANDARD_BUFFER_SIZE_BYTES = 65536;

    void a(int i);

    <T> T b(int i, Class<T> cls);

    <T> T c(int i, Class<T> cls);

    void clearMemory();

    <T> void put(T t);
}
