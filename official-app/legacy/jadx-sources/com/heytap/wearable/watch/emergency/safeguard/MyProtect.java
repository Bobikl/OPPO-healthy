package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/MyProtect;", "", "guardId", "", "(Ljava/lang/Long;)V", "getGuardId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/heytap/wearable/watch/emergency/safeguard/MyProtect;", "equals", "", "other", "hashCode", "", "toString", "", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MyProtect {

    @Nullable
    private final Long guardId;

    public MyProtect(@Nullable Long l2) {
        this.guardId = l2;
    }

    public static /* synthetic */ MyProtect copy$default(MyProtect myProtect, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l2 = myProtect.guardId;
        }
        return myProtect.copy(l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getGuardId() {
        return this.guardId;
    }

    @NotNull
    public final MyProtect copy(@Nullable Long guardId) {
        return new MyProtect(guardId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MyProtect) && Intrinsics.areEqual(this.guardId, ((MyProtect) other).guardId);
    }

    @Nullable
    public final Long getGuardId() {
        return this.guardId;
    }

    public int hashCode() {
        Long l2 = this.guardId;
        if (l2 == null) {
            return 0;
        }
        return l2.hashCode();
    }

    @NotNull
    public String toString() {
        return "MyProtect(guardId=" + this.guardId + ")";
    }
}
