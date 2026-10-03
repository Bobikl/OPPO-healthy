package com.oplus.aiunit.vision;

import com.oplus.coreapp.appfeature.AppFeatureProviderUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/bpd;", "", "", "b", "", "key", "", "expectValue", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class bpd {

    @NotNull
    public static final bpd INSTANCE = new bpd();

    public final boolean a(String key, int expectValue) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            int iC = AppFeatureProviderUtils.c(b78.a().getContentResolver(), key, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("get feature key:");
            sb.append(key);
            sb.append(" result:");
            sb.append(iC);
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(iC == expectValue));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            a7b.b("OplusFeatureUtils", "get feature key:" + key + " fail," + thM5290exceptionOrNullimpl.getMessage());
            objM5287constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM5287constructorimpl).booleanValue();
    }

    public final boolean b() {
        return a("com.oplus.interconnect.aw.support", 1);
    }
}
