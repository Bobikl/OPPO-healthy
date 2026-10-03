package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Arrays;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/ArchiveValueLocation;", "Landroid/os/Parcelable;", "value", "", "isModified", "", "location", "", "(Ljava/lang/String;Z[I)V", "()Z", "setModified", "(Z)V", "getLocation", "()[I", "setLocation", "([I)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveValueLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ArchiveValueLocation> CREATOR = new a();
    private boolean isModified;

    @Nullable
    private int[] location;

    @Nullable
    private String value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ArchiveValueLocation> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArchiveValueLocation createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ArchiveValueLocation(parcel.readString(), parcel.readInt() != 0, parcel.createIntArray());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArchiveValueLocation[] newArray(int i) {
            return new ArchiveValueLocation[i];
        }
    }

    public ArchiveValueLocation() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ ArchiveValueLocation copy$default(ArchiveValueLocation archiveValueLocation, String str, boolean z, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = archiveValueLocation.value;
        }
        if ((i & 2) != 0) {
            z = archiveValueLocation.isModified;
        }
        if ((i & 4) != 0) {
            iArr = archiveValueLocation.location;
        }
        return archiveValueLocation.copy(str, z, iArr);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsModified() {
        return this.isModified;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int[] getLocation() {
        return this.location;
    }

    @NotNull
    public final ArchiveValueLocation copy(@Nullable String value, boolean isModified, @Nullable int[] location) {
        return new ArchiveValueLocation(value, isModified, location);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ArchiveValueLocation.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.databaseengine.model.healtharchive.ArchiveValueLocation");
        ArchiveValueLocation archiveValueLocation = (ArchiveValueLocation) other;
        if (!Intrinsics.areEqual(this.value, archiveValueLocation.value) || this.isModified != archiveValueLocation.isModified) {
            return false;
        }
        int[] iArr = this.location;
        if (iArr != null) {
            int[] iArr2 = archiveValueLocation.location;
            if (iArr2 == null || !Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (archiveValueLocation.location != null) {
            return false;
        }
        return true;
    }

    @Nullable
    public final int[] getLocation() {
        return this.location;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Boolean.hashCode(this.isModified)) * 31;
        int[] iArr = this.location;
        return iHashCode + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    public final boolean isModified() {
        return this.isModified;
    }

    public final void setLocation(@Nullable int[] iArr) {
        this.location = iArr;
    }

    public final void setModified(boolean z) {
        this.isModified = z;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "ArchiveValueLocation(value=" + this.value + ", isModified=" + this.isModified + ", location=" + Arrays.toString(this.location) + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.value);
        parcel.writeInt(this.isModified ? 1 : 0);
        parcel.writeIntArray(this.location);
    }

    public ArchiveValueLocation(@Nullable String str, boolean z, @Nullable int[] iArr) {
        this.value = str;
        this.isModified = z;
        this.location = iArr;
    }

    public /* synthetic */ ArchiveValueLocation(String str, boolean z, int[] iArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : iArr);
    }
}
