package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/qqb;", "", "", "b", "str", "", "a", "Ljava/lang/String;", "getMedalSp", "()Ljava/lang/String;", "medalSp", "getOmeMedalCacheStr", "omeMedalCacheStr", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class qqb {

    @NotNull
    public static final qqb INSTANCE = new qqb();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String medalSp = "health_share_preference_medal";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String omeMedalCacheStr = "getHomeMedalCacheStr";

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        v9g.x(medalSp).U(omeMedalCacheStr, str);
    }

    @NotNull
    public final String b() {
        String strD = v9g.x(medalSp).D(omeMedalCacheStr);
        Intrinsics.checkNotNullExpressionValue(strD, "getInstance(medalSp).getString(omeMedalCacheStr)");
        return strD;
    }
}
