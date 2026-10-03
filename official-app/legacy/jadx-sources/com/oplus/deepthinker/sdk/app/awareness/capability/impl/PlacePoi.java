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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0019\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001,B3\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b(\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u0014HÆ\u0001R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u0019\u0010$R\u0017\u0010\u001a\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/PlacePoi;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "toString", "component1", "component2", "component3", "component4", "", "component5", "name", "poiUid", "type", "isInArea", "distance", "copy", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getPoiUid", "I", "getType", "()I", "Z", "()Z", "D", "getDistance", "()D", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZD)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class PlacePoi implements Parcelable {
    public static final int BASE_HASH_NUM = 17;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int HASH_MULTIPLIER = 31;
    private final double distance;
    private final boolean isInArea;

    @Nullable
    private final String name;

    @Nullable
    private final String poiUid;
    private final int type;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.impl.PlacePoi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/PlacePoi$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/PlacePoi;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/PlacePoi;", "BASE_HASH_NUM", "I", "HASH_MULTIPLIER", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<PlacePoi> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlacePoi createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlacePoi(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlacePoi[] newArray(int size) {
            return new PlacePoi[size];
        }
    }

    public PlacePoi(@Nullable String str, @Nullable String str2, int i, boolean z, double d) {
        this.name = str;
        this.poiUid = str2;
        this.type = i;
        this.isInArea = z;
        this.distance = d;
    }

    public static /* synthetic */ PlacePoi copy$default(PlacePoi placePoi, String str, String str2, int i, boolean z, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = placePoi.name;
        }
        if ((i2 & 2) != 0) {
            str2 = placePoi.poiUid;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = placePoi.type;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = placePoi.isInArea;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            d = placePoi.distance;
        }
        return placePoi.copy(str, str3, i3, z2, d);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPoiUid() {
        return this.poiUid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsInArea() {
        return this.isInArea;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final PlacePoi copy(@Nullable String name, @Nullable String poiUid, int type, boolean isInArea, double distance) {
        return new PlacePoi(name, poiUid, type, isInArea, distance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof PlacePoi)) {
            return false;
        }
        if (this != other) {
            PlacePoi placePoi = (PlacePoi) other;
            if (!Intrinsics.areEqual(this.poiUid, placePoi.poiUid) || !Intrinsics.areEqual(this.name, placePoi.name)) {
                return false;
            }
        }
        return true;
    }

    public final double getDistance() {
        return this.distance;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPoiUid() {
        return this.poiUid;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.poiUid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isInArea() {
        return this.isInArea;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.poiUid);
        parcel.writeInt(this.type);
        parcel.writeByte(this.isInArea ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.distance);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlacePoi(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readByte() != 0, parcel.readDouble());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
