package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallInterceptAttributionNumberSettings;", "", "isSupport", "", "simCardSettings", "", "Lcom/heytap/health/watch/netnumber/bean/CallInterceptAttributionNumberSimCardSwitch;", "(ZLjava/util/List;)V", "()Z", "getSimCardSettings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallInterceptAttributionNumberSettings {
    private final boolean isSupport;

    @NotNull
    private final List<CallInterceptAttributionNumberSimCardSwitch> simCardSettings;

    public CallInterceptAttributionNumberSettings(boolean z, @NotNull List<CallInterceptAttributionNumberSimCardSwitch> simCardSettings) {
        Intrinsics.checkNotNullParameter(simCardSettings, "simCardSettings");
        this.isSupport = z;
        this.simCardSettings = simCardSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallInterceptAttributionNumberSettings copy$default(CallInterceptAttributionNumberSettings callInterceptAttributionNumberSettings, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = callInterceptAttributionNumberSettings.isSupport;
        }
        if ((i & 2) != 0) {
            list = callInterceptAttributionNumberSettings.simCardSettings;
        }
        return callInterceptAttributionNumberSettings.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    public final List<CallInterceptAttributionNumberSimCardSwitch> component2() {
        return this.simCardSettings;
    }

    @NotNull
    public final CallInterceptAttributionNumberSettings copy(boolean isSupport, @NotNull List<CallInterceptAttributionNumberSimCardSwitch> simCardSettings) {
        Intrinsics.checkNotNullParameter(simCardSettings, "simCardSettings");
        return new CallInterceptAttributionNumberSettings(isSupport, simCardSettings);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallInterceptAttributionNumberSettings)) {
            return false;
        }
        CallInterceptAttributionNumberSettings callInterceptAttributionNumberSettings = (CallInterceptAttributionNumberSettings) other;
        return this.isSupport == callInterceptAttributionNumberSettings.isSupport && Intrinsics.areEqual(this.simCardSettings, callInterceptAttributionNumberSettings.simCardSettings);
    }

    @NotNull
    public final List<CallInterceptAttributionNumberSimCardSwitch> getSimCardSettings() {
        return this.simCardSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.simCardSettings.hashCode();
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "CallInterceptAttributionNumberSettings(isSupport=" + this.isSupport + ", simCardSettings=" + this.simCardSettings + ")";
    }

    public /* synthetic */ CallInterceptAttributionNumberSettings(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new ArrayList() : list);
    }
}
