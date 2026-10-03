package com.oplus.ocs.wearengine.bean;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0019\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010!J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/BinderParcelable;", "", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "Landroid/os/IBinder;", "component1", "Lcom/oplus/ocs/wearengine/common/Status;", "component2", "iBinder", "status", "copy", "", "toString", "hashCode", "other", "", "equals", "Landroid/os/IBinder;", "getIBinder", "()Landroid/os/IBinder;", "Lcom/oplus/ocs/wearengine/common/Status;", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "<init>", "(Landroid/os/IBinder;Lcom/oplus/ocs/wearengine/common/Status;)V", "(Landroid/os/Parcel;)V", "(Landroid/os/IBinder;)V", "(Lcom/oplus/ocs/wearengine/common/Status;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BinderParcelable implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final IBinder iBinder;

    @NotNull
    private final Status status;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.BinderParcelable$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/BinderParcelable$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/BinderParcelable;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/BinderParcelable;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<BinderParcelable> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinderParcelable createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BinderParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinderParcelable[] newArray(int size) {
            return new BinderParcelable[size];
        }
    }

    public BinderParcelable(@Nullable IBinder iBinder, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.iBinder = iBinder;
        this.status = status;
    }

    public static /* synthetic */ BinderParcelable copy$default(BinderParcelable binderParcelable, IBinder iBinder, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            iBinder = binderParcelable.iBinder;
        }
        if ((i & 2) != 0) {
            status = binderParcelable.getStatus();
        }
        return binderParcelable.copy(iBinder, status);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IBinder getIBinder() {
        return this.iBinder;
    }

    @NotNull
    public final Status component2() {
        return getStatus();
    }

    @NotNull
    public final BinderParcelable copy(@Nullable IBinder iBinder, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new BinderParcelable(iBinder, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinderParcelable)) {
            return false;
        }
        BinderParcelable binderParcelable = (BinderParcelable) other;
        return Intrinsics.areEqual(this.iBinder, binderParcelable.iBinder) && Intrinsics.areEqual(getStatus(), binderParcelable.getStatus());
    }

    @Nullable
    public final IBinder getIBinder() {
        return this.iBinder;
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        IBinder iBinder = this.iBinder;
        return ((iBinder == null ? 0 : iBinder.hashCode()) * 31) + getStatus().hashCode();
    }

    @NotNull
    public String toString() {
        return "BinderParcelable(iBinder=" + this.iBinder + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeStrongBinder(this.iBinder);
        parcel.writeParcelable(getStatus(), flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BinderParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        IBinder strongBinder = parcel.readStrongBinder();
        Status status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        if (status == null) {
            status = new Status(8, null, 2, 0 == true ? 1 : 0);
        }
        this(strongBinder, status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderParcelable(@NotNull IBinder iBinder) {
        this(iBinder, Status.SUCCESS);
        Intrinsics.checkNotNullParameter(iBinder, "iBinder");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderParcelable(@NotNull Status status) {
        this(null, status);
        Intrinsics.checkNotNullParameter(status, "status");
    }
}
