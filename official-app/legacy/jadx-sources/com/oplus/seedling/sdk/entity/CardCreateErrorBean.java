package com.oplus.seedling.sdk.entity;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003JZ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006%"}, d2 = {"Lcom/oplus/seedling/sdk/entity/CardCreateErrorBean;", "", "packageName", "", "instanceId", "", "serviceId", "errorCode", "", "errorMsg", BridgeConstant.KEY_EXTRAS, "Landroid/util/ArrayMap;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Landroid/util/ArrayMap;)V", "getErrorCode", "()I", "getErrorMsg", "()Ljava/lang/String;", "getExtras", "()Landroid/util/ArrayMap;", "getInstanceId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPackageName", "getServiceId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Landroid/util/ArrayMap;)Lcom/oplus/seedling/sdk/entity/CardCreateErrorBean;", "equals", "", "other", "hashCode", "toString", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardCreateErrorBean {
    private final int errorCode;

    @NotNull
    private final String errorMsg;

    @Nullable
    private final ArrayMap<String, Object> extras;

    @Nullable
    private final Long instanceId;

    @NotNull
    private final String packageName;

    @NotNull
    private final String serviceId;

    public CardCreateErrorBean(@NotNull String packageName, @Nullable Long l2, @NotNull String serviceId, int i, @NotNull String errorMsg, @Nullable ArrayMap<String, Object> arrayMap) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.packageName = packageName;
        this.instanceId = l2;
        this.serviceId = serviceId;
        this.errorCode = i;
        this.errorMsg = errorMsg;
        this.extras = arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardCreateErrorBean copy$default(CardCreateErrorBean cardCreateErrorBean, String str, Long l2, String str2, int i, String str3, ArrayMap arrayMap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cardCreateErrorBean.packageName;
        }
        if ((i2 & 2) != 0) {
            l2 = cardCreateErrorBean.instanceId;
        }
        Long l3 = l2;
        if ((i2 & 4) != 0) {
            str2 = cardCreateErrorBean.serviceId;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = cardCreateErrorBean.errorCode;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = cardCreateErrorBean.errorMsg;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            arrayMap = cardCreateErrorBean.extras;
        }
        return cardCreateErrorBean.copy(str, l3, str4, i3, str5, arrayMap);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final ArrayMap<String, Object> component6() {
        return this.extras;
    }

    @NotNull
    public final CardCreateErrorBean copy(@NotNull String packageName, @Nullable Long instanceId, @NotNull String serviceId, int errorCode, @NotNull String errorMsg, @Nullable ArrayMap<String, Object> extras) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        return new CardCreateErrorBean(packageName, instanceId, serviceId, errorCode, errorMsg, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardCreateErrorBean)) {
            return false;
        }
        CardCreateErrorBean cardCreateErrorBean = (CardCreateErrorBean) other;
        return Intrinsics.areEqual(this.packageName, cardCreateErrorBean.packageName) && Intrinsics.areEqual(this.instanceId, cardCreateErrorBean.instanceId) && Intrinsics.areEqual(this.serviceId, cardCreateErrorBean.serviceId) && this.errorCode == cardCreateErrorBean.errorCode && Intrinsics.areEqual(this.errorMsg, cardCreateErrorBean.errorMsg) && Intrinsics.areEqual(this.extras, cardCreateErrorBean.extras);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtras() {
        return this.extras;
    }

    @Nullable
    public final Long getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        int iHashCode = this.packageName.hashCode() * 31;
        Long l2 = this.instanceId;
        int iHashCode2 = (((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.serviceId.hashCode()) * 31) + Integer.hashCode(this.errorCode)) * 31) + this.errorMsg.hashCode()) * 31;
        ArrayMap<String, Object> arrayMap = this.extras;
        return iHashCode2 + (arrayMap != null ? arrayMap.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardCreateErrorBean(packageName=" + this.packageName + ", instanceId=" + this.instanceId + ", serviceId=" + this.serviceId + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ CardCreateErrorBean(String str, Long l2, String str2, int i, String str3, ArrayMap arrayMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : l2, str2, i, str3, (i2 & 32) != 0 ? null : arrayMap);
    }
}
