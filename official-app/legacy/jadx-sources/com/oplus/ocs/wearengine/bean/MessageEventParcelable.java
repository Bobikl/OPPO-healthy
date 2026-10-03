package com.oplus.ocs.wearengine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 ,2\u00020\u00012\u00020\u00012\u00020\u0002:\u0001-B)\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\t¢\u0006\u0004\b(\u0010+J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/oplus/ocs/wearengine/bean/MessageEventParcelable;", "", "Landroid/os/Parcelable;", "other", "", "equals", "", "hashCode", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "component1", "", "component2", "", "component3", "component4", "requestId", "path", "data", "sourceNodeId", "copy", "toString", "I", "getRequestId", "()I", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "[B", "getData", "()[B", "getSourceNodeId", "Lcom/oplus/ocs/wearengine/common/Status;", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "status", "<init>", "(ILjava/lang/String;[BLjava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", "b", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MessageEventParcelable implements Parcelable {

    @Nullable
    private final byte[] data;

    @NotNull
    private final String path;
    private final int requestId;

    @NotNull
    private final String sourceNodeId;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/oplus/ocs/wearengine/bean/MessageEventParcelable$a", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/MessageEventParcelable;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/MessageEventParcelable;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<MessageEventParcelable> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEventParcelable createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new MessageEventParcelable(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageEventParcelable[] newArray(int size) {
            return new MessageEventParcelable[size];
        }
    }

    public MessageEventParcelable(int i, @NotNull String path, @Nullable byte[] bArr, @NotNull String sourceNodeId) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(sourceNodeId, "sourceNodeId");
        this.requestId = i;
        this.path = path;
        this.data = bArr;
        this.sourceNodeId = sourceNodeId;
    }

    public static /* synthetic */ MessageEventParcelable copy$default(MessageEventParcelable messageEventParcelable, int i, String str, byte[] bArr, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = messageEventParcelable.getRequestId();
        }
        if ((i2 & 2) != 0) {
            str = messageEventParcelable.getPath();
        }
        if ((i2 & 4) != 0) {
            bArr = messageEventParcelable.getData();
        }
        if ((i2 & 8) != 0) {
            str2 = messageEventParcelable.getSourceNodeId();
        }
        return messageEventParcelable.copy(i, str, bArr, str2);
    }

    public final int component1() {
        return getRequestId();
    }

    @NotNull
    public final String component2() {
        return getPath();
    }

    @Nullable
    public final byte[] component3() {
        return getData();
    }

    @NotNull
    public final String component4() {
        return getSourceNodeId();
    }

    @NotNull
    public final MessageEventParcelable copy(int requestId, @NotNull String path, @Nullable byte[] data, @NotNull String sourceNodeId) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(sourceNodeId, "sourceNodeId");
        return new MessageEventParcelable(requestId, path, data, sourceNodeId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MessageEventParcelable.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.ocs.wearengine.bean.MessageEventParcelable");
        MessageEventParcelable messageEventParcelable = (MessageEventParcelable) other;
        if (getRequestId() != messageEventParcelable.getRequestId() || !Intrinsics.areEqual(getPath(), messageEventParcelable.getPath())) {
            return false;
        }
        if (getData() != null) {
            if (messageEventParcelable.getData() == null || !Arrays.equals(getData(), messageEventParcelable.getData())) {
                return false;
            }
        } else if (messageEventParcelable.getData() != null) {
            return false;
        }
        return Intrinsics.areEqual(getSourceNodeId(), messageEventParcelable.getSourceNodeId());
    }

    @Nullable
    public byte[] getData() {
        return this.data;
    }

    @NotNull
    public String getPath() {
        return this.path;
    }

    public int getRequestId() {
        return this.requestId;
    }

    @NotNull
    public String getSourceNodeId() {
        return this.sourceNodeId;
    }

    @NotNull
    public Status getStatus() {
        return Status.SUCCESS;
    }

    public int hashCode() {
        int requestId = ((getRequestId() * 31) + getPath().hashCode()) * 31;
        byte[] data = getData();
        return ((requestId + (data != null ? Arrays.hashCode(data) : 0)) * 31) + getSourceNodeId().hashCode();
    }

    @NotNull
    public String toString() {
        return "MessageEventParcelable(requestId=" + getRequestId() + ", path=" + getPath() + ", data=" + Arrays.toString(getData()) + ", sourceNodeId=" + getSourceNodeId() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(getRequestId());
        dest.writeString(getPath());
        dest.writeByteArray(getData());
        dest.writeString(getSourceNodeId());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageEventParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = parcel.readInt();
        String string = parcel.readString();
        string = string == null ? "" : string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        String string2 = parcel.readString();
        this(i, string, bArrCreateByteArray, string2 != null ? string2 : "");
    }
}
