package com.oplus.pantaconnect.sdk.connection;

import com.oplus.pantaconnect.sdk.Wakeup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/ConnectionOptions;", "", "connectionType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "pairAction", "Lcom/oplus/pantaconnect/sdk/connection/PairAction;", "wakeupArgs", "Lcom/oplus/pantaconnect/sdk/Wakeup;", "connectionArgs", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionArgs;", "(Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;Lcom/oplus/pantaconnect/sdk/connection/PairAction;Lcom/oplus/pantaconnect/sdk/Wakeup;Lcom/oplus/pantaconnect/sdk/connection/ConnectionArgs;)V", "getConnectionArgs", "()Lcom/oplus/pantaconnect/sdk/connection/ConnectionArgs;", "getConnectionType", "()Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "getPairAction", "()Lcom/oplus/pantaconnect/sdk/connection/PairAction;", "getWakeupArgs", "()Lcom/oplus/pantaconnect/sdk/Wakeup;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ConnectionOptions {

    @Nullable
    private final ConnectionArgs connectionArgs;

    @NotNull
    private final ConnectionType connectionType;

    @NotNull
    private final PairAction pairAction;

    @Nullable
    private final Wakeup wakeupArgs;

    @JvmOverloads
    public ConnectionOptions() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ConnectionOptions copy$default(ConnectionOptions connectionOptions, ConnectionType connectionType, PairAction pairAction, Wakeup wakeup, ConnectionArgs connectionArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionType = connectionOptions.connectionType;
        }
        if ((i & 2) != 0) {
            pairAction = connectionOptions.pairAction;
        }
        if ((i & 4) != 0) {
            wakeup = connectionOptions.wakeupArgs;
        }
        if ((i & 8) != 0) {
            connectionArgs = connectionOptions.connectionArgs;
        }
        return connectionOptions.copy(connectionType, pairAction, wakeup, connectionArgs);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConnectionType getConnectionType() {
        return this.connectionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PairAction getPairAction() {
        return this.pairAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Wakeup getWakeupArgs() {
        return this.wakeupArgs;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ConnectionArgs getConnectionArgs() {
        return this.connectionArgs;
    }

    @NotNull
    public final ConnectionOptions copy(@NotNull ConnectionType connectionType, @NotNull PairAction pairAction, @Nullable Wakeup wakeupArgs, @Nullable ConnectionArgs connectionArgs) {
        return new ConnectionOptions(connectionType, pairAction, wakeupArgs, connectionArgs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionOptions)) {
            return false;
        }
        ConnectionOptions connectionOptions = (ConnectionOptions) other;
        return this.connectionType == connectionOptions.connectionType && this.pairAction == connectionOptions.pairAction && Intrinsics.areEqual(this.wakeupArgs, connectionOptions.wakeupArgs) && Intrinsics.areEqual(this.connectionArgs, connectionOptions.connectionArgs);
    }

    @Nullable
    public final ConnectionArgs getConnectionArgs() {
        return this.connectionArgs;
    }

    @NotNull
    public final ConnectionType getConnectionType() {
        return this.connectionType;
    }

    @NotNull
    public final PairAction getPairAction() {
        return this.pairAction;
    }

    @Nullable
    public final Wakeup getWakeupArgs() {
        return this.wakeupArgs;
    }

    public int hashCode() {
        int iHashCode = (this.pairAction.hashCode() + (this.connectionType.hashCode() * 31)) * 31;
        Wakeup wakeup = this.wakeupArgs;
        int iHashCode2 = (iHashCode + (wakeup == null ? 0 : wakeup.hashCode())) * 31;
        ConnectionArgs connectionArgs = this.connectionArgs;
        return iHashCode2 + (connectionArgs != null ? connectionArgs.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConnectionOptions(connectionType=" + this.connectionType + ", pairAction=" + this.pairAction + ", wakeupArgs=" + this.wakeupArgs + ", connectionArgs=" + this.connectionArgs + ')';
    }

    @JvmOverloads
    public ConnectionOptions(@NotNull ConnectionType connectionType) {
        this(connectionType, null, null, null, 14, null);
    }

    @JvmOverloads
    public ConnectionOptions(@NotNull ConnectionType connectionType, @NotNull PairAction pairAction) {
        this(connectionType, pairAction, null, null, 12, null);
    }

    @JvmOverloads
    public ConnectionOptions(@NotNull ConnectionType connectionType, @NotNull PairAction pairAction, @Nullable Wakeup wakeup) {
        this(connectionType, pairAction, wakeup, null, 8, null);
    }

    @JvmOverloads
    public ConnectionOptions(@NotNull ConnectionType connectionType, @NotNull PairAction pairAction, @Nullable Wakeup wakeup, @Nullable ConnectionArgs connectionArgs) {
        this.connectionType = connectionType;
        this.pairAction = pairAction;
        this.wakeupArgs = wakeup;
        this.connectionArgs = connectionArgs;
    }

    public /* synthetic */ ConnectionOptions(ConnectionType connectionType, PairAction pairAction, Wakeup wakeup, ConnectionArgs connectionArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConnectionType.NONE : connectionType, (i & 2) != 0 ? PairAction.ACCEPT : pairAction, (i & 4) != 0 ? null : wakeup, (i & 8) != 0 ? null : connectionArgs);
    }
}
