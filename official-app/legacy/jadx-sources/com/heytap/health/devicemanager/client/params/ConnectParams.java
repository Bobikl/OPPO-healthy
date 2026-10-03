package com.heytap.health.devicemanager.client.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.ra5;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fHÖ\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/health/devicemanager/client/params/ConnectParams;", "Lcom/heytap/health/devicemanager/client/params/DMParams;", "Landroid/os/Parcelable;", "_id", "", "_reason", "(Ljava/lang/String;Ljava/lang/String;)V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectParams extends DMParams {

    @NotNull
    public static final Parcelable.Creator<ConnectParams> CREATOR = new a();

    @Nullable
    private final String _id;

    @NotNull
    private final String _reason;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConnectParams> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConnectParams createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConnectParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConnectParams[] newArray(int i) {
            return new ConnectParams[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectParams(@Nullable String str, @NotNull String _reason) {
        super(str == null ? "" : str, _reason, ra5.a.INSTANCE.getValue(), null, null, 24, null);
        Intrinsics.checkNotNullParameter(_reason, "_reason");
        this._id = str;
        this._reason = _reason;
    }

    @Override // com.heytap.health.devicemanager.client.params.DMParams, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this._reason);
    }
}
