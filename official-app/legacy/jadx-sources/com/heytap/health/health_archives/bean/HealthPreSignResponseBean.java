package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthPreSignResponseBean;", "", "clientFileId", "", "ocsUrl", "expireIn", "", "modifiedTimestamp", "downFileUrl", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getDownFileUrl", "setDownFileUrl", "getExpireIn", "()J", "setExpireIn", "(J)V", "getModifiedTimestamp", "setModifiedTimestamp", "getOcsUrl", "setOcsUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthPreSignResponseBean {

    @Nullable
    private String clientFileId;

    @Nullable
    private String downFileUrl;
    private long expireIn;
    private long modifiedTimestamp;

    @Nullable
    private String ocsUrl;

    public HealthPreSignResponseBean(@Nullable String str, @Nullable String str2, long j2, long j3, @Nullable String str3) {
        this.clientFileId = str;
        this.ocsUrl = str2;
        this.expireIn = j2;
        this.modifiedTimestamp = j3;
        this.downFileUrl = str3;
    }

    public static /* synthetic */ HealthPreSignResponseBean copy$default(HealthPreSignResponseBean healthPreSignResponseBean, String str, String str2, long j2, long j3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthPreSignResponseBean.clientFileId;
        }
        if ((i & 2) != 0) {
            str2 = healthPreSignResponseBean.ocsUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j2 = healthPreSignResponseBean.expireIn;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = healthPreSignResponseBean.modifiedTimestamp;
        }
        long j5 = j3;
        if ((i & 16) != 0) {
            str3 = healthPreSignResponseBean.downFileUrl;
        }
        return healthPreSignResponseBean.copy(str, str4, j4, j5, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOcsUrl() {
        return this.ocsUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getExpireIn() {
        return this.expireIn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDownFileUrl() {
        return this.downFileUrl;
    }

    @NotNull
    public final HealthPreSignResponseBean copy(@Nullable String clientFileId, @Nullable String ocsUrl, long expireIn, long modifiedTimestamp, @Nullable String downFileUrl) {
        return new HealthPreSignResponseBean(clientFileId, ocsUrl, expireIn, modifiedTimestamp, downFileUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthPreSignResponseBean)) {
            return false;
        }
        HealthPreSignResponseBean healthPreSignResponseBean = (HealthPreSignResponseBean) other;
        return Intrinsics.areEqual(this.clientFileId, healthPreSignResponseBean.clientFileId) && Intrinsics.areEqual(this.ocsUrl, healthPreSignResponseBean.ocsUrl) && this.expireIn == healthPreSignResponseBean.expireIn && this.modifiedTimestamp == healthPreSignResponseBean.modifiedTimestamp && Intrinsics.areEqual(this.downFileUrl, healthPreSignResponseBean.downFileUrl);
    }

    @Nullable
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final String getDownFileUrl() {
        return this.downFileUrl;
    }

    public final long getExpireIn() {
        return this.expireIn;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getOcsUrl() {
        return this.ocsUrl;
    }

    public int hashCode() {
        String str = this.clientFileId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ocsUrl;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.expireIn)) * 31) + Long.hashCode(this.modifiedTimestamp)) * 31;
        String str3 = this.downFileUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setClientFileId(@Nullable String str) {
        this.clientFileId = str;
    }

    public final void setDownFileUrl(@Nullable String str) {
        this.downFileUrl = str;
    }

    public final void setExpireIn(long j2) {
        this.expireIn = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOcsUrl(@Nullable String str) {
        this.ocsUrl = str;
    }

    @NotNull
    public String toString() {
        return "HealthPreSignResponseBean(clientFileId=" + this.clientFileId + ", ocsUrl=" + this.ocsUrl + ", expireIn=" + this.expireIn + ", modifiedTimestamp=" + this.modifiedTimestamp + ", downFileUrl=" + this.downFileUrl + ")";
    }

    public /* synthetic */ HealthPreSignResponseBean(String str, String str2, long j2, long j3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, str3);
    }
}
