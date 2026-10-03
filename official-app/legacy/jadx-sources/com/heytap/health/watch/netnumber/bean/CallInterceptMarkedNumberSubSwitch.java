package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallInterceptMarkedNumberSubSwitch;", "", "isOpen", "", "type", "", "(ZLjava/lang/String;)V", "()Z", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallInterceptMarkedNumberSubSwitch {
    private final boolean isOpen;

    @NotNull
    private final String type;

    public CallInterceptMarkedNumberSubSwitch(boolean z, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.isOpen = z;
        this.type = type;
    }

    public static /* synthetic */ CallInterceptMarkedNumberSubSwitch copy$default(CallInterceptMarkedNumberSubSwitch callInterceptMarkedNumberSubSwitch, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = callInterceptMarkedNumberSubSwitch.isOpen;
        }
        if ((i & 2) != 0) {
            str = callInterceptMarkedNumberSubSwitch.type;
        }
        return callInterceptMarkedNumberSubSwitch.copy(z, str);
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

    @NotNull
    public final CallInterceptMarkedNumberSubSwitch copy(boolean isOpen, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CallInterceptMarkedNumberSubSwitch(isOpen, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallInterceptMarkedNumberSubSwitch)) {
            return false;
        }
        CallInterceptMarkedNumberSubSwitch callInterceptMarkedNumberSubSwitch = (CallInterceptMarkedNumberSubSwitch) other;
        return this.isOpen == callInterceptMarkedNumberSubSwitch.isOpen && Intrinsics.areEqual(this.type, callInterceptMarkedNumberSubSwitch.type);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isOpen;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.type.hashCode();
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "CallInterceptMarkedNumberSubSwitch(isOpen=" + this.isOpen + ", type=" + this.type + ")";
    }
}
