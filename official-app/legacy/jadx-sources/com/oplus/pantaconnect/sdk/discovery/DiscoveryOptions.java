package com.oplus.pantaconnect.sdk.discovery;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.pantaconnect.sdk.Wakeup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryOptions;", "", Fields.SP_STRATEGY_FIELD, "Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "wakeup", "Lcom/oplus/pantaconnect/sdk/Wakeup;", "(Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;Lcom/oplus/pantaconnect/sdk/Wakeup;)V", "extensionType", "", "getExtensionType", "()Ljava/lang/String;", "setExtensionType", "(Ljava/lang/String;)V", "getStrategy", "()Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "getWakeup", "()Lcom/oplus/pantaconnect/sdk/Wakeup;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DiscoveryOptions {

    @NotNull
    private String extensionType;

    @NotNull
    private final DiscoveryStrategy strategy;

    @Nullable
    private final Wakeup wakeup;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoveryOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DiscoveryOptions copy$default(DiscoveryOptions discoveryOptions, DiscoveryStrategy discoveryStrategy, Wakeup wakeup, int i, Object obj) {
        if ((i & 1) != 0) {
            discoveryStrategy = discoveryOptions.strategy;
        }
        if ((i & 2) != 0) {
            wakeup = discoveryOptions.wakeup;
        }
        return discoveryOptions.copy(discoveryStrategy, wakeup);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DiscoveryStrategy getStrategy() {
        return this.strategy;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    @NotNull
    public final DiscoveryOptions copy(@NotNull DiscoveryStrategy strategy, @Nullable Wakeup wakeup) {
        return new DiscoveryOptions(strategy, wakeup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoveryOptions)) {
            return false;
        }
        DiscoveryOptions discoveryOptions = (DiscoveryOptions) other;
        return this.strategy == discoveryOptions.strategy && Intrinsics.areEqual(this.wakeup, discoveryOptions.wakeup);
    }

    @NotNull
    public final String getExtensionType() {
        return this.extensionType;
    }

    @NotNull
    public final DiscoveryStrategy getStrategy() {
        return this.strategy;
    }

    @Nullable
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    public int hashCode() {
        int iHashCode = this.strategy.hashCode() * 31;
        Wakeup wakeup = this.wakeup;
        return iHashCode + (wakeup == null ? 0 : wakeup.hashCode());
    }

    public final void setExtensionType(@NotNull String str) {
        this.extensionType = str;
    }

    @NotNull
    public String toString() {
        return "DiscoveryOptions(strategy=" + this.strategy + ", wakeup=" + this.wakeup + ')';
    }

    public DiscoveryOptions(@NotNull DiscoveryStrategy discoveryStrategy, @Nullable Wakeup wakeup) {
        this.strategy = discoveryStrategy;
        this.wakeup = wakeup;
        this.extensionType = "";
    }

    public /* synthetic */ DiscoveryOptions(DiscoveryStrategy discoveryStrategy, Wakeup wakeup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DiscoveryStrategy.BASED_CONNECT : discoveryStrategy, (i & 2) != 0 ? null : wakeup);
    }
}
