package com.oplus.drs.track;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/oplus/drs/track/StdId;", "", "duid", "", "ouid", "(Ljava/lang/String;Ljava/lang/String;)V", "getDuid", "()Ljava/lang/String;", "getOuid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "obus-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class StdId {

    @Nullable
    private final String duid;

    @Nullable
    private final String ouid;

    public StdId(@Nullable String str, @Nullable String str2) {
        this.duid = str;
        this.ouid = str2;
    }

    public static /* synthetic */ StdId copy$default(StdId stdId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stdId.duid;
        }
        if ((i & 2) != 0) {
            str2 = stdId.ouid;
        }
        return stdId.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuid() {
        return this.duid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOuid() {
        return this.ouid;
    }

    @NotNull
    public final StdId copy(@Nullable String duid, @Nullable String ouid) {
        return new StdId(duid, ouid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StdId)) {
            return false;
        }
        StdId stdId = (StdId) other;
        return Intrinsics.areEqual(this.duid, stdId.duid) && Intrinsics.areEqual(this.ouid, stdId.ouid);
    }

    @Nullable
    public final String getDuid() {
        return this.duid;
    }

    @Nullable
    public final String getOuid() {
        return this.ouid;
    }

    public int hashCode() {
        String str = this.duid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ouid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StdId(duid=" + this.duid + ", ouid=" + this.ouid + ')';
    }
}
