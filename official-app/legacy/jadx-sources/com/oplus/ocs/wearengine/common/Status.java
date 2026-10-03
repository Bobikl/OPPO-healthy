package com.oplus.ocs.wearengine.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.yo3;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001'B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b\"\u0010%J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/oplus/ocs/wearengine/common/Status;", "", "Landroid/os/Parcelable;", "", "component1", "", "component2", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "code", "message", "copy", "toString", "hashCode", "other", "", "equals", "I", "Ljava/lang/String;", "getStatusCode", "()I", "statusCode", "getStatusMessage", "()Ljava/lang/String;", "statusMessage", "isSuccess", "()Z", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "status", "<init>", "(ILjava/lang/String;)V", "source", "(Landroid/os/Parcel;)V", "Companion", "b", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Status implements Parcelable {
    private final int code;

    @Nullable
    private final String message;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Status> CREATOR = new a();

    @JvmField
    @NotNull
    public static final Status SUCCESS = new Status(0, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/oplus/ocs/wearengine/common/Status$a", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/common/Status;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/common/Status;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<Status> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Status(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Status[] newArray(int size) {
            return new Status[size];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Status(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getMessage() {
        return this.message;
    }

    public static /* synthetic */ Status copy$default(Status status, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = status.code;
        }
        if ((i2 & 2) != 0) {
            str = status.message;
        }
        return status.copy(i, str);
    }

    @NotNull
    public final Status copy(int code, @Nullable String message) {
        return new Status(code, message);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return this.code == status.code && Intrinsics.areEqual(this.message, status.message);
    }

    @NotNull
    public Status getStatus() {
        return this;
    }

    public final int getStatusCode() {
        return this.code;
    }

    @NotNull
    public final String getStatusMessage() {
        String str = this.message;
        return str == null ? yo3.a(this.code) : str;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSuccess() {
        return this.code == 0;
    }

    @NotNull
    public String toString() {
        return "Status(code=" + this.code + ", message=" + this.message + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.code);
        dest.writeString(this.message);
    }

    @JvmOverloads
    public Status(int i, @Nullable String str) {
        this.code = i;
        this.message = str;
    }

    public /* synthetic */ Status(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Status(@NotNull Parcel source) {
        this(source.readInt(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
