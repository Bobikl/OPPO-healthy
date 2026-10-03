package com.oplus.aiunit.vision;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public interface jo3 {
    int a(SQLiteDatabase sQLiteDatabase, zs6 zs6Var);

    Map<String, List<Long>> b(long j2);

    Map<String, List<Long>> c(long j2);

    int d(List<Long> list);

    int e(SQLiteDatabase sQLiteDatabase, zs6 zs6Var);

    int f(List<co3> list);

    List<String> g();

    List<co3> h(String str, int i, long j2, int i2, boolean z, boolean z2);

    List<co3> i(String str, long j2, long j3, long j4, int i, boolean z, boolean z2, int... iArr);

    Object[] j(long j2, long j3, boolean z, boolean z2, Set<String> set, int... iArr);

    long[] k(String str, long j2, long j3, boolean z, boolean z2, int... iArr);

    List<co3> l(int i, boolean z);

    Object[] m(long j2, long j3, boolean z, boolean z2, Set<String> set, int... iArr);

    List<co3> n(String str, long j2, long j3, int i, boolean z, boolean z2, int... iArr);

    Map<String, List<Long>> o(int i);

    long[] p(String str, long j2, long j3, long j4, boolean z, boolean z2, int... iArr);
}
