package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ami, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/ami;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "provider", "", "b", "J", "()J", "intervalMs", "", UserInfo.SEX_FEMALE, "()F", "distanceMeter", "<init>", "(Ljava/lang/String;JF)V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class StartParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String provider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long intervalMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final float distanceMeter;

    public StartParams(@NotNull String provider, long j2, float f) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
        this.intervalMs = j2;
        this.distanceMeter = f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getDistanceMeter() {
        return this.distanceMeter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getIntervalMs() {
        return this.intervalMs;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartParams)) {
            return false;
        }
        StartParams startParams = (StartParams) other;
        return Intrinsics.areEqual(this.provider, startParams.provider) && this.intervalMs == startParams.intervalMs && Float.compare(this.distanceMeter, startParams.distanceMeter) == 0;
    }

    public int hashCode() {
        return (((this.provider.hashCode() * 31) + Long.hashCode(this.intervalMs)) * 31) + Float.hashCode(this.distanceMeter);
    }

    @NotNull
    public String toString() {
        return "StartParams(provider=" + this.provider + ", intervalMs=" + this.intervalMs + ", distanceMeter=" + this.distanceMeter + ")";
    }
}
