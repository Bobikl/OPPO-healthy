package com.oplus.pantaconnect.sdk.connection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006%"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/PayloadTransferUpdate;", "", "id", "", "payloadType", "Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;", "transferredLength", "", "totalLength", "errorCode", "status", "Lcom/oplus/pantaconnect/sdk/connection/PayloadTransferUpdate$Status;", "(ILcom/oplus/pantaconnect/sdk/connection/Payload$Type;JJILcom/oplus/pantaconnect/sdk/connection/PayloadTransferUpdate$Status;)V", "getErrorCode", "()I", "getId", "getPayloadType", "()Lcom/oplus/pantaconnect/sdk/connection/Payload$Type;", "getStatus", "()Lcom/oplus/pantaconnect/sdk/connection/PayloadTransferUpdate$Status;", "getTotalLength", "()J", "getTransferredLength", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "Status", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PayloadTransferUpdate {
    private final int errorCode;
    private final int id;

    @NotNull
    private final Payload.Type payloadType;

    @NotNull
    private final Status status;
    private final long totalLength;
    private final long transferredLength;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/PayloadTransferUpdate$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "CANCELED", "IN_PROGRESS", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Status {
        SUCCESS,
        FAILURE,
        CANCELED,
        IN_PROGRESS;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }
    }

    public PayloadTransferUpdate(int i, @NotNull Payload.Type type, long j2, long j3, int i2, @NotNull Status status) {
        this.id = i;
        this.payloadType = type;
        this.transferredLength = j2;
        this.totalLength = j3;
        this.errorCode = i2;
        this.status = status;
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
    public final long getTransferredLength() {
        return this.transferredLength;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalLength() {
        return this.totalLength;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final PayloadTransferUpdate copy(int id, @NotNull Payload.Type payloadType, long transferredLength, long totalLength, int errorCode, @NotNull Status status) {
        return new PayloadTransferUpdate(id, payloadType, transferredLength, totalLength, errorCode, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayloadTransferUpdate)) {
            return false;
        }
        PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) other;
        return this.id == payloadTransferUpdate.id && this.payloadType == payloadTransferUpdate.payloadType && this.transferredLength == payloadTransferUpdate.transferredLength && this.totalLength == payloadTransferUpdate.totalLength && this.errorCode == payloadTransferUpdate.errorCode && this.status == payloadTransferUpdate.status;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Payload.Type getPayloadType() {
        return this.payloadType;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public final long getTotalLength() {
        return this.totalLength;
    }

    public final long getTransferredLength() {
        return this.transferredLength;
    }

    public int hashCode() {
        return this.status.hashCode() + ((Integer.hashCode(this.errorCode) + ((Long.hashCode(this.totalLength) + ((Long.hashCode(this.transferredLength) + ((this.payloadType.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "PayloadTransferUpdate(id=" + this.id + ", payloadType=" + this.payloadType + ", transferredLength=" + this.transferredLength + ", totalLength=" + this.totalLength + ", errorCode=" + this.errorCode + ", status=" + this.status + ')';
    }
}
