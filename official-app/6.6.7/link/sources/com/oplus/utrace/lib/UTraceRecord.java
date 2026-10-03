package com.oplus.utrace.lib;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.utrace.utils.ExceptionProtectUtilKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004BS\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0002\u0010\u0012J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003Je\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\b\u00107\u001a\u00020\u000fH\u0016J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u000fHÖ\u0001J\b\u0010=\u001a\u00020\u0006H\u0016J\u0018\u0010>\u001a\u00020?2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u000fH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"¨\u0006B"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecord;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "traceID", "", "current", "Lcom/oplus/utrace/lib/NodeID;", "parent", UTraceSQLiteHelperKt.COL_SPAN_NAME, "startTime", "", "endTime", "status", "", UTraceSQLiteHelperKt.COL_INFO, UTraceSQLiteHelperKt.COL_HAS_ERROR, "(Ljava/lang/String;Lcom/oplus/utrace/lib/NodeID;Lcom/oplus/utrace/lib/NodeID;Ljava/lang/String;JJILjava/lang/String;I)V", "getCurrent", "()Lcom/oplus/utrace/lib/NodeID;", "setCurrent", "(Lcom/oplus/utrace/lib/NodeID;)V", "getEndTime", "()J", "setEndTime", "(J)V", "getHasError", "()I", "setHasError", "(I)V", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "getParent", "setParent", "getSpanName", "setSpanName", "getStartTime", "setStartTime", "getStatus", "setStatus", "getTraceID", "setTraceID", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "CREATOR", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UTraceRecord implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private NodeID current;
    private long endTime;
    private int hasError;

    @NotNull
    private String info;

    @Nullable
    private NodeID parent;

    @NotNull
    private String spanName;
    private long startTime;
    private int status;

    @NotNull
    private String traceID;

    /* JADX INFO: renamed from: com.oplus.utrace.lib.UTraceRecord$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/utrace/lib/UTraceRecord$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/utrace/lib/UTraceRecord;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/oplus/utrace/lib/UTraceRecord;", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<UTraceRecord> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public UTraceRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UTraceRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public UTraceRecord[] newArray(int size) {
            return new UTraceRecord[size];
        }
    }

    public UTraceRecord(@NotNull String str, @NotNull NodeID nodeID, @Nullable NodeID nodeID2, @NotNull String str2, long j, long j2, int i, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "traceID");
        Intrinsics.checkNotNullParameter(nodeID, "current");
        Intrinsics.checkNotNullParameter(str2, UTraceSQLiteHelperKt.COL_SPAN_NAME);
        Intrinsics.checkNotNullParameter(str3, UTraceSQLiteHelperKt.COL_INFO);
        this.traceID = str;
        this.current = nodeID;
        this.parent = nodeID2;
        this.spanName = str2;
        this.startTime = j;
        this.endTime = j2;
        this.status = i;
        this.info = str3;
        this.hasError = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTraceID() {
        return this.traceID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NodeID getCurrent() {
        return this.current;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NodeID getParent() {
        return this.parent;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpanName() {
        return this.spanName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHasError() {
        return this.hasError;
    }

    @NotNull
    public final UTraceRecord copy(@NotNull String traceID, @NotNull NodeID current, @Nullable NodeID parent, @NotNull String spanName, long startTime, long endTime, int status, @NotNull String info, int hasError) {
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(spanName, UTraceSQLiteHelperKt.COL_SPAN_NAME);
        Intrinsics.checkNotNullParameter(info, UTraceSQLiteHelperKt.COL_INFO);
        return new UTraceRecord(traceID, current, parent, spanName, startTime, endTime, status, info, hasError);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UTraceRecord)) {
            return false;
        }
        UTraceRecord uTraceRecord = (UTraceRecord) other;
        return Intrinsics.areEqual(this.traceID, uTraceRecord.traceID) && Intrinsics.areEqual(this.current, uTraceRecord.current) && Intrinsics.areEqual(this.parent, uTraceRecord.parent) && Intrinsics.areEqual(this.spanName, uTraceRecord.spanName) && this.startTime == uTraceRecord.startTime && this.endTime == uTraceRecord.endTime && this.status == uTraceRecord.status && Intrinsics.areEqual(this.info, uTraceRecord.info) && this.hasError == uTraceRecord.hasError;
    }

    @NotNull
    public final NodeID getCurrent() {
        return this.current;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getHasError() {
        return this.hasError;
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final NodeID getParent() {
        return this.parent;
    }

    @NotNull
    public final String getSpanName() {
        return this.spanName;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTraceID() {
        return this.traceID;
    }

    public int hashCode() {
        int iHashCode = ((this.traceID.hashCode() * 31) + this.current.hashCode()) * 31;
        NodeID nodeID = this.parent;
        return ((((((((((((iHashCode + (nodeID == null ? 0 : nodeID.hashCode())) * 31) + this.spanName.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.status)) * 31) + this.info.hashCode()) * 31) + Integer.hashCode(this.hasError);
    }

    public final void setCurrent(@NotNull NodeID nodeID) {
        Intrinsics.checkNotNullParameter(nodeID, "<set-?>");
        this.current = nodeID;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setHasError(int i) {
        this.hasError = i;
    }

    public final void setInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.info = str;
    }

    public final void setParent(@Nullable NodeID nodeID) {
        this.parent = nodeID;
    }

    public final void setSpanName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.spanName = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTraceID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.traceID = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UTraceRecord(traceID='");
        sb.append(this.traceID);
        sb.append("', current=");
        sb.append(this.current.getSpanID(true));
        sb.append(", parent=");
        NodeID nodeID = this.parent;
        sb.append(nodeID != null ? nodeID.getSpanID(true) : null);
        sb.append(", spanName='");
        sb.append(this.spanName);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", info='");
        sb.append(this.info);
        sb.append("', hasError=");
        sb.append(this.hasError);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.traceID);
        parcel.writeParcelable(this.current, flags);
        parcel.writeParcelable(this.parent, flags);
        parcel.writeString(this.spanName);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.status);
        parcel.writeString(this.info);
        parcel.writeInt(this.hasError);
    }

    public /* synthetic */ UTraceRecord(String str, NodeID nodeID, NodeID nodeID2, String str2, long j, long j2, int i, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, nodeID, nodeID2, str2, j, j2, i, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? UTraceRecordV2.StatusError.NO_ERROR.getValue() : i2);
    }

    public UTraceRecord(@Nullable Parcel parcel) {
        String string;
        String string2;
        NodeID nodeID;
        String string3;
        this((parcel == null || (string3 = parcel.readString()) == null) ? "" : string3, (parcel == null || (nodeID = (NodeID) ExceptionProtectUtilKt.readParcelableSafe(parcel, NodeID.class.getClassLoader())) == null) ? new NodeID() : nodeID, parcel != null ? (NodeID) ExceptionProtectUtilKt.readParcelableSafe(parcel, NodeID.class.getClassLoader()) : null, (parcel == null || (string2 = parcel.readString()) == null) ? "" : string2, parcel != null ? parcel.readLong() : 0L, parcel != null ? parcel.readLong() : 0L, parcel != null ? parcel.readInt() : UTraceRecordV2.Status.START.getValue(), (parcel == null || (string = parcel.readString()) == null) ? "" : string, parcel != null ? parcel.readInt() : UTraceRecordV2.StatusError.NO_ERROR.getValue());
    }
}
