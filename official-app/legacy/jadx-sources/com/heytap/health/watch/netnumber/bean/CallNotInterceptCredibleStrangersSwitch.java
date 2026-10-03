package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallNotInterceptCredibleStrangersSwitch;", "", "isOpen", "", "type", "", "slotId", "", "(ZLjava/lang/String;I)V", "()Z", "getSlotId", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallNotInterceptCredibleStrangersSwitch {
    private final boolean isOpen;
    private final int slotId;

    @NotNull
    private final String type;

    public CallNotInterceptCredibleStrangersSwitch(boolean z, @NotNull String type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.isOpen = z;
        this.type = type;
        this.slotId = i;
    }

    public static /* synthetic */ CallNotInterceptCredibleStrangersSwitch copy$default(CallNotInterceptCredibleStrangersSwitch callNotInterceptCredibleStrangersSwitch, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = callNotInterceptCredibleStrangersSwitch.isOpen;
        }
        if ((i2 & 2) != 0) {
            str = callNotInterceptCredibleStrangersSwitch.type;
        }
        if ((i2 & 4) != 0) {
            i = callNotInterceptCredibleStrangersSwitch.slotId;
        }
        return callNotInterceptCredibleStrangersSwitch.copy(z, str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSlotId() {
        return this.slotId;
    }

    @NotNull
    public final CallNotInterceptCredibleStrangersSwitch copy(boolean isOpen, @NotNull String type, int slotId) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CallNotInterceptCredibleStrangersSwitch(isOpen, type, slotId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallNotInterceptCredibleStrangersSwitch)) {
            return false;
        }
        CallNotInterceptCredibleStrangersSwitch callNotInterceptCredibleStrangersSwitch = (CallNotInterceptCredibleStrangersSwitch) other;
        return this.isOpen == callNotInterceptCredibleStrangersSwitch.isOpen && Intrinsics.areEqual(this.type, callNotInterceptCredibleStrangersSwitch.type) && this.slotId == callNotInterceptCredibleStrangersSwitch.slotId;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isOpen;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.slotId);
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "CallNotInterceptCredibleStrangersSwitch(isOpen=" + this.isOpen + ", type=" + this.type + ", slotId=" + this.slotId + ")";
    }
}
