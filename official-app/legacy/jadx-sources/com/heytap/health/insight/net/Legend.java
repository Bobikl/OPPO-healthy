package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/health/insight/net/Legend;", "", "color", "", DBHealthReviewPlan.DESC, "", "descZh", "type", "", ParserTag.TAG_COLORS, "", "(JLjava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getColor", "()J", "getColors", "()Ljava/util/List;", "getDesc", "()Ljava/lang/String;", "getDescZh", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Legend {
    private final long color;

    @Nullable
    private final List<Long> colors;

    @NotNull
    private final String desc;

    @NotNull
    private final String descZh;
    private final int type;

    public Legend(long j2, @NotNull String desc, @NotNull String descZh, int i, @Nullable List<Long> list) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        this.color = j2;
        this.desc = desc;
        this.descZh = descZh;
        this.type = i;
        this.colors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Legend copy$default(Legend legend, long j2, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = legend.color;
        }
        long j3 = j2;
        if ((i2 & 2) != 0) {
            str = legend.desc;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = legend.descZh;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = legend.type;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = legend.colors;
        }
        return legend.copy(j3, str3, str4, i3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescZh() {
        return this.descZh;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<Long> component5() {
        return this.colors;
    }

    @NotNull
    public final Legend copy(long color, @NotNull String desc, @NotNull String descZh, int type, @Nullable List<Long> colors) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        return new Legend(color, desc, descZh, type, colors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Legend)) {
            return false;
        }
        Legend legend = (Legend) other;
        return this.color == legend.color && Intrinsics.areEqual(this.desc, legend.desc) && Intrinsics.areEqual(this.descZh, legend.descZh) && this.type == legend.type && Intrinsics.areEqual(this.colors, legend.colors);
    }

    public final long getColor() {
        return this.color;
    }

    @Nullable
    public final List<Long> getColors() {
        return this.colors;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getDescZh() {
        return this.descZh;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.color) * 31) + this.desc.hashCode()) * 31) + this.descZh.hashCode()) * 31) + Integer.hashCode(this.type)) * 31;
        List<Long> list = this.colors;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "Legend(color=" + this.color + ", desc=" + this.desc + ", descZh=" + this.descZh + ", type=" + this.type + ", colors=" + this.colors + ")";
    }
}
