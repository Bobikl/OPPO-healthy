package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001+B7\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b'\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b&\u0010$¨\u0006,"}, d2 = {"Lcom/heytap/databaseengine/model/Commodity;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "Lcom/heytap/databaseengine/model/Price;", "component1", "component2", "", "component3", "component4", "component5", SensorsBean.PRICE, "skuId", "skuName", "spuName", "url", "copy", "toString", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/Price;", "getPrice", "()Lcom/heytap/databaseengine/model/Price;", "I", "getSkuId", "()I", "Ljava/lang/String;", "getSkuName", "()Ljava/lang/String;", "getSpuName", "getUrl", "<init>", "(Lcom/heytap/databaseengine/model/Price;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Commodity implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Price price;
    private final int skuId;

    @Nullable
    private final String skuName;

    @Nullable
    private final String spuName;

    @Nullable
    private final String url;

    /* JADX INFO: renamed from: com.heytap.databaseengine.model.Commodity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/databaseengine/model/Commodity$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/databaseengine/model/Commodity;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/databaseengine/model/Commodity;", "<init>", "()V", "databaseengine_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<Commodity> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Commodity createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Commodity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Commodity[] newArray(int size) {
            return new Commodity[size];
        }
    }

    public Commodity(@Nullable Price price, int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.price = price;
        this.skuId = i;
        this.skuName = str;
        this.spuName = str2;
        this.url = str3;
    }

    public static /* synthetic */ Commodity copy$default(Commodity commodity, Price price, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            price = commodity.price;
        }
        if ((i2 & 2) != 0) {
            i = commodity.skuId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = commodity.skuName;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = commodity.spuName;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = commodity.url;
        }
        return commodity.copy(price, i3, str4, str5, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSkuName() {
        return this.skuName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpuName() {
        return this.spuName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final Commodity copy(@Nullable Price price, int skuId, @Nullable String skuName, @Nullable String spuName, @Nullable String url) {
        return new Commodity(price, skuId, skuName, spuName, url);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Commodity)) {
            return false;
        }
        Commodity commodity = (Commodity) other;
        return Intrinsics.areEqual(this.price, commodity.price) && this.skuId == commodity.skuId && Intrinsics.areEqual(this.skuName, commodity.skuName) && Intrinsics.areEqual(this.spuName, commodity.spuName) && Intrinsics.areEqual(this.url, commodity.url);
    }

    @Nullable
    public final Price getPrice() {
        return this.price;
    }

    public final int getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final String getSkuName() {
        return this.skuName;
    }

    @Nullable
    public final String getSpuName() {
        return this.spuName;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Price price = this.price;
        int iHashCode = (((price == null ? 0 : price.hashCode()) * 31) + Integer.hashCode(this.skuId)) * 31;
        String str = this.skuName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spuName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Commodity(price=" + this.price + ", skuId=" + this.skuId + ", skuName=" + this.skuName + ", spuName=" + this.spuName + ", url=" + this.url + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.price, flags);
        parcel.writeInt(this.skuId);
        parcel.writeString(this.skuName);
        parcel.writeString(this.spuName);
        parcel.writeString(this.url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Commodity(@NotNull Parcel parcel) {
        this((Price) parcel.readParcelable(Price.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
