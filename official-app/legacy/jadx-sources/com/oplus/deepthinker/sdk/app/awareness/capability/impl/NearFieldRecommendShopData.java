package com.oplus.deepthinker.sdk.app.awareness.capability.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.f04;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001,B-\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b(\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b \u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldRecommendShopData;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "toString", "component1", "component2", "component3", "component4", "poiId", "shopName", f04.KEY_BRAND_ID, "brandName", "copy", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getPoiId", "()Ljava/lang/String;", "getShopName", "I", "getBrandId", "()I", "getBrandName", "Landroid/os/Bundle;", "extra", "Landroid/os/Bundle;", "getExtra", "()Landroid/os/Bundle;", "setExtra", "(Landroid/os/Bundle;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class NearFieldRecommendShopData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int brandId;

    @Nullable
    private final String brandName;

    @Nullable
    private Bundle extra;

    @Nullable
    private final String poiId;

    @Nullable
    private final String shopName;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.impl.NearFieldRecommendShopData$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldRecommendShopData$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldRecommendShopData;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldRecommendShopData;", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<NearFieldRecommendShopData> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NearFieldRecommendShopData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NearFieldRecommendShopData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NearFieldRecommendShopData[] newArray(int size) {
            return new NearFieldRecommendShopData[size];
        }
    }

    public NearFieldRecommendShopData(@Nullable String str, @Nullable String str2, int i, @Nullable String str3) {
        this.poiId = str;
        this.shopName = str2;
        this.brandId = i;
        this.brandName = str3;
    }

    public static /* synthetic */ NearFieldRecommendShopData copy$default(NearFieldRecommendShopData nearFieldRecommendShopData, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = nearFieldRecommendShopData.poiId;
        }
        if ((i2 & 2) != 0) {
            str2 = nearFieldRecommendShopData.shopName;
        }
        if ((i2 & 4) != 0) {
            i = nearFieldRecommendShopData.brandId;
        }
        if ((i2 & 8) != 0) {
            str3 = nearFieldRecommendShopData.brandName;
        }
        return nearFieldRecommendShopData.copy(str, str2, i, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPoiId() {
        return this.poiId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShopName() {
        return this.shopName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBrandId() {
        return this.brandId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    public final NearFieldRecommendShopData copy(@Nullable String poiId, @Nullable String shopName, int brandId, @Nullable String brandName) {
        return new NearFieldRecommendShopData(poiId, shopName, brandId, brandName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NearFieldRecommendShopData)) {
            return false;
        }
        NearFieldRecommendShopData nearFieldRecommendShopData = (NearFieldRecommendShopData) other;
        return Intrinsics.areEqual(this.poiId, nearFieldRecommendShopData.poiId) && Intrinsics.areEqual(this.shopName, nearFieldRecommendShopData.shopName) && this.brandId == nearFieldRecommendShopData.brandId && Intrinsics.areEqual(this.brandName, nearFieldRecommendShopData.brandName);
    }

    public final int getBrandId() {
        return this.brandId;
    }

    @Nullable
    public final String getBrandName() {
        return this.brandName;
    }

    @Nullable
    public final Bundle getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getPoiId() {
        return this.poiId;
    }

    @Nullable
    public final String getShopName() {
        return this.shopName;
    }

    public int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shopName;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.brandId)) * 31;
        String str3 = this.brandName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setExtra(@Nullable Bundle bundle) {
        this.extra = bundle;
    }

    @NotNull
    public String toString() {
        return "NearFieldRecommendShopData(poiId=" + ((Object) this.poiId) + ", brandId=" + this.brandId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.poiId);
        parcel.writeString(this.shopName);
        parcel.writeInt(this.brandId);
        parcel.writeString(this.brandName);
        parcel.writeBundle(this.extra);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NearFieldRecommendShopData(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.extra = parcel.readBundle(NearFieldRecommendShopData.class.getClassLoader());
    }
}
