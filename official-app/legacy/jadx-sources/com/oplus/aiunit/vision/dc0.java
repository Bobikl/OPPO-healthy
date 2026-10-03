package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Landroid/content/ContentResolver;", "cr", "", "name", "", "value", "", "a", "staticmanagersdk_release"}, k = 2, mv = {1, 5, 1})
public final class dc0 {
    public static final boolean a(@NotNull ContentResolver cr, @NotNull String name, int i) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(cr, "cr");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean zG = false;
        try {
            Result.Companion companion = Result.INSTANCE;
            zG = ec0.e.g(cr, name, i);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            f7b.f(qug.TAG, Intrinsics.stringPlus("putSecureInt error : ", thM5290exceptionOrNullimpl));
        }
        f7b.d(qug.TAG, Intrinsics.stringPlus("putSecureInt result : ", Boolean.valueOf(zG)));
        return zG;
    }
}
