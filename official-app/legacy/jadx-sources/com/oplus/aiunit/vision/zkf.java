package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/zkf;", "", "", "b", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class zkf {

    @NotNull
    public static final zkf INSTANCE = new zkf();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String TAG = "Track.RegionUtil";

    @NotNull
    public final String a() {
        wkj wkjVar = wkj.INSTANCE;
        j04 j04Var = j04.INSTANCE;
        String strB = wkjVar.b(j04Var.f(), "");
        return strB.length() == 0 ? wkjVar.b(j04Var.g(), "") : strB;
    }

    @NotNull
    public final String b() {
        wkj wkjVar = wkj.INSTANCE;
        j04 j04Var = j04.INSTANCE;
        String strB = wkjVar.b(j04Var.b(), "");
        if (strB.length() > 0) {
            return strB;
        }
        String strB2 = wkjVar.b(j04Var.d(), "");
        if (strB2.length() > 0) {
            return strB2;
        }
        String strB3 = wkjVar.b(j04Var.c(), "");
        return strB3.length() > 0 ? strB3 : wkjVar.b(j04Var.e(), "");
    }
}
