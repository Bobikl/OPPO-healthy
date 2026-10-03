package com.heytap.store.homemodule.data.blackcard;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/heytap/store/homemodule/data/blackcard/BtnInfoVo;", "", "currencyTag", "", "originalPrice", SensorsBean.PRICE, "btnText", "skuId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBtnText", "()Ljava/lang/String;", "setBtnText", "(Ljava/lang/String;)V", "getCurrencyTag", "setCurrencyTag", "getOriginalPrice", "setOriginalPrice", "getPrice", "setPrice", "getSkuId", "()J", "setSkuId", "(J)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BtnInfoVo {

    @NotNull
    private String btnText;

    @NotNull
    private String currencyTag;

    @NotNull
    private String originalPrice;

    @NotNull
    private String price;
    private long skuId;

    public BtnInfoVo(@NotNull String currencyTag, @NotNull String originalPrice, @NotNull String price, @NotNull String btnText, long j2) {
        Intrinsics.checkNotNullParameter(currencyTag, "currencyTag");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        this.currencyTag = currencyTag;
        this.originalPrice = originalPrice;
        this.price = price;
        this.btnText = btnText;
        this.skuId = j2;
    }

    public static /* synthetic */ BtnInfoVo copy$default(BtnInfoVo btnInfoVo, String str, String str2, String str3, String str4, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = btnInfoVo.currencyTag;
        }
        if ((i & 2) != 0) {
            str2 = btnInfoVo.originalPrice;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = btnInfoVo.price;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = btnInfoVo.btnText;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j2 = btnInfoVo.skuId;
        }
        return btnInfoVo.copy(str, str5, str6, str7, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBtnText() {
        return this.btnText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSkuId() {
        return this.skuId;
    }

    @NotNull
    public final BtnInfoVo copy(@NotNull String currencyTag, @NotNull String originalPrice, @NotNull String price, @NotNull String btnText, long skuId) {
        Intrinsics.checkNotNullParameter(currencyTag, "currencyTag");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        return new BtnInfoVo(currencyTag, originalPrice, price, btnText, skuId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BtnInfoVo)) {
            return false;
        }
        BtnInfoVo btnInfoVo = (BtnInfoVo) other;
        return Intrinsics.areEqual(this.currencyTag, btnInfoVo.currencyTag) && Intrinsics.areEqual(this.originalPrice, btnInfoVo.originalPrice) && Intrinsics.areEqual(this.price, btnInfoVo.price) && Intrinsics.areEqual(this.btnText, btnInfoVo.btnText) && this.skuId == btnInfoVo.skuId;
    }

    @NotNull
    public final String getBtnText() {
        return this.btnText;
    }

    @NotNull
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @NotNull
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return (((((((this.currencyTag.hashCode() * 31) + this.originalPrice.hashCode()) * 31) + this.price.hashCode()) * 31) + this.btnText.hashCode()) * 31) + Long.hashCode(this.skuId);
    }

    public final void setBtnText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.btnText = str;
    }

    public final void setCurrencyTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currencyTag = str;
    }

    public final void setOriginalPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalPrice = str;
    }

    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public final void setSkuId(long j2) {
        this.skuId = j2;
    }

    @NotNull
    public String toString() {
        return "BtnInfoVo(currencyTag=" + this.currencyTag + ", originalPrice=" + this.originalPrice + ", price=" + this.price + ", btnText=" + this.btnText + ", skuId=" + this.skuId + ')';
    }
}
