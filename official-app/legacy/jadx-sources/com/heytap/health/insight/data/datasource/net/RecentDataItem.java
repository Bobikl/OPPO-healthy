package com.heytap.health.insight.data.datasource.net;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugar;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000f¨\u0006%"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/RecentDataItem;", "", y15.PARAMS_DATA_TYPE, "", "type", LogSenderConst.SUBTYPE, "code", "", "content", DBBloodSugar.TREND, "color", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "getDataType", "()I", "getSubType", "getTrend", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/insight/data/datasource/net/RecentDataItem;", "equals", "", "other", "hashCode", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RecentDataItem {
    public static final int $stable = 0;

    @Nullable
    private final String code;

    @Nullable
    private final Integer color;

    @Nullable
    private final String content;
    private final int dataType;

    @Nullable
    private final Integer subType;

    @Nullable
    private final Integer trend;

    @Nullable
    private final Integer type;

    public RecentDataItem(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4) {
        this.dataType = i;
        this.type = num;
        this.subType = num2;
        this.code = str;
        this.content = str2;
        this.trend = num3;
        this.color = num4;
    }

    public static /* synthetic */ RecentDataItem copy$default(RecentDataItem recentDataItem, int i, Integer num, Integer num2, String str, String str2, Integer num3, Integer num4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recentDataItem.dataType;
        }
        if ((i2 & 2) != 0) {
            num = recentDataItem.type;
        }
        Integer num5 = num;
        if ((i2 & 4) != 0) {
            num2 = recentDataItem.subType;
        }
        Integer num6 = num2;
        if ((i2 & 8) != 0) {
            str = recentDataItem.code;
        }
        String str3 = str;
        if ((i2 & 16) != 0) {
            str2 = recentDataItem.content;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            num3 = recentDataItem.trend;
        }
        Integer num7 = num3;
        if ((i2 & 64) != 0) {
            num4 = recentDataItem.color;
        }
        return recentDataItem.copy(i, num5, num6, str3, str4, num7, num4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTrend() {
        return this.trend;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @NotNull
    public final RecentDataItem copy(int dataType, @Nullable Integer type, @Nullable Integer subType, @Nullable String code, @Nullable String content, @Nullable Integer trend, @Nullable Integer color) {
        return new RecentDataItem(dataType, type, subType, code, content, trend, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentDataItem)) {
            return false;
        }
        RecentDataItem recentDataItem = (RecentDataItem) other;
        return this.dataType == recentDataItem.dataType && Intrinsics.areEqual(this.type, recentDataItem.type) && Intrinsics.areEqual(this.subType, recentDataItem.subType) && Intrinsics.areEqual(this.code, recentDataItem.code) && Intrinsics.areEqual(this.content, recentDataItem.content) && Intrinsics.areEqual(this.trend, recentDataItem.trend) && Intrinsics.areEqual(this.color, recentDataItem.color);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    public final Integer getSubType() {
        return this.subType;
    }

    @Nullable
    public final Integer getTrend() {
        return this.trend;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.dataType) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.code;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.trend;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.color;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecentDataItem(dataType=" + this.dataType + ", type=" + this.type + ", subType=" + this.subType + ", code=" + this.code + ", content=" + this.content + ", trend=" + this.trend + ", color=" + this.color + ")";
    }
}
