package com.oplus.pantaconnect.sdk.connection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/PayloadRequest;", "", "id", "", "payloadType", "Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;", "payloadLength", "", "payloadName", "", "(ILcom/oplus/pantaconnect/sdk/connection/Payload$Type;JLjava/lang/String;)V", "getId", "()I", "getPayloadLength", "()J", "getPayloadName", "()Ljava/lang/String;", "getPayloadType", "()Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PayloadRequest {
    private final int id;
    private final long payloadLength;

    @NotNull
    private final String payloadName;

    @NotNull
    private final Payload.Type payloadType;

    public PayloadRequest(int i, @NotNull Payload.Type type, long j2, @NotNull String str) {
        this.id = i;
        this.payloadType = type;
        this.payloadLength = j2;
        this.payloadName = str;
    }

    public static /* synthetic */ PayloadRequest copy$default(PayloadRequest payloadRequest, int i, Payload.Type type, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = payloadRequest.id;
        }
        if ((i2 & 2) != 0) {
            type = payloadRequest.payloadType;
        }
        Payload.Type type2 = type;
        if ((i2 & 4) != 0) {
            j2 = payloadRequest.payloadLength;
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            str = payloadRequest.payloadName;
        }
        return payloadRequest.copy(i, type2, j3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Payload.Type getPayloadType() {
        return this.payloadType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPayloadLength() {
        return this.payloadLength;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayloadName() {
        return this.payloadName;
    }

    @NotNull
    public final PayloadRequest copy(int id, @NotNull Payload.Type payloadType, long payloadLength, @NotNull String payloadName) {
        return new PayloadRequest(id, payloadType, payloadLength, payloadName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayloadRequest)) {
            return false;
        }
        PayloadRequest payloadRequest = (PayloadRequest) other;
        return this.id == payloadRequest.id && this.payloadType == payloadRequest.payloadType && this.payloadLength == payloadRequest.payloadLength && Intrinsics.areEqual(this.payloadName, payloadRequest.payloadName);
    }

    public final int getId() {
        return this.id;
    }

    public final long getPayloadLength() {
        return this.payloadLength;
    }

    @NotNull
    public final String getPayloadName() {
        return this.payloadName;
    }

    @NotNull
    public final Payload.Type getPayloadType() {
        return this.payloadType;
    }

    public int hashCode() {
        return this.payloadName.hashCode() + ((Long.hashCode(this.payloadLength) + ((this.payloadType.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "PayloadRequest(id=" + this.id + ", payloadType=" + this.payloadType + ", payloadLength=" + this.payloadLength + ", payloadName=" + this.payloadName + ')';
    }
}
