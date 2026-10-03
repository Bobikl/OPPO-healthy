package com.oplus.mydevices.sdk.device;

import androidx.annotation.Keep;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\"H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006#"}, d2 = {"Lcom/oplus/mydevices/sdk/device/Connection;", "", ServiceNodeBundleKeys.CONNECT_STATE, "Lcom/oplus/mydevices/sdk/device/ConnectState;", "lastDisconnectTime", "", "lastConnectTime", "(Lcom/oplus/mydevices/sdk/device/ConnectState;JJ)V", "coordinationState", "Lcom/oplus/mydevices/sdk/device/CoordinationState;", "(Lcom/oplus/mydevices/sdk/device/ConnectState;JJLcom/oplus/mydevices/sdk/device/CoordinationState;)V", "getConnectState", "()Lcom/oplus/mydevices/sdk/device/ConnectState;", "getCoordinationState", "()Lcom/oplus/mydevices/sdk/device/CoordinationState;", "setCoordinationState", "(Lcom/oplus/mydevices/sdk/device/CoordinationState;)V", "getLastConnectTime", "()J", "setLastConnectTime", "(J)V", "getLastDisconnectTime", "setLastDisconnectTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Connection {

    @NotNull
    private final ConnectState connectState;

    @Nullable
    private CoordinationState coordinationState;
    private long lastConnectTime;
    private long lastDisconnectTime;

    public Connection(@NotNull ConnectState connectState, long j2, long j3, @Nullable CoordinationState coordinationState) {
        Intrinsics.checkNotNullParameter(connectState, "connectState");
        this.connectState = connectState;
        this.lastConnectTime = j2;
        this.lastDisconnectTime = j3;
        this.coordinationState = coordinationState;
    }

    public static /* synthetic */ Connection copy$default(Connection connection, ConnectState connectState, long j2, long j3, CoordinationState coordinationState, int i, Object obj) {
        if ((i & 1) != 0) {
            connectState = connection.connectState;
        }
        if ((i & 2) != 0) {
            j2 = connection.lastConnectTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = connection.lastDisconnectTime;
        }
        long j5 = j3;
        if ((i & 8) != 0) {
            coordinationState = connection.coordinationState;
        }
        return connection.copy(connectState, j4, j5, coordinationState);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConnectState getConnectState() {
        return this.connectState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastConnectTime() {
        return this.lastConnectTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastDisconnectTime() {
        return this.lastDisconnectTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CoordinationState getCoordinationState() {
        return this.coordinationState;
    }

    @NotNull
    public final Connection copy(@NotNull ConnectState connectState, long lastConnectTime, long lastDisconnectTime, @Nullable CoordinationState coordinationState) {
        Intrinsics.checkNotNullParameter(connectState, "connectState");
        return new Connection(connectState, lastConnectTime, lastDisconnectTime, coordinationState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Connection)) {
            return false;
        }
        Connection connection = (Connection) other;
        return Intrinsics.areEqual(this.connectState, connection.connectState) && this.lastConnectTime == connection.lastConnectTime && this.lastDisconnectTime == connection.lastDisconnectTime && Intrinsics.areEqual(this.coordinationState, connection.coordinationState);
    }

    @NotNull
    public final ConnectState getConnectState() {
        return this.connectState;
    }

    @Nullable
    public final CoordinationState getCoordinationState() {
        return this.coordinationState;
    }

    public final long getLastConnectTime() {
        return this.lastConnectTime;
    }

    public final long getLastDisconnectTime() {
        return this.lastDisconnectTime;
    }

    public int hashCode() {
        ConnectState connectState = this.connectState;
        int iHashCode = connectState != null ? connectState.hashCode() : 0;
        long j2 = this.lastConnectTime;
        int i = ((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.lastDisconnectTime;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        CoordinationState coordinationState = this.coordinationState;
        return i2 + (coordinationState != null ? coordinationState.hashCode() : 0);
    }

    public final void setCoordinationState(@Nullable CoordinationState coordinationState) {
        this.coordinationState = coordinationState;
    }

    public final void setLastConnectTime(long j2) {
        this.lastConnectTime = j2;
    }

    public final void setLastDisconnectTime(long j2) {
        this.lastDisconnectTime = j2;
    }

    @NotNull
    public String toString() {
        return "Connection(connectState=" + this.connectState + StringUtil.COMMA + " lastConnectTime=" + this.lastConnectTime + StringUtil.COMMA + " lastDisconnectTime=" + this.lastDisconnectTime + ") coordinationState=" + this.coordinationState + ')';
    }

    public /* synthetic */ Connection(ConnectState connectState, long j2, long j3, CoordinationState coordinationState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectState, (i & 2) != 0 ? 0L : j2, (i & 4) == 0 ? j3 : 0L, (i & 8) != 0 ? CoordinationState.DEFAULT : coordinationState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Connection(@NotNull ConnectState connectState, long j2, long j3) {
        this(connectState, j3, j2, CoordinationState.DEFAULT);
        Intrinsics.checkNotNullParameter(connectState, "connectState");
    }
}
