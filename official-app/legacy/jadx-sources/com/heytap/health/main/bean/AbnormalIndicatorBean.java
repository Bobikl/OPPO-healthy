package com.heytap.health.main.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/main/bean/AbnormalIndicatorBean;", "", "count", "", "category", "", "(ILjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AbnormalIndicatorBean {
    public static final int $stable = 0;

    @NotNull
    private final String category;
    private final int count;

    public AbnormalIndicatorBean(int i, @NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.count = i;
        this.category = category;
    }

    public static /* synthetic */ AbnormalIndicatorBean copy$default(AbnormalIndicatorBean abnormalIndicatorBean, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = abnormalIndicatorBean.count;
        }
        if ((i2 & 2) != 0) {
            str = abnormalIndicatorBean.category;
        }
        return abnormalIndicatorBean.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final AbnormalIndicatorBean copy(int count, @NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return new AbnormalIndicatorBean(count, category);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbnormalIndicatorBean)) {
            return false;
        }
        AbnormalIndicatorBean abnormalIndicatorBean = (AbnormalIndicatorBean) other;
        return this.count == abnormalIndicatorBean.count && Intrinsics.areEqual(this.category, abnormalIndicatorBean.category);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return (Integer.hashCode(this.count) * 31) + this.category.hashCode();
    }

    @NotNull
    public String toString() {
        return "AbnormalIndicatorBean(count=" + this.count + ", category=" + this.category + ")";
    }
}
