package com.heytap.health.base.splitapk.connection;

import androidx.annotation.Keep;
import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/base/splitapk/connection/SplitRequestParam;", "", "business", "", "function", RnConstant.KEY_INIT_OPTIONS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusiness", "()Ljava/lang/String;", "getFunction", "getParam", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SplitRequestParam {

    @NotNull
    private final String business;

    @NotNull
    private final String function;

    @NotNull
    private final String param;

    public SplitRequestParam(@NotNull String business, @NotNull String function, @NotNull String param) {
        Intrinsics.checkNotNullParameter(business, "business");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(param, "param");
        this.business = business;
        this.function = function;
        this.param = param;
    }

    public static /* synthetic */ SplitRequestParam copy$default(SplitRequestParam splitRequestParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = splitRequestParam.business;
        }
        if ((i & 2) != 0) {
            str2 = splitRequestParam.function;
        }
        if ((i & 4) != 0) {
            str3 = splitRequestParam.param;
        }
        return splitRequestParam.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBusiness() {
        return this.business;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFunction() {
        return this.function;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    @NotNull
    public final SplitRequestParam copy(@NotNull String business, @NotNull String function, @NotNull String param) {
        Intrinsics.checkNotNullParameter(business, "business");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(param, "param");
        return new SplitRequestParam(business, function, param);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitRequestParam)) {
            return false;
        }
        SplitRequestParam splitRequestParam = (SplitRequestParam) other;
        return Intrinsics.areEqual(this.business, splitRequestParam.business) && Intrinsics.areEqual(this.function, splitRequestParam.function) && Intrinsics.areEqual(this.param, splitRequestParam.param);
    }

    @NotNull
    public final String getBusiness() {
        return this.business;
    }

    @NotNull
    public final String getFunction() {
        return this.function;
    }

    @NotNull
    public final String getParam() {
        return this.param;
    }

    public int hashCode() {
        return (((this.business.hashCode() * 31) + this.function.hashCode()) * 31) + this.param.hashCode();
    }

    @NotNull
    public String toString() {
        return "SplitRequestParam(business=" + this.business + ", function=" + this.function + ", param=" + this.param + ")";
    }
}
