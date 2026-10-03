package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006+"}, d2 = {"Lcom/heytap/databaseengine/model/Price;", "Landroid/os/Parcelable;", "buyPrice", "", "currencyTag", "disCount", "marketPrice", "originalPrice", "prefix", SensorsBean.PRICE, "suffix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuyPrice", "()Ljava/lang/String;", "getCurrencyTag", "getDisCount", "getMarketPrice", "getOriginalPrice", "getPrefix", "getPrice", "getSuffix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Price implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Price> CREATOR = new a();

    @Nullable
    private final String buyPrice;

    @Nullable
    private final String currencyTag;

    @Nullable
    private final String disCount;

    @Nullable
    private final String marketPrice;

    @Nullable
    private final String originalPrice;

    @Nullable
    private final String prefix;

    @Nullable
    private final String price;

    @Nullable
    private final String suffix;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Price> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Price createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Price[] newArray(int i) {
            return new Price[i];
        }
    }

    public Price(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.buyPrice = str;
        this.currencyTag = str2;
        this.disCount = str3;
        this.marketPrice = str4;
        this.originalPrice = str5;
        this.prefix = str6;
        this.price = str7;
        this.suffix = str8;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBuyPrice() {
        return this.buyPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisCount() {
        return this.disCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    public final Price copy(@Nullable String buyPrice, @Nullable String currencyTag, @Nullable String disCount, @Nullable String marketPrice, @Nullable String originalPrice, @Nullable String prefix, @Nullable String price, @Nullable String suffix) {
        return new Price(buyPrice, currencyTag, disCount, marketPrice, originalPrice, prefix, price, suffix);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return Intrinsics.areEqual(this.buyPrice, price.buyPrice) && Intrinsics.areEqual(this.currencyTag, price.currencyTag) && Intrinsics.areEqual(this.disCount, price.disCount) && Intrinsics.areEqual(this.marketPrice, price.marketPrice) && Intrinsics.areEqual(this.originalPrice, price.originalPrice) && Intrinsics.areEqual(this.prefix, price.prefix) && Intrinsics.areEqual(this.price, price.price) && Intrinsics.areEqual(this.suffix, price.suffix);
    }

    @Nullable
    public final String getBuyPrice() {
        return this.buyPrice;
    }

    @Nullable
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @Nullable
    public final String getDisCount() {
        return this.disCount;
    }

    @Nullable
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    public final String getPrefix() {
        return this.prefix;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        String str = this.buyPrice;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disCount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketPrice;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originalPrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.prefix;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.price;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.suffix;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Price(buyPrice=" + this.buyPrice + ", currencyTag=" + this.currencyTag + ", disCount=" + this.disCount + ", marketPrice=" + this.marketPrice + ", originalPrice=" + this.originalPrice + ", prefix=" + this.prefix + ", price=" + this.price + ", suffix=" + this.suffix + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.buyPrice);
        parcel.writeString(this.currencyTag);
        parcel.writeString(this.disCount);
        parcel.writeString(this.marketPrice);
        parcel.writeString(this.originalPrice);
        parcel.writeString(this.prefix);
        parcel.writeString(this.price);
        parcel.writeString(this.suffix);
    }
}
