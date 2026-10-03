package com.heytap.health.health.bitmap;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengineservice.db.table.DBSleepRRInterval;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÂ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jh\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0011R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/heytap/health/health/bitmap/QueryDataBean;", "", "ssoid", "", y15.PARAMS_DATA_TYPE, "", "dataName", "statType", "date", "dataList", "data", "dayNo", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getData", "()Ljava/lang/String;", "getDataList", "setDataList", "(Ljava/lang/String;)V", "getDataName", "setDataName", "getDataType", "()I", "setDataType", "(I)V", "getDate", "setDate", "getDayNo", "setDayNo", "getStatType", "()Ljava/lang/Integer;", "setStatType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/heytap/health/health/bitmap/QueryDataBean;", "equals", "", "other", "hashCode", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryDataBean {

    @SerializedName("data")
    @Nullable
    private final String data;

    @SerializedName(DBSleepRRInterval.DATA_LIST)
    @Nullable
    private String dataList;

    @SerializedName("data_name")
    @Nullable
    private String dataName;

    @SerializedName("data_type")
    private int dataType;

    @Nullable
    private String date;

    @SerializedName("dayno")
    private int dayNo;

    @NotNull
    private String ssoid;

    @SerializedName("stat_type")
    @Nullable
    private Integer statType;

    public QueryDataBean() {
        this(null, 0, null, null, null, null, null, 0, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataName() {
        return this.dataName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatType() {
        return this.statType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDataList() {
        return this.dataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDayNo() {
        return this.dayNo;
    }

    @NotNull
    public final QueryDataBean copy(@NotNull String ssoid, int dataType, @Nullable String dataName, @Nullable Integer statType, @Nullable String date, @Nullable String dataList, @Nullable String data, int dayNo) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        return new QueryDataBean(ssoid, dataType, dataName, statType, date, dataList, data, dayNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryDataBean)) {
            return false;
        }
        QueryDataBean queryDataBean = (QueryDataBean) other;
        return Intrinsics.areEqual(this.ssoid, queryDataBean.ssoid) && this.dataType == queryDataBean.dataType && Intrinsics.areEqual(this.dataName, queryDataBean.dataName) && Intrinsics.areEqual(this.statType, queryDataBean.statType) && Intrinsics.areEqual(this.date, queryDataBean.date) && Intrinsics.areEqual(this.dataList, queryDataBean.dataList) && Intrinsics.areEqual(this.data, queryDataBean.data) && this.dayNo == queryDataBean.dayNo;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getDataList() {
        return this.dataList;
    }

    @Nullable
    public final String getDataName() {
        return this.dataName;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    public final int getDayNo() {
        return this.dayNo;
    }

    @Nullable
    public final Integer getStatType() {
        return this.statType;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + Integer.hashCode(this.dataType)) * 31;
        String str = this.dataName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.date;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dataList;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.data;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.dayNo);
    }

    public final void setDataList(@Nullable String str) {
        this.dataList = str;
    }

    public final void setDataName(@Nullable String str) {
        this.dataName = str;
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setDayNo(int i) {
        this.dayNo = i;
    }

    public final void setStatType(@Nullable Integer num) {
        this.statType = num;
    }

    @NotNull
    public String toString() {
        return "QueryDataBean(ssoid=" + this.ssoid + ", dataType=" + this.dataType + ", dataName=" + this.dataName + ", statType=" + this.statType + ", date=" + this.date + ", dataList=" + this.dataList + ", data=" + this.data + ", dayNo=" + this.dayNo + ")";
    }

    public QueryDataBean(@NotNull String ssoid, int i, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.dataType = i;
        this.dataName = str;
        this.statType = num;
        this.date = str2;
        this.dataList = str3;
        this.data = str4;
        this.dayNo = i2;
    }

    public /* synthetic */ QueryDataBean(String str, int i, String str2, Integer num, String str3, String str4, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) == 0 ? str5 : null, (i3 & 128) == 0 ? i2 : 0);
    }
}
