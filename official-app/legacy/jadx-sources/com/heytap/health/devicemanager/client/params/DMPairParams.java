package com.heytap.health.devicemanager.client.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BK\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bHÖ\u0001R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/devicemanager/client/params/DMPairParams;", "Lcom/heytap/health/devicemanager/client/params/DMParams;", "Landroid/os/Parcelable;", "_id", "", "model", "_reason", "_role", "", "deviceSecret", "_key", "_R1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceSecret", "()Ljava/lang/String;", "getModel", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DMPairParams extends DMParams {

    @NotNull
    public static final Parcelable.Creator<DMPairParams> CREATOR = new a();

    @NotNull
    private final String _R1;

    @Nullable
    private final String _id;

    @NotNull
    private final String _key;

    @NotNull
    private final String _reason;
    private final int _role;

    @NotNull
    private final String deviceSecret;

    @Nullable
    private final String model;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DMPairParams> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DMPairParams createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DMPairParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DMPairParams[] newArray(int i) {
            return new DMPairParams[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DMPairParams(@Nullable String str, @Nullable String str2, @NotNull String _reason) {
        this(str, str2, _reason, 0, null, null, null, 120, null);
        Intrinsics.checkNotNullParameter(_reason, "_reason");
    }

    @NotNull
    public final String getDeviceSecret() {
        return this.deviceSecret;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Override // com.heytap.health.devicemanager.client.params.DMParams, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.model);
        parcel.writeString(this._reason);
        parcel.writeInt(this._role);
        parcel.writeString(this.deviceSecret);
        parcel.writeString(this._key);
        parcel.writeString(this._R1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DMPairParams(@Nullable String str, @Nullable String str2, @NotNull String _reason, int i) {
        this(str, str2, _reason, i, null, null, null, 112, null);
        Intrinsics.checkNotNullParameter(_reason, "_reason");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DMPairParams(@Nullable String str, @Nullable String str2, @NotNull String _reason, int i, @NotNull String deviceSecret) {
        this(str, str2, _reason, i, deviceSecret, null, null, 96, null);
        Intrinsics.checkNotNullParameter(_reason, "_reason");
        Intrinsics.checkNotNullParameter(deviceSecret, "deviceSecret");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DMPairParams(@Nullable String str, @Nullable String str2, @NotNull String _reason, int i, @NotNull String deviceSecret, @NotNull String _key) {
        this(str, str2, _reason, i, deviceSecret, _key, null, 64, null);
        Intrinsics.checkNotNullParameter(_reason, "_reason");
        Intrinsics.checkNotNullParameter(deviceSecret, "deviceSecret");
        Intrinsics.checkNotNullParameter(_key, "_key");
    }

    public /* synthetic */ DMPairParams(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DMPairParams(@Nullable String str, @Nullable String str2, @NotNull String _reason, int i, @NotNull String deviceSecret, @NotNull String _key, @NotNull String _R1) {
        super(str == null ? "" : str, _reason, i, _key, _R1);
        Intrinsics.checkNotNullParameter(_reason, "_reason");
        Intrinsics.checkNotNullParameter(deviceSecret, "deviceSecret");
        Intrinsics.checkNotNullParameter(_key, "_key");
        Intrinsics.checkNotNullParameter(_R1, "_R1");
        this._id = str;
        this.model = str2;
        this._reason = _reason;
        this._role = i;
        this.deviceSecret = deviceSecret;
        this._key = _key;
        this._R1 = _R1;
    }
}
