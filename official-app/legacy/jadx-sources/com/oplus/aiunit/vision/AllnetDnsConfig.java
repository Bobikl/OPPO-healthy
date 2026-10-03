package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.v00, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/v00;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "c", "()Z", "enable", "b", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "region", "appId", "d", f04.JSON_KEY_APP_SECRET, "Lcom/oplus/aiunit/vision/w00;", "Lcom/oplus/aiunit/vision/w00;", "()Lcom/oplus/aiunit/vision/w00;", "extDnsCallback", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/w00;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AllnetDnsConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String region;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String appId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String appSecret;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final w00 extDnsCallback;

    public AllnetDnsConfig(boolean z, @NotNull String region, @NotNull String appId, @NotNull String appSecret, @Nullable w00 w00Var) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSecret, "appSecret");
        this.enable = z;
        this.region = region;
        this.appId = appId;
        this.appSecret = appSecret;
        this.extDnsCallback = w00Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppSecret() {
        return this.appSecret;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final w00 getExtDnsCallback() {
        return this.extDnsCallback;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllnetDnsConfig)) {
            return false;
        }
        AllnetDnsConfig allnetDnsConfig = (AllnetDnsConfig) other;
        return this.enable == allnetDnsConfig.enable && Intrinsics.areEqual(this.region, allnetDnsConfig.region) && Intrinsics.areEqual(this.appId, allnetDnsConfig.appId) && Intrinsics.areEqual(this.appSecret, allnetDnsConfig.appSecret) && Intrinsics.areEqual(this.extDnsCallback, allnetDnsConfig.extDnsCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.region;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.appId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appSecret;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        w00 w00Var = this.extDnsCallback;
        return iHashCode3 + (w00Var != null ? w00Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AllnetDnsConfig(enable=" + this.enable + ", region=" + this.region + ", appId=" + this.appId + ", appSecret=" + this.appSecret + ", extDnsCallback=" + this.extDnsCallback + ")";
    }

    public /* synthetic */ AllnetDnsConfig(boolean z, String str, String str2, String str3, w00 w00Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : w00Var);
    }
}
