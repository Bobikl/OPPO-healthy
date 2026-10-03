package com.heytap.health.devicemanager.client.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.gdb;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/devicemanager/client/params/DMParams;", "Landroid/os/Parcelable;", "id", "", EngineConstant.REASON, "role", "", "key", Node.I_TAG, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getR1", "()Ljava/lang/String;", "setR1", "(Ljava/lang/String;)V", "getId", "getKey", "setKey", "getReason", "getRole", "()I", "setRole", "(I)V", "describeContents", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DMParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DMParams> CREATOR = new a();

    @NotNull
    private String R1;

    @NotNull
    private final String id;

    @NotNull
    private String key;

    @NotNull
    private final String reason;
    private int role;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DMParams> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DMParams createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DMParams(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DMParams[] newArray(int i) {
            return new DMParams[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DMParams(@NotNull String id, @NotNull String reason, int i) {
        this(id, reason, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getR1() {
        return this.R1;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    public final int getRole() {
        return this.role;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setR1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.R1 = str;
    }

    public final void setRole(int i) {
        this.role = i;
    }

    @NotNull
    public String toString() {
        String str;
        String strA = gdb.a(this.id);
        String str2 = this.reason;
        int i = this.role;
        String str3 = this.key;
        String str4 = this.R1;
        if (this instanceof DMPairParams) {
            DMPairParams dMPairParams = (DMPairParams) this;
            str = ", model='" + dMPairParams.getModel() + "', deviceSecret='" + gdb.a(dMPairParams.getDeviceSecret()) + "'";
        } else {
            str = "";
        }
        return "DMParams(id='" + strA + "', reason='" + str2 + "', role='" + i + "', key='" + str3 + "', R1='" + str4 + "'" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.reason);
        parcel.writeInt(this.role);
        parcel.writeString(this.key);
        parcel.writeString(this.R1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DMParams(@NotNull String id, @NotNull String reason, int i, @NotNull String key) {
        this(id, reason, i, key, null, 16, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @JvmOverloads
    public DMParams(@NotNull String id, @NotNull String reason, int i, @NotNull String key, @NotNull String R1) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(R1, "R1");
        this.id = id;
        this.reason = reason;
        this.role = i;
        this.key = key;
        this.R1 = R1;
    }

    public /* synthetic */ DMParams(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
    }
}
