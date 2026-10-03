package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class kd {
    public final ql9 a;

    @FunctionalInterface
    public interface a<T> {
        Map<String, String> a(T t, long j2);
    }

    @FunctionalInterface
    public interface b<T> {
        T execute();
    }

    public kd(ql9 ql9Var) {
        this.a = ql9Var;
    }

    public <T> T a(String str, String str2, Context context, Map<String, String> map, a<T> aVar, b<T> bVar) {
        long startTime = this.a.getStartTime();
        this.a.b(str, str2, context, map);
        T tExecute = bVar.execute();
        long jC = this.a.c(startTime);
        this.a.a(str, str2, context, jC, tExecute, aVar.a(tExecute, jC));
        return tExecute;
    }
}
