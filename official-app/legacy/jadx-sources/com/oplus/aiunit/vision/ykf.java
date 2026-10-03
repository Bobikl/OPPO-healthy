package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ykf;", "", "", "b", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class ykf {

    @NotNull
    public static final ykf INSTANCE = new ykf();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String TAG = "Track.RegionUtil";

    @NotNull
    public final String a() {
        xkj xkjVar = xkj.INSTANCE;
        k04 k04Var = k04.INSTANCE;
        String strC = xkjVar.c(k04Var.i(), "");
        return strC.length() == 0 ? xkjVar.c(k04Var.j(), "") : strC;
    }

    @NotNull
    public final String b() {
        xkj xkjVar = xkj.INSTANCE;
        k04 k04Var = k04.INSTANCE;
        String strC = xkjVar.c(k04Var.e(), "");
        if (strC.length() > 0) {
            return strC;
        }
        String strC2 = xkjVar.c(k04Var.g(), "");
        if (strC2.length() > 0) {
            return strC2;
        }
        String strC3 = xkjVar.c(k04Var.f(), "");
        return strC3.length() > 0 ? strC3 : xkjVar.c(k04Var.h(), "");
    }
}
