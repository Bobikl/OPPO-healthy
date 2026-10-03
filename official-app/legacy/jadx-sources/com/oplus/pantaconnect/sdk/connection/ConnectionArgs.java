package com.oplus.pantaconnect.sdk.connection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/ConnectionArgs;", "", "argsType", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionArgsType;", "argsMessage", "", "(Lcom/oplus/pantaconnect/sdk/connection/ConnectionArgsType;Ljava/lang/String;)V", "getArgsMessage", "()Ljava/lang/String;", "getArgsType", "()Lcom/oplus/pantaconnect/sdk/connection/ConnectionArgsType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ConnectionArgs {

    @NotNull
    private final String argsMessage;

    @NotNull
    private final ConnectionArgsType argsType;

    @JvmOverloads
    public ConnectionArgs(@NotNull ConnectionArgsType connectionArgsType, @NotNull String str) {
        this.argsType = connectionArgsType;
        this.argsMessage = str;
    }

    public static /* synthetic */ ConnectionArgs copy$default(ConnectionArgs connectionArgs, ConnectionArgsType connectionArgsType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionArgsType = connectionArgs.argsType;
        }
        if ((i & 2) != 0) {
            str = connectionArgs.argsMessage;
        }
        return connectionArgs.copy(connectionArgsType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConnectionArgsType getArgsType() {
        return this.argsType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getArgsMessage() {
        return this.argsMessage;
    }

    @NotNull
    public final ConnectionArgs copy(@NotNull ConnectionArgsType argsType, @NotNull String argsMessage) {
        return new ConnectionArgs(argsType, argsMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionArgs)) {
            return false;
        }
        ConnectionArgs connectionArgs = (ConnectionArgs) other;
        return this.argsType == connectionArgs.argsType && Intrinsics.areEqual(this.argsMessage, connectionArgs.argsMessage);
    }

    @NotNull
    public final String getArgsMessage() {
        return this.argsMessage;
    }

    @NotNull
    public final ConnectionArgsType getArgsType() {
        return this.argsType;
    }

    public int hashCode() {
        return this.argsMessage.hashCode() + (this.argsType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ConnectionArgs(argsType=" + this.argsType + ", argsMessage=" + this.argsMessage + ')';
    }
}
