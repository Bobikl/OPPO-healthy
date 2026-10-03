package com.oplus.aiunit.vision;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes15.dex */
public class su8 {
    @Deprecated
    public static cfg a() {
        return ru8.k(hfg.a(), apj.Thread_Type_Rxjava_Computation);
    }

    public static cfg b(ExecutorService executorService) {
        return hfg.b(executorService);
    }

    @Deprecated
    public static cfg c() {
        return ru8.k(hfg.d(), apj.Thread_Type_Rxjava_Io);
    }

    public static cfg d(String str) {
        return ru8.l(hfg.d(), apj.Thread_Type_Rxjava_Io, str);
    }

    @Deprecated
    public static cfg e() {
        return ru8.k(hfg.e(), apj.Thread_Type_Rxjava_NewThread);
    }

    @Deprecated
    public static cfg f() {
        return ru8.k(hfg.f(), apj.Thread_Type_Rxjava_Single);
    }

    public static cfg g(String str) {
        return ru8.l(hfg.f(), apj.Thread_Type_Rxjava_Single, str);
    }
}
