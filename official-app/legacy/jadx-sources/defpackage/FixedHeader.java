package defpackage;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: a, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0000\u0010\n\u001a\u0004\b\u0000\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001c"}, d2 = {"La;", "", "", "b", "", "toString", "", "hashCode", "other", "equals", "I", "()I", "messageType", "Z", "getDup", "()Z", "dup", "c", "getQos", "qos", "d", "getRetain", "retain", MapSchema.FIELD_NAME_ENTRY, "getRemainingLength", "remainingLength", "<init>", "(IZIZI)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FixedHeader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int messageType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean dup;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int qos;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean retain;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int remainingLength;

    public FixedHeader(int i, boolean z, int i2, boolean z2, int i3) {
        this.messageType = i;
        this.dup = z;
        this.qos = i2;
        this.retain = z2;
        this.remainingLength = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMessageType() {
        return this.messageType;
    }

    public final boolean b() {
        return this.messageType == 13;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FixedHeader)) {
            return false;
        }
        FixedHeader fixedHeader = (FixedHeader) other;
        return this.messageType == fixedHeader.messageType && this.dup == fixedHeader.dup && this.qos == fixedHeader.qos && this.retain == fixedHeader.retain && this.remainingLength == fixedHeader.remainingLength;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.messageType) * 31;
        boolean z = this.dup;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + Integer.hashCode(this.qos)) * 31;
        boolean z2 = this.retain;
        return ((iHashCode2 + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.remainingLength);
    }

    @NotNull
    public String toString() {
        return "FixedHeader(messageType=" + this.messageType + ", dup=" + this.dup + ", qos=" + this.qos + ", retain=" + this.retain + ", remainingLength=" + this.remainingLength + ")";
    }
}
