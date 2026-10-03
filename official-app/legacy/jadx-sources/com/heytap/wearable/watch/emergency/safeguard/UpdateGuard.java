package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/UpdateGuard;", "", "id", "", "remark", "", "type", "", "(JLjava/lang/String;I)V", "getId", "()J", "getRemark", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UpdateGuard {
    private final long id;

    @NotNull
    private final String remark;
    private final int type;

    public UpdateGuard(long j2, @NotNull String remark, int i) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.id = j2;
        this.remark = remark;
        this.type = i;
    }

    public static /* synthetic */ UpdateGuard copy$default(UpdateGuard updateGuard, long j2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = updateGuard.id;
        }
        if ((i2 & 2) != 0) {
            str = updateGuard.remark;
        }
        if ((i2 & 4) != 0) {
            i = updateGuard.type;
        }
        return updateGuard.copy(j2, str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final UpdateGuard copy(long id, @NotNull String remark, int type) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new UpdateGuard(id, remark, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateGuard)) {
            return false;
        }
        UpdateGuard updateGuard = (UpdateGuard) other;
        return this.id == updateGuard.id && Intrinsics.areEqual(this.remark, updateGuard.remark) && this.type == updateGuard.type;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.remark.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    @NotNull
    public String toString() {
        return "UpdateGuard(id=" + this.id + ", remark=" + this.remark + ", type=" + this.type + ")";
    }

    public /* synthetic */ UpdateGuard(long j2, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, (i2 & 4) != 0 ? 0 : i);
    }
}
