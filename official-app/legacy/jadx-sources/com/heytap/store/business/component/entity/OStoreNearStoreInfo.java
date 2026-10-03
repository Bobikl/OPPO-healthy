package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J{\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u001d\"\u0004\b \u0010\u001fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006;"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreNearStoreInfo;", "", "isGetPermission", "", "isGetStoreMsg", "picUrl", "", "storeName", Feedback.WIDGET_LABEL, "", "startTime", "endTime", "businessShowContent", "distance", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "getBusinessShowContent", "()Ljava/lang/String;", "setBusinessShowContent", "(Ljava/lang/String;)V", "getDistance", "setDistance", "getEndTime", "setEndTime", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "()Z", "setGetPermission", "(Z)V", "setGetStoreMsg", "getLabel", "()Ljava/util/List;", "setLabel", "(Ljava/util/List;)V", "getPicUrl", "setPicUrl", "getStartTime", "setStartTime", "getStoreName", "setStoreName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreNearStoreInfo {

    @Nullable
    private String businessShowContent;

    @NotNull
    private String distance;

    @NotNull
    private String endTime;

    @Nullable
    private OStoreHeaderInfo headerInfo;
    private boolean isGetPermission;
    private boolean isGetStoreMsg;

    @Nullable
    private List<String> label;

    @Nullable
    private String picUrl;

    @NotNull
    private String startTime;

    @NotNull
    private String storeName;

    public OStoreNearStoreInfo() {
        this(false, false, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsGetPermission() {
        return this.isGetPermission;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsGetStoreMsg() {
        return this.isGetStoreMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    public final List<String> component5() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBusinessShowContent() {
        return this.businessShowContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @NotNull
    public final OStoreNearStoreInfo copy(boolean isGetPermission, boolean isGetStoreMsg, @Nullable String picUrl, @NotNull String storeName, @Nullable List<String> label, @NotNull String startTime, @NotNull String endTime, @Nullable String businessShowContent, @NotNull String distance, @Nullable OStoreHeaderInfo headerInfo) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(distance, "distance");
        return new OStoreNearStoreInfo(isGetPermission, isGetStoreMsg, picUrl, storeName, label, startTime, endTime, businessShowContent, distance, headerInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreNearStoreInfo)) {
            return false;
        }
        OStoreNearStoreInfo oStoreNearStoreInfo = (OStoreNearStoreInfo) other;
        return this.isGetPermission == oStoreNearStoreInfo.isGetPermission && this.isGetStoreMsg == oStoreNearStoreInfo.isGetStoreMsg && Intrinsics.areEqual(this.picUrl, oStoreNearStoreInfo.picUrl) && Intrinsics.areEqual(this.storeName, oStoreNearStoreInfo.storeName) && Intrinsics.areEqual(this.label, oStoreNearStoreInfo.label) && Intrinsics.areEqual(this.startTime, oStoreNearStoreInfo.startTime) && Intrinsics.areEqual(this.endTime, oStoreNearStoreInfo.endTime) && Intrinsics.areEqual(this.businessShowContent, oStoreNearStoreInfo.businessShowContent) && Intrinsics.areEqual(this.distance, oStoreNearStoreInfo.distance) && Intrinsics.areEqual(this.headerInfo, oStoreNearStoreInfo.headerInfo);
    }

    @Nullable
    public final String getBusinessShowContent() {
        return this.businessShowContent;
    }

    @NotNull
    public final String getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @Nullable
    public final List<String> getLabel() {
        return this.label;
    }

    @Nullable
    public final String getPicUrl() {
        return this.picUrl;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    public int hashCode() {
        boolean z = this.isGetPermission;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isGetStoreMsg;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        String str = this.picUrl;
        int iHashCode = (((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.storeName.hashCode()) * 31;
        List<String> list = this.label;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31;
        String str2 = this.businessShowContent;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.distance.hashCode()) * 31;
        OStoreHeaderInfo oStoreHeaderInfo = this.headerInfo;
        return iHashCode3 + (oStoreHeaderInfo != null ? oStoreHeaderInfo.hashCode() : 0);
    }

    public final boolean isGetPermission() {
        return this.isGetPermission;
    }

    public final boolean isGetStoreMsg() {
        return this.isGetStoreMsg;
    }

    public final void setBusinessShowContent(@Nullable String str) {
        this.businessShowContent = str;
    }

    public final void setDistance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.distance = str;
    }

    public final void setEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endTime = str;
    }

    public final void setGetPermission(boolean z) {
        this.isGetPermission = z;
    }

    public final void setGetStoreMsg(boolean z) {
        this.isGetStoreMsg = z;
    }

    public final void setHeaderInfo(@Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
    }

    public final void setLabel(@Nullable List<String> list) {
        this.label = list;
    }

    public final void setPicUrl(@Nullable String str) {
        this.picUrl = str;
    }

    public final void setStartTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startTime = str;
    }

    public final void setStoreName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.storeName = str;
    }

    @NotNull
    public String toString() {
        return "OStoreNearStoreInfo(isGetPermission=" + this.isGetPermission + ", isGetStoreMsg=" + this.isGetStoreMsg + ", picUrl=" + ((Object) this.picUrl) + ", storeName=" + this.storeName + ", label=" + this.label + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", businessShowContent=" + ((Object) this.businessShowContent) + ", distance=" + this.distance + ", headerInfo=" + this.headerInfo + ')';
    }

    public OStoreNearStoreInfo(boolean z, boolean z2, @Nullable String str, @NotNull String storeName, @Nullable List<String> list, @NotNull String startTime, @NotNull String endTime, @Nullable String str2, @NotNull String distance, @Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(distance, "distance");
        this.isGetPermission = z;
        this.isGetStoreMsg = z2;
        this.picUrl = str;
        this.storeName = storeName;
        this.label = list;
        this.startTime = startTime;
        this.endTime = endTime;
        this.businessShowContent = str2;
        this.distance = distance;
        this.headerInfo = oStoreHeaderInfo;
    }

    public /* synthetic */ OStoreNearStoreInfo(boolean z, boolean z2, String str, String str2, List list, String str3, String str4, String str5, String str6, OStoreHeaderInfo oStoreHeaderInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : oStoreHeaderInfo);
    }
}
