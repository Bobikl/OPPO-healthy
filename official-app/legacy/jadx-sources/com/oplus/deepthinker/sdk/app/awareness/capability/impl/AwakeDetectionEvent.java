package com.oplus.deepthinker.sdk.app.awareness.capability.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AwakeDetectionEvent;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "awakeTimeStamp", "copy", "", "toString", "hashCode", "", "other", "", "equals", "J", "getAwakeTimeStamp", "()J", "<init>", "(J)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class AwakeDetectionEvent implements Parcelable {

    @NotNull
    public static final String BUNDLE_KEY_AWAKE_DETECTION_EVENT = "awake_detection_event";

    @NotNull
    public static final String BUNDLE_KEY_AWAKE_TIME_STAMP = "awake_time_stamp";

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long awakeTimeStamp;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.impl.AwakeDetectionEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AwakeDetectionEvent$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AwakeDetectionEvent;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AwakeDetectionEvent;", "", "BUNDLE_KEY_AWAKE_DETECTION_EVENT", "Ljava/lang/String;", "BUNDLE_KEY_AWAKE_TIME_STAMP", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<AwakeDetectionEvent> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AwakeDetectionEvent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AwakeDetectionEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AwakeDetectionEvent[] newArray(int size) {
            return new AwakeDetectionEvent[size];
        }
    }

    public AwakeDetectionEvent(long j2) {
        this.awakeTimeStamp = j2;
    }

    public static /* synthetic */ AwakeDetectionEvent copy$default(AwakeDetectionEvent awakeDetectionEvent, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = awakeDetectionEvent.awakeTimeStamp;
        }
        return awakeDetectionEvent.copy(j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAwakeTimeStamp() {
        return this.awakeTimeStamp;
    }

    @NotNull
    public final AwakeDetectionEvent copy(long awakeTimeStamp) {
        return new AwakeDetectionEvent(awakeTimeStamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AwakeDetectionEvent) && this.awakeTimeStamp == ((AwakeDetectionEvent) other).awakeTimeStamp;
    }

    public final long getAwakeTimeStamp() {
        return this.awakeTimeStamp;
    }

    public int hashCode() {
        return Long.hashCode(this.awakeTimeStamp);
    }

    @NotNull
    public String toString() {
        return "AwakeDetectionEvent(awakeTimeStamp=" + this.awakeTimeStamp + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.awakeTimeStamp);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AwakeDetectionEvent(@NotNull Parcel parcel) {
        this(parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
