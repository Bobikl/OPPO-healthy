package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l5f, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/l5f;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getServiceId", "()Ljava/lang/String;", "serviceId", "", "b", "Ljava/lang/Long;", "getVersion", "()Ljava/lang/Long;", "version", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class QueryEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String serviceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Long version;

    public QueryEntity(@NotNull String serviceId, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        this.serviceId = serviceId;
        this.version = l2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryEntity)) {
            return false;
        }
        QueryEntity queryEntity = (QueryEntity) other;
        return Intrinsics.areEqual(this.serviceId, queryEntity.serviceId) && Intrinsics.areEqual(this.version, queryEntity.version);
    }

    public int hashCode() {
        int iHashCode = this.serviceId.hashCode() * 31;
        Long l2 = this.version;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    @NotNull
    public String toString() {
        return "QueryEntity(serviceId=" + this.serviceId + ", version=" + this.version + ')';
    }
}
