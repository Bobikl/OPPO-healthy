package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/insight/net/LimitValue;", "", DBHealthReviewPlan.DESC, "", "descZh", "value", "", "lineColor", "", ParserTag.TAG_TEXT_COLOR, "(Ljava/lang/String;Ljava/lang/String;FJJ)V", "getDesc", "()Ljava/lang/String;", "getDescZh", "getLineColor", "()J", "getTextColor", "getValue", "()F", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LimitValue {

    @NotNull
    private final String desc;

    @NotNull
    private final String descZh;
    private final long lineColor;
    private final long textColor;
    private final float value;

    public LimitValue(@NotNull String desc, @NotNull String descZh, float f, long j2, long j3) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        this.desc = desc;
        this.descZh = descZh;
        this.value = f;
        this.lineColor = j2;
        this.textColor = j3;
    }

    public static /* synthetic */ LimitValue copy$default(LimitValue limitValue, String str, String str2, float f, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitValue.desc;
        }
        if ((i & 2) != 0) {
            str2 = limitValue.descZh;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            f = limitValue.value;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            j2 = limitValue.lineColor;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            j3 = limitValue.textColor;
        }
        return limitValue.copy(str, str3, f2, j4, j3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescZh() {
        return this.descZh;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLineColor() {
        return this.lineColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final LimitValue copy(@NotNull String desc, @NotNull String descZh, float value, long lineColor, long textColor) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        return new LimitValue(desc, descZh, value, lineColor, textColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitValue)) {
            return false;
        }
        LimitValue limitValue = (LimitValue) other;
        return Intrinsics.areEqual(this.desc, limitValue.desc) && Intrinsics.areEqual(this.descZh, limitValue.descZh) && Float.compare(this.value, limitValue.value) == 0 && this.lineColor == limitValue.lineColor && this.textColor == limitValue.textColor;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getDescZh() {
        return this.descZh;
    }

    public final long getLineColor() {
        return this.lineColor;
    }

    public final long getTextColor() {
        return this.textColor;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((this.desc.hashCode() * 31) + this.descZh.hashCode()) * 31) + Float.hashCode(this.value)) * 31) + Long.hashCode(this.lineColor)) * 31) + Long.hashCode(this.textColor);
    }

    @NotNull
    public String toString() {
        return "LimitValue(desc=" + this.desc + ", descZh=" + this.descZh + ", value=" + this.value + ", lineColor=" + this.lineColor + ", textColor=" + this.textColor + ")";
    }
}
