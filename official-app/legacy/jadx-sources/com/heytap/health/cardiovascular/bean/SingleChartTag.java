package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/SingleChartTag;", "", "isRisk", "", "text", "", "(ZLjava/lang/String;)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SingleChartTag {
    public static final int $stable = 0;
    private final boolean isRisk;

    @NotNull
    private final String text;

    public SingleChartTag(boolean z, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.isRisk = z;
        this.text = text;
    }

    public static /* synthetic */ SingleChartTag copy$default(SingleChartTag singleChartTag, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = singleChartTag.isRisk;
        }
        if ((i & 2) != 0) {
            str = singleChartTag.text;
        }
        return singleChartTag.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsRisk() {
        return this.isRisk;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final SingleChartTag copy(boolean isRisk, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new SingleChartTag(isRisk, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleChartTag)) {
            return false;
        }
        SingleChartTag singleChartTag = (SingleChartTag) other;
        return this.isRisk == singleChartTag.isRisk && Intrinsics.areEqual(this.text, singleChartTag.text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isRisk;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.text.hashCode();
    }

    public final boolean isRisk() {
        return this.isRisk;
    }

    @NotNull
    public String toString() {
        return "SingleChartTag(isRisk=" + this.isRisk + ", text=" + this.text + ")";
    }
}
