package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jz\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011¨\u00066"}, d2 = {"Lcom/heytap/store/base/core/data/PriceVoDTO;", "", "skuId", "", "buyPrice", "", "currencyTag", "disCount", "marketPrice", "originalPrice", "prefix", SensorsBean.PRICE, "suffix", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuyPrice", "()Ljava/lang/String;", "setBuyPrice", "(Ljava/lang/String;)V", "getCurrencyTag", "setCurrencyTag", "getDisCount", "setDisCount", "getMarketPrice", "setMarketPrice", "getOriginalPrice", "setOriginalPrice", "getPrefix", "setPrefix", "getPrice", "setPrice", "getSkuId", "()Ljava/lang/Long;", "setSkuId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSuffix", "setSuffix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/base/core/data/PriceVoDTO;", "equals", "", "other", "hashCode", "", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PriceVoDTO {

    @Nullable
    private String buyPrice;

    @Nullable
    private String currencyTag;

    @Nullable
    private String disCount;

    @Nullable
    private String marketPrice;

    @Nullable
    private String originalPrice;

    @Nullable
    private String prefix;

    @Nullable
    private String price;

    @Nullable
    private Long skuId;

    @Nullable
    private String suffix;

    public PriceVoDTO(@Nullable Long l2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.skuId = l2;
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
    public final Long getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBuyPrice() {
        return this.buyPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisCount() {
        return this.disCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    public final PriceVoDTO copy(@Nullable Long skuId, @Nullable String buyPrice, @Nullable String currencyTag, @Nullable String disCount, @Nullable String marketPrice, @Nullable String originalPrice, @Nullable String prefix, @Nullable String price, @Nullable String suffix) {
        return new PriceVoDTO(skuId, buyPrice, currencyTag, disCount, marketPrice, originalPrice, prefix, price, suffix);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceVoDTO)) {
            return false;
        }
        PriceVoDTO priceVoDTO = (PriceVoDTO) other;
        return Intrinsics.areEqual(this.skuId, priceVoDTO.skuId) && Intrinsics.areEqual(this.buyPrice, priceVoDTO.buyPrice) && Intrinsics.areEqual(this.currencyTag, priceVoDTO.currencyTag) && Intrinsics.areEqual(this.disCount, priceVoDTO.disCount) && Intrinsics.areEqual(this.marketPrice, priceVoDTO.marketPrice) && Intrinsics.areEqual(this.originalPrice, priceVoDTO.originalPrice) && Intrinsics.areEqual(this.prefix, priceVoDTO.prefix) && Intrinsics.areEqual(this.price, priceVoDTO.price) && Intrinsics.areEqual(this.suffix, priceVoDTO.suffix);
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
    public final Long getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        Long l2 = this.skuId;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.buyPrice;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyTag;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disCount;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketPrice;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originalPrice;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.prefix;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.price;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.suffix;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setBuyPrice(@Nullable String str) {
        this.buyPrice = str;
    }

    public final void setCurrencyTag(@Nullable String str) {
        this.currencyTag = str;
    }

    public final void setDisCount(@Nullable String str) {
        this.disCount = str;
    }

    public final void setMarketPrice(@Nullable String str) {
        this.marketPrice = str;
    }

    public final void setOriginalPrice(@Nullable String str) {
        this.originalPrice = str;
    }

    public final void setPrefix(@Nullable String str) {
        this.prefix = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setSkuId(@Nullable Long l2) {
        this.skuId = l2;
    }

    public final void setSuffix(@Nullable String str) {
        this.suffix = str;
    }

    @NotNull
    public String toString() {
        return "PriceVoDTO(skuId=" + this.skuId + ", buyPrice=" + ((Object) this.buyPrice) + ", currencyTag=" + ((Object) this.currencyTag) + ", disCount=" + ((Object) this.disCount) + ", marketPrice=" + ((Object) this.marketPrice) + ", originalPrice=" + ((Object) this.originalPrice) + ", prefix=" + ((Object) this.prefix) + ", price=" + ((Object) this.price) + ", suffix=" + ((Object) this.suffix) + ')';
    }
}
