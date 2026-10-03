package com.oplus.aiunit.vision;

import com.oplus.seedling.sdk.seedling.NewSeedlingCardOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.decision.ServiceInfo;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/rug;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lpantanal/decision/ServiceInfo;", "a", "Lpantanal/decision/ServiceInfo;", "()Lpantanal/decision/ServiceInfo;", "service", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "serviceId", "c", "serviceInstanceId", "", "d", "J", "getTimeSnap", "()J", "timeSnap", "<init>", "(Lpantanal/decision/ServiceInfo;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class rug {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ServiceInfo service;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String serviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serviceInstanceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long timeSnap;

    public rug(@NotNull ServiceInfo service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.serviceId = service.getServiceId();
        this.serviceInstanceId = service.getServiceInstanceId();
        this.timeSnap = service.getTimeStamp();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ServiceInfo getService() {
        return this.service;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(rug.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watch.notification.impl.fluid.ServiceInfoWrap");
        rug rugVar = (rug) other;
        return Intrinsics.areEqual(this.serviceId, rugVar.serviceId) && Intrinsics.areEqual(this.serviceInstanceId, rugVar.serviceInstanceId) && this.timeSnap == rugVar.timeSnap;
    }

    public int hashCode() {
        return (((this.serviceId.hashCode() * 31) + this.serviceInstanceId.hashCode()) * 31) + Long.hashCode(this.timeSnap);
    }

    @NotNull
    public String toString() {
        String str = this.serviceId;
        String str2 = this.serviceInstanceId;
        long j2 = this.timeSnap;
        NewSeedlingCardOptions newSeedlingCardOptions = this.service.getNewSeedlingCardOptions();
        return "SW:('sid=" + str + "', insId=" + str2 + ", snap=" + j2 + ", pkg=" + (newSeedlingCardOptions != null ? newSeedlingCardOptions.getDataSourcePkgName() : null) + ")";
    }
}
