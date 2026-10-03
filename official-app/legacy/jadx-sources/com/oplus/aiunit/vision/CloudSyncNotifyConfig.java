package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lj3, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u000e\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/lj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "id", "b", MapSchema.FIELD_NAME_ENTRY, "spKey", "c", "cloudKey", "I", "f", "()I", "titleResId", "contentResId", "Z", "()Z", "defaultState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CloudSyncNotifyConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String spKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String cloudKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int titleResId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int contentResId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean defaultState;

    public CloudSyncNotifyConfig(@NotNull String id, @NotNull String spKey, @NotNull String cloudKey, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(spKey, "spKey");
        Intrinsics.checkNotNullParameter(cloudKey, "cloudKey");
        this.id = id;
        this.spKey = spKey;
        this.cloudKey = cloudKey;
        this.titleResId = i;
        this.contentResId = i2;
        this.defaultState = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCloudKey() {
        return this.cloudKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getContentResId() {
        return this.contentResId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDefaultState() {
        return this.defaultState;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSpKey() {
        return this.spKey;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudSyncNotifyConfig)) {
            return false;
        }
        CloudSyncNotifyConfig cloudSyncNotifyConfig = (CloudSyncNotifyConfig) other;
        return Intrinsics.areEqual(this.id, cloudSyncNotifyConfig.id) && Intrinsics.areEqual(this.spKey, cloudSyncNotifyConfig.spKey) && Intrinsics.areEqual(this.cloudKey, cloudSyncNotifyConfig.cloudKey) && this.titleResId == cloudSyncNotifyConfig.titleResId && this.contentResId == cloudSyncNotifyConfig.contentResId && this.defaultState == cloudSyncNotifyConfig.defaultState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.spKey.hashCode()) * 31) + this.cloudKey.hashCode()) * 31) + Integer.hashCode(this.titleResId)) * 31) + Integer.hashCode(this.contentResId)) * 31;
        boolean z = this.defaultState;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "CloudSyncNotifyConfig(id=" + this.id + ", spKey=" + this.spKey + ", cloudKey=" + this.cloudKey + ", titleResId=" + this.titleResId + ", contentResId=" + this.contentResId + ", defaultState=" + this.defaultState + ")";
    }

    public /* synthetic */ CloudSyncNotifyConfig(String str, String str2, String str3, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, i2, (i3 & 32) != 0 ? true : z);
    }
}
