package com.heytap.wearable.oms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.wearable.oms.common.Status;
import com.oplus.aiunit.vision.jtc;
import com.oplus.aiunit.vision.l9d;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b \u0010\"B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b \u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b \u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\t\u0010\u0012\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/heytap/wearable/oms/internal/NodeParcelable;", "Lcom/oplus/aiunit/vision/jtc;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "component1", "Lcom/heytap/wearable/oms/common/Status;", "component2", "id", "status", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/heytap/wearable/oms/common/Status;", "getStatus", "()Lcom/heytap/wearable/oms/common/Status;", "getNode", "()Lcom/oplus/aiunit/vision/jtc;", l9d.BUNDLE_KEY_NODE, "<init>", "(Ljava/lang/String;Lcom/heytap/wearable/oms/common/Status;)V", "(Ljava/lang/String;)V", "(Lcom/heytap/wearable/oms/common/Status;)V", "source", "(Landroid/os/Parcel;)V", "Companion", "b", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class NodeParcelable implements jtc, Parcelable {

    @NotNull
    private final String id;

    @NotNull
    private final Status status;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<NodeParcelable> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/heytap/wearable/oms/internal/NodeParcelable$a", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/wearable/oms/internal/NodeParcelable;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/heytap/wearable/oms/internal/NodeParcelable;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<NodeParcelable> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NodeParcelable createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new NodeParcelable(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NodeParcelable[] newArray(int size) {
            return new NodeParcelable[size];
        }
    }

    public NodeParcelable(@NotNull String id, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.status = status;
    }

    public static /* synthetic */ NodeParcelable copy$default(NodeParcelable nodeParcelable, String str, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeParcelable.getId();
        }
        if ((i & 2) != 0) {
            status = nodeParcelable.getStatus();
        }
        return nodeParcelable.copy(str, status);
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    @NotNull
    public final Status component2() {
        return getStatus();
    }

    @NotNull
    public final NodeParcelable copy(@NotNull String id, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        return new NodeParcelable(id, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NodeParcelable)) {
            return false;
        }
        NodeParcelable nodeParcelable = (NodeParcelable) other;
        return Intrinsics.areEqual(getId(), nodeParcelable.getId()) && Intrinsics.areEqual(getStatus(), nodeParcelable.getStatus());
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public jtc getNode() {
        return this;
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (getId().hashCode() * 31) + getStatus().hashCode();
    }

    @NotNull
    public String toString() {
        return "NodeParcelable(id=" + getId() + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(getId());
        dest.writeParcelable(getStatus(), 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NodeParcelable(@NotNull String id) {
        this(id, Status.SUCCESS);
        Intrinsics.checkNotNullParameter(id, "id");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NodeParcelable(@NotNull Status status) {
        this("", status);
        Intrinsics.checkNotNullParameter(status, "status");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NodeParcelable(@NotNull Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String string = source.readString();
        string = string == null ? "" : string;
        Status status = (Status) source.readParcelable(Status.class.getClassLoader());
        this(string, status == null ? new Status(6, null, 2, null) : status);
    }
}
