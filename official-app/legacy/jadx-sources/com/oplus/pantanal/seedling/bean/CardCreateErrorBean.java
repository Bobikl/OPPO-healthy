package com.oplus.pantanal.seedling.bean;

import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/CardCreateErrorBean;", "", "timestamp", "", "serviceId", "", "entranceType", "", "entranceName", "errorCode", "errorMsg", BridgeConstant.KEY_EXTRAS, "Landroid/util/ArrayMap;", "(JLjava/lang/String;ILjava/lang/String;ILjava/lang/String;Landroid/util/ArrayMap;)V", "getEntranceName", "()Ljava/lang/String;", "getEntranceType", "()I", "getErrorCode", "getErrorMsg", "getExtras", "()Landroid/util/ArrayMap;", "getServiceId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardCreateErrorBean {

    @Nullable
    private final String entranceName;
    private final int entranceType;
    private final int errorCode;

    @Nullable
    private final String errorMsg;

    @Nullable
    private final ArrayMap<String, Object> extras;

    @Nullable
    private final String serviceId;
    private final long timestamp;

    public CardCreateErrorBean(long j2, @Nullable String str, int i, @Nullable String str2, int i2, @Nullable String str3, @Nullable ArrayMap<String, Object> arrayMap) {
        this.timestamp = j2;
        this.serviceId = str;
        this.entranceType = i;
        this.entranceName = str2;
        this.errorCode = i2;
        this.errorMsg = str3;
        this.extras = arrayMap;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEntranceType() {
        return this.entranceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntranceName() {
        return this.entranceName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final ArrayMap<String, Object> component7() {
        return this.extras;
    }

    @NotNull
    public final CardCreateErrorBean copy(long timestamp, @Nullable String serviceId, int entranceType, @Nullable String entranceName, int errorCode, @Nullable String errorMsg, @Nullable ArrayMap<String, Object> extras) {
        return new CardCreateErrorBean(timestamp, serviceId, entranceType, entranceName, errorCode, errorMsg, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardCreateErrorBean)) {
            return false;
        }
        CardCreateErrorBean cardCreateErrorBean = (CardCreateErrorBean) other;
        return this.timestamp == cardCreateErrorBean.timestamp && Intrinsics.areEqual(this.serviceId, cardCreateErrorBean.serviceId) && this.entranceType == cardCreateErrorBean.entranceType && Intrinsics.areEqual(this.entranceName, cardCreateErrorBean.entranceName) && this.errorCode == cardCreateErrorBean.errorCode && Intrinsics.areEqual(this.errorMsg, cardCreateErrorBean.errorMsg) && Intrinsics.areEqual(this.extras, cardCreateErrorBean.extras);
    }

    @Nullable
    public final String getEntranceName() {
        return this.entranceName;
    }

    public final int getEntranceType() {
        return this.entranceType;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtras() {
        return this.extras;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.serviceId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.entranceType)) * 31;
        String str2 = this.entranceName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.errorCode)) * 31;
        String str3 = this.errorMsg;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayMap<String, Object> arrayMap = this.extras;
        return iHashCode4 + (arrayMap != null ? arrayMap.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardCreateErrorBean(timestamp=" + this.timestamp + ", serviceId=" + this.serviceId + ", entranceType=" + this.entranceType + ", entranceName=" + this.entranceName + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ CardCreateErrorBean(long j2, String str, int i, String str2, int i2, String str3, ArrayMap arrayMap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, i, str2, i2, str3, (i3 & 64) != 0 ? null : arrayMap);
    }
}
