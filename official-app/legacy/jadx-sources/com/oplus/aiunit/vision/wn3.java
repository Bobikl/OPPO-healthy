package com.oplus.aiunit.vision;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public interface wn3 {
    int a(SQLiteDatabase sQLiteDatabase, zs6 zs6Var);

    Map<String, List<Long>> b(long j2);

    Map<String, List<Long>> c(long j2);

    int d(List<Long> list);

    int e(SQLiteDatabase sQLiteDatabase, zs6 zs6Var);

    int f(List<co3> list);

    List<String> g();

    Object[] h(long j2, long j3, boolean z, boolean z2, boolean z3, Set<String> set, int... iArr);

    Map<String, List<Long>> i(int i, int i2);

    List<co3> j(String str, int i, long j2, long j3, long j4, int i2, boolean z, boolean z2, int... iArr);

    long[] k(String str, int i, long j2, long j3, long j4, boolean z, boolean z2, int... iArr);
}
