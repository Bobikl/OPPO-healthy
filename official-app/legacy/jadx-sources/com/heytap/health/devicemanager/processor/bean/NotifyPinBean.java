package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/NotifyPinBean;", "", "lightResUrl", "", "nightResUrl", "notifyPinModels", "", "lightResMD5", "nightResMD5", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getLightResMD5", "()Ljava/lang/String;", "getLightResUrl", "getNightResMD5", "getNightResUrl", "getNotifyPinModels", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NotifyPinBean {

    @Nullable
    private final String lightResMD5;

    @NotNull
    private final String lightResUrl;

    @Nullable
    private final String nightResMD5;

    @NotNull
    private final String nightResUrl;

    @NotNull
    private final List<String> notifyPinModels;

    public NotifyPinBean(@NotNull String lightResUrl, @NotNull String nightResUrl, @NotNull List<String> notifyPinModels, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(lightResUrl, "lightResUrl");
        Intrinsics.checkNotNullParameter(nightResUrl, "nightResUrl");
        Intrinsics.checkNotNullParameter(notifyPinModels, "notifyPinModels");
        this.lightResUrl = lightResUrl;
        this.nightResUrl = nightResUrl;
        this.notifyPinModels = notifyPinModels;
        this.lightResMD5 = str;
        this.nightResMD5 = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotifyPinBean copy$default(NotifyPinBean notifyPinBean, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notifyPinBean.lightResUrl;
        }
        if ((i & 2) != 0) {
            str2 = notifyPinBean.nightResUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = notifyPinBean.notifyPinModels;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = notifyPinBean.lightResMD5;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = notifyPinBean.nightResMD5;
        }
        return notifyPinBean.copy(str, str5, list2, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLightResUrl() {
        return this.lightResUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNightResUrl() {
        return this.nightResUrl;
    }

    @NotNull
    public final List<String> component3() {
        return this.notifyPinModels;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLightResMD5() {
        return this.lightResMD5;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNightResMD5() {
        return this.nightResMD5;
    }

    @NotNull
    public final NotifyPinBean copy(@NotNull String lightResUrl, @NotNull String nightResUrl, @NotNull List<String> notifyPinModels, @Nullable String lightResMD5, @Nullable String nightResMD5) {
        Intrinsics.checkNotNullParameter(lightResUrl, "lightResUrl");
        Intrinsics.checkNotNullParameter(nightResUrl, "nightResUrl");
        Intrinsics.checkNotNullParameter(notifyPinModels, "notifyPinModels");
        return new NotifyPinBean(lightResUrl, nightResUrl, notifyPinModels, lightResMD5, nightResMD5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyPinBean)) {
            return false;
        }
        NotifyPinBean notifyPinBean = (NotifyPinBean) other;
        return Intrinsics.areEqual(this.lightResUrl, notifyPinBean.lightResUrl) && Intrinsics.areEqual(this.nightResUrl, notifyPinBean.nightResUrl) && Intrinsics.areEqual(this.notifyPinModels, notifyPinBean.notifyPinModels) && Intrinsics.areEqual(this.lightResMD5, notifyPinBean.lightResMD5) && Intrinsics.areEqual(this.nightResMD5, notifyPinBean.nightResMD5);
    }

    @Nullable
    public final String getLightResMD5() {
        return this.lightResMD5;
    }

    @NotNull
    public final String getLightResUrl() {
        return this.lightResUrl;
    }

    @Nullable
    public final String getNightResMD5() {
        return this.nightResMD5;
    }

    @NotNull
    public final String getNightResUrl() {
        return this.nightResUrl;
    }

    @NotNull
    public final List<String> getNotifyPinModels() {
        return this.notifyPinModels;
    }

    public int hashCode() {
        int iHashCode = ((((this.lightResUrl.hashCode() * 31) + this.nightResUrl.hashCode()) * 31) + this.notifyPinModels.hashCode()) * 31;
        String str = this.lightResMD5;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nightResMD5;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotifyPinBean(lightResUrl=" + this.lightResUrl + ", nightResUrl=" + this.nightResUrl + ", notifyPinModels=" + this.notifyPinModels + ", lightResMD5=" + this.lightResMD5 + ", nightResMD5=" + this.nightResMD5 + ")";
    }
}
