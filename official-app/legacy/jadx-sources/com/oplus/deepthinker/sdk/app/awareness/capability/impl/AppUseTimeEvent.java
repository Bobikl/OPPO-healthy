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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001#B%\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006$"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AppUseTimeEvent;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "", "component2", "component3", "packageName", "startTime", "endTime", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "J", "getStartTime", "()J", "getEndTime", "<init>", "(Ljava/lang/String;JJ)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class AppUseTimeEvent implements Parcelable {

    @NotNull
    public static final String BUNDLE_KEY_APP_USE_TIME_EVENT = "app_use_time_event";

    @NotNull
    public static final String BUNDLE_KEY_END_TIME = "end_time";

    @NotNull
    public static final String BUNDLE_KEY_PACKAGE_NAME = "package_name";

    @NotNull
    public static final String BUNDLE_KEY_START_TIME = "start_time";

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long endTime;

    @Nullable
    private final String packageName;
    private final long startTime;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.impl.AppUseTimeEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AppUseTimeEvent$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AppUseTimeEvent;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AppUseTimeEvent;", "", "BUNDLE_KEY_APP_USE_TIME_EVENT", "Ljava/lang/String;", "BUNDLE_KEY_END_TIME", "BUNDLE_KEY_PACKAGE_NAME", "BUNDLE_KEY_START_TIME", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<AppUseTimeEvent> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppUseTimeEvent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppUseTimeEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppUseTimeEvent[] newArray(int size) {
            return new AppUseTimeEvent[size];
        }
    }

    public AppUseTimeEvent(@Nullable String str, long j2, long j3) {
        this.packageName = str;
        this.startTime = j2;
        this.endTime = j3;
    }

    public static /* synthetic */ AppUseTimeEvent copy$default(AppUseTimeEvent appUseTimeEvent, String str, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appUseTimeEvent.packageName;
        }
        if ((i & 2) != 0) {
            j2 = appUseTimeEvent.startTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = appUseTimeEvent.endTime;
        }
        return appUseTimeEvent.copy(str, j4, j3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final AppUseTimeEvent copy(@Nullable String packageName, long startTime, long endTime) {
        return new AppUseTimeEvent(packageName, startTime, endTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUseTimeEvent)) {
            return false;
        }
        AppUseTimeEvent appUseTimeEvent = (AppUseTimeEvent) other;
        return Intrinsics.areEqual(this.packageName, appUseTimeEvent.packageName) && this.startTime == appUseTimeEvent.startTime && this.endTime == appUseTimeEvent.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        String str = this.packageName;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime);
    }

    @NotNull
    public String toString() {
        return "AppUseTimeEvent(packageName=" + ((Object) this.packageName) + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.packageName);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public /* synthetic */ AppUseTimeEvent(String str, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppUseTimeEvent(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readLong(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
