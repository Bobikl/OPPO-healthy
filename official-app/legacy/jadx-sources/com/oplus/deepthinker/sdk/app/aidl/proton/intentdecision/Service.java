package com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JW\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/Service;", "", "intentId", "", "serviceId", "serviceName", "serviceType", "serviceScore", "", "serviceChannel", "", "traceId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIJ)V", "getIntentId", "()Ljava/lang/String;", "getServiceChannel", "()I", "getServiceId", "getServiceName", "getServiceScore", "()D", "getServiceType", "getTraceId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Service {

    @SerializedName("intent_id")
    @Nullable
    private final String intentId;

    @SerializedName("service_channel")
    private final int serviceChannel;

    @SerializedName("service_id")
    @Nullable
    private final String serviceId;

    @SerializedName("service_name")
    @Nullable
    private final String serviceName;

    @SerializedName("service_score")
    private final double serviceScore;

    @SerializedName("service_type")
    @Nullable
    private final String serviceType;

    @SerializedName("trace_id")
    private final long traceId;

    public Service() {
        this(null, null, null, null, 0.0d, 0, 0L, 127, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntentId() {
        return this.intentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getServiceType() {
        return this.serviceType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getServiceScore() {
        return this.serviceScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getServiceChannel() {
        return this.serviceChannel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTraceId() {
        return this.traceId;
    }

    @NotNull
    public final Service copy(@Nullable String intentId, @Nullable String serviceId, @Nullable String serviceName, @Nullable String serviceType, double serviceScore, int serviceChannel, long traceId) {
        return new Service(intentId, serviceId, serviceName, serviceType, serviceScore, serviceChannel, traceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Service)) {
            return false;
        }
        Service service = (Service) other;
        return Intrinsics.areEqual(this.intentId, service.intentId) && Intrinsics.areEqual(this.serviceId, service.serviceId) && Intrinsics.areEqual(this.serviceName, service.serviceName) && Intrinsics.areEqual(this.serviceType, service.serviceType) && Intrinsics.areEqual((Object) Double.valueOf(this.serviceScore), (Object) Double.valueOf(service.serviceScore)) && this.serviceChannel == service.serviceChannel && this.traceId == service.traceId;
    }

    @Nullable
    public final String getIntentId() {
        return this.intentId;
    }

    public final int getServiceChannel() {
        return this.serviceChannel;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    @Nullable
    public final String getServiceName() {
        return this.serviceName;
    }

    public final double getServiceScore() {
        return this.serviceScore;
    }

    @Nullable
    public final String getServiceType() {
        return this.serviceType;
    }

    public final long getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        String str = this.intentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serviceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceType;
        return ((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Double.hashCode(this.serviceScore)) * 31) + Integer.hashCode(this.serviceChannel)) * 31) + Long.hashCode(this.traceId);
    }

    @NotNull
    public String toString() {
        return "Service(intentId=" + ((Object) this.intentId) + ", serviceId=" + ((Object) this.serviceId) + ", serviceName=" + ((Object) this.serviceName) + ", serviceType=" + ((Object) this.serviceType) + ", serviceScore=" + this.serviceScore + ", serviceChannel=" + this.serviceChannel + ", traceId=" + this.traceId + ')';
    }

    public Service(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, double d, int i, long j2) {
        this.intentId = str;
        this.serviceId = str2;
        this.serviceName = str3;
        this.serviceType = str4;
        this.serviceScore = d;
        this.serviceChannel = i;
        this.traceId = j2;
    }

    public /* synthetic */ Service(String str, String str2, String str3, String str4, double d, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? -1 : i, (i2 & 64) != 0 ? 0L : j2);
    }
}
