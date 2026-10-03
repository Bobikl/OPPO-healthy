package com.heytap.store.business.component.utils;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003Jm\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\u0013\u00100\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u00065"}, d2 = {"Lcom/heytap/store/business/component/utils/LoadPageStatusData;", "", SensorsBean.PAGE_NAME, "", "startTime", "", "netWorkLoadEndTime", "netWorkLoadStartTime", "isCacheLoad", "", "isOnLineDate", "isLoadComplete", "isReport", "apiUrl", "isNetWorkSuccess", "(Ljava/lang/String;JJJZZZZLjava/lang/String;Z)V", "getApiUrl", "()Ljava/lang/String;", "setApiUrl", "(Ljava/lang/String;)V", "()Z", "setCacheLoad", "(Z)V", "setLoadComplete", "setNetWorkSuccess", "setOnLineDate", "setReport", "getNetWorkLoadEndTime", "()J", "setNetWorkLoadEndTime", "(J)V", "getNetWorkLoadStartTime", "setNetWorkLoadStartTime", "getPage_name", "setPage_name", "getStartTime", "setStartTime", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LoadPageStatusData {

    @NotNull
    private String apiUrl;
    private boolean isCacheLoad;
    private boolean isLoadComplete;
    private boolean isNetWorkSuccess;
    private boolean isOnLineDate;
    private boolean isReport;
    private long netWorkLoadEndTime;
    private long netWorkLoadStartTime;

    @NotNull
    private String page_name;
    private long startTime;

    public LoadPageStatusData() {
        this(null, 0L, 0L, 0L, false, false, false, false, null, false, 1023, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPage_name() {
        return this.page_name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsNetWorkSuccess() {
        return this.isNetWorkSuccess;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getNetWorkLoadEndTime() {
        return this.netWorkLoadEndTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getNetWorkLoadStartTime() {
        return this.netWorkLoadStartTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsCacheLoad() {
        return this.isCacheLoad;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsOnLineDate() {
        return this.isOnLineDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLoadComplete() {
        return this.isLoadComplete;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsReport() {
        return this.isReport;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getApiUrl() {
        return this.apiUrl;
    }

    @NotNull
    public final LoadPageStatusData copy(@NotNull String page_name, long startTime, long netWorkLoadEndTime, long netWorkLoadStartTime, boolean isCacheLoad, boolean isOnLineDate, boolean isLoadComplete, boolean isReport, @NotNull String apiUrl, boolean isNetWorkSuccess) {
        Intrinsics.checkNotNullParameter(page_name, "page_name");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        return new LoadPageStatusData(page_name, startTime, netWorkLoadEndTime, netWorkLoadStartTime, isCacheLoad, isOnLineDate, isLoadComplete, isReport, apiUrl, isNetWorkSuccess);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadPageStatusData)) {
            return false;
        }
        LoadPageStatusData loadPageStatusData = (LoadPageStatusData) other;
        return Intrinsics.areEqual(this.page_name, loadPageStatusData.page_name) && this.startTime == loadPageStatusData.startTime && this.netWorkLoadEndTime == loadPageStatusData.netWorkLoadEndTime && this.netWorkLoadStartTime == loadPageStatusData.netWorkLoadStartTime && this.isCacheLoad == loadPageStatusData.isCacheLoad && this.isOnLineDate == loadPageStatusData.isOnLineDate && this.isLoadComplete == loadPageStatusData.isLoadComplete && this.isReport == loadPageStatusData.isReport && Intrinsics.areEqual(this.apiUrl, loadPageStatusData.apiUrl) && this.isNetWorkSuccess == loadPageStatusData.isNetWorkSuccess;
    }

    @NotNull
    public final String getApiUrl() {
        return this.apiUrl;
    }

    public final long getNetWorkLoadEndTime() {
        return this.netWorkLoadEndTime;
    }

    public final long getNetWorkLoadStartTime() {
        return this.netWorkLoadStartTime;
    }

    @NotNull
    public final String getPage_name() {
        return this.page_name;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((this.page_name.hashCode() * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.netWorkLoadEndTime)) * 31) + Long.hashCode(this.netWorkLoadStartTime)) * 31;
        boolean z = this.isCacheLoad;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isOnLineDate;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isLoadComplete;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.isReport;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int iHashCode2 = (((i3 + r4) * 31) + this.apiUrl.hashCode()) * 31;
        boolean z5 = this.isNetWorkSuccess;
        return iHashCode2 + (z5 ? 1 : z5);
    }

    public final boolean isCacheLoad() {
        return this.isCacheLoad;
    }

    public final boolean isLoadComplete() {
        return this.isLoadComplete;
    }

    public final boolean isNetWorkSuccess() {
        return this.isNetWorkSuccess;
    }

    public final boolean isOnLineDate() {
        return this.isOnLineDate;
    }

    public final boolean isReport() {
        return this.isReport;
    }

    public final void setApiUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apiUrl = str;
    }

    public final void setCacheLoad(boolean z) {
        this.isCacheLoad = z;
    }

    public final void setLoadComplete(boolean z) {
        this.isLoadComplete = z;
    }

    public final void setNetWorkLoadEndTime(long j2) {
        this.netWorkLoadEndTime = j2;
    }

    public final void setNetWorkLoadStartTime(long j2) {
        this.netWorkLoadStartTime = j2;
    }

    public final void setNetWorkSuccess(boolean z) {
        this.isNetWorkSuccess = z;
    }

    public final void setOnLineDate(boolean z) {
        this.isOnLineDate = z;
    }

    public final void setPage_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.page_name = str;
    }

    public final void setReport(boolean z) {
        this.isReport = z;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    @NotNull
    public String toString() {
        return "LoadPageStatusData(page_name=" + this.page_name + ", startTime=" + this.startTime + ", netWorkLoadEndTime=" + this.netWorkLoadEndTime + ", netWorkLoadStartTime=" + this.netWorkLoadStartTime + ", isCacheLoad=" + this.isCacheLoad + ", isOnLineDate=" + this.isOnLineDate + ", isLoadComplete=" + this.isLoadComplete + ", isReport=" + this.isReport + ", apiUrl=" + this.apiUrl + ", isNetWorkSuccess=" + this.isNetWorkSuccess + ')';
    }

    public LoadPageStatusData(@NotNull String page_name, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, @NotNull String apiUrl, boolean z5) {
        Intrinsics.checkNotNullParameter(page_name, "page_name");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        this.page_name = page_name;
        this.startTime = j2;
        this.netWorkLoadEndTime = j3;
        this.netWorkLoadStartTime = j4;
        this.isCacheLoad = z;
        this.isOnLineDate = z2;
        this.isLoadComplete = z3;
        this.isReport = z4;
        this.apiUrl = apiUrl;
        this.isNetWorkSuccess = z5;
    }

    public /* synthetic */ LoadPageStatusData(String str, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) == 0 ? j4 : 0L, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) == 0 ? str2 : "", (i & 512) == 0 ? z5 : false);
    }
}
