package com.heytap.health.device.ota.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/heytap/health/device/ota/bean/OTAStatus;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "component1", "", "component2", "status", "progress", "copy", "", "toString", "hashCode", "", "other", "", "equals", "I", "getStatus", "()I", "setStatus", "(I)V", UserInfo.SEX_FEMALE, "getProgress", "()F", ClickApiEntity.SET_PROGRESS, "(F)V", "<init>", "(IF)V", "(Landroid/os/Parcel;)V", "Companion", "b", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OTAStatus implements Parcelable {
    private float progress;
    private int status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<OTAStatus> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/heytap/health/device/ota/bean/OTAStatus$a", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/device/ota/bean/OTAStatus;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/device/ota/bean/OTAStatus;", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<OTAStatus> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OTAStatus createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OTAStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OTAStatus[] newArray(int size) {
            return new OTAStatus[size];
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.device.ota.bean.OTAStatus$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/device/ota/bean/OTAStatus$b;", "", "", "status", "", "progress", "Lcom/heytap/health/device/ota/bean/OTAStatus;", "a", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OTAStatus a(int status, float progress) {
            return new OTAStatus(status, progress);
        }
    }

    public OTAStatus() {
        this(0, 0.0f, 3, null);
    }

    public static /* synthetic */ OTAStatus copy$default(OTAStatus oTAStatus, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oTAStatus.status;
        }
        if ((i2 & 2) != 0) {
            f = oTAStatus.progress;
        }
        return oTAStatus.copy(i, f);
    }

    @JvmStatic
    @NotNull
    public static final OTAStatus create(int i, float f) {
        return INSTANCE.a(i, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    @NotNull
    public final OTAStatus copy(int status, float progress) {
        return new OTAStatus(status, progress);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTAStatus)) {
            return false;
        }
        OTAStatus oTAStatus = (OTAStatus) other;
        return this.status == oTAStatus.status && Float.compare(this.progress, oTAStatus.progress) == 0;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Integer.hashCode(this.status) * 31) + Float.hashCode(this.progress);
    }

    public final void setProgress(float f) {
        this.progress = f;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "OTAStatus(status=" + this.status + ", progress=" + this.progress + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.status);
        parcel.writeFloat(this.progress);
    }

    public OTAStatus(int i, float f) {
        this.status = i;
        this.progress = f;
    }

    public /* synthetic */ OTAStatus(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OTAStatus(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readFloat());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
