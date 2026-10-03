package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public interface d05 {
    Object a();

    void bindDouble(int i, double d);

    void bindLong(int i, long j2);

    void bindString(int i, String str);

    void clearBindings();

    void close();

    void execute();

    long executeInsert();

    long simpleQueryForLong();
}
