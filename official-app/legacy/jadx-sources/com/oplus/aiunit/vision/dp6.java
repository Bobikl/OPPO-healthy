package com.oplus.aiunit.vision;

import com.heytap.httpdns.env.ApiEnv;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/dp6;", "", "", "a", "Z", "c", "()Z", "isRegionCN", "b", "d", "isReleaseEnv", "Lcom/heytap/httpdns/env/ApiEnv;", "Lcom/heytap/httpdns/env/ApiEnv;", "()Lcom/heytap/httpdns/env/ApiEnv;", "apiEnv", "", "Ljava/lang/String;", "()Ljava/lang/String;", "region", "<init>", "(Lcom/heytap/httpdns/env/ApiEnv;Ljava/lang/String;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class dp6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isRegionCN;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isReleaseEnv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ApiEnv apiEnv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String region;

    public dp6(@NotNull ApiEnv apiEnv, @NotNull String region) {
        Intrinsics.checkNotNullParameter(apiEnv, "apiEnv");
        Intrinsics.checkNotNullParameter(region, "region");
        this.apiEnv = apiEnv;
        this.region = region;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (region == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = region.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        this.isRegionCN = Intrinsics.areEqual(upperCase, "CN");
        this.isReleaseEnv = apiEnv == ApiEnv.RELEASE;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ApiEnv getApiEnv() {
        return this.apiEnv;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsRegionCN() {
        return this.isRegionCN;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsReleaseEnv() {
        return this.isReleaseEnv;
    }
}
