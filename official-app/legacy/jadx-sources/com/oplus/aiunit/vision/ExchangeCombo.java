package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.esim.R$string;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lu6, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J{\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b#\u0010.\"\u0004\b$\u0010/¨\u00062"}, d2 = {"Lcom/oplus/aiunit/vision/lu6;", "", "", b2n.g, "Landroid/content/Context;", "context", b2n.f, "comboDesc", "name", SensorsBean.PRICE, "", "comboSize", "id", "comboType", "discount", "difference", "discountPrice", "signPartnerOrder", "", "selected", "a", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getComboDesc", "()Ljava/lang/String;", "b", "d", "c", "getPrice", "I", "getComboSize", "()I", MapSchema.FIELD_NAME_ENTRY, "f", "getComboType", "getDiscount", "getDifference", "i", "getDiscountPrice", "j", "getSignPartnerOrder", MapSchema.FIELD_NAME_KEY, "Z", "()Z", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ExchangeCombo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("comboDesc")
    @NotNull
    private final String comboDesc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("comboName")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("comboPrice")
    @NotNull
    private final String price;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("comboSize")
    private final int comboSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("comboThirdId")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("comboType")
    private final int comboType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("discount")
    private final int discount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("difference")
    @NotNull
    private final String difference;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("discountPrice")
    @Nullable
    private final String discountPrice;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("signPartnerOrder")
    @Nullable
    private final String signPartnerOrder;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public boolean selected;

    public ExchangeCombo(@NotNull String comboDesc, @NotNull String name, @NotNull String price, int i, @NotNull String id, int i2, int i3, @NotNull String difference, @Nullable String str, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(comboDesc, "comboDesc");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(difference, "difference");
        this.comboDesc = comboDesc;
        this.name = name;
        this.price = price;
        this.comboSize = i;
        this.id = id;
        this.comboType = i2;
        this.discount = i3;
        this.difference = difference;
        this.discountPrice = str;
        this.signPartnerOrder = str2;
        this.selected = z;
    }

    @NotNull
    public final ExchangeCombo a(@NotNull String comboDesc, @NotNull String name, @NotNull String price, int comboSize, @NotNull String id, int comboType, int discount, @NotNull String difference, @Nullable String discountPrice, @Nullable String signPartnerOrder, boolean selected) {
        Intrinsics.checkNotNullParameter(comboDesc, "comboDesc");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(difference, "difference");
        return new ExchangeCombo(comboDesc, name, price, comboSize, id, comboType, discount, difference, discountPrice, signPartnerOrder, selected);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeCombo)) {
            return false;
        }
        ExchangeCombo exchangeCombo = (ExchangeCombo) other;
        return Intrinsics.areEqual(this.comboDesc, exchangeCombo.comboDesc) && Intrinsics.areEqual(this.name, exchangeCombo.name) && Intrinsics.areEqual(this.price, exchangeCombo.price) && this.comboSize == exchangeCombo.comboSize && Intrinsics.areEqual(this.id, exchangeCombo.id) && this.comboType == exchangeCombo.comboType && this.discount == exchangeCombo.discount && Intrinsics.areEqual(this.difference, exchangeCombo.difference) && Intrinsics.areEqual(this.discountPrice, exchangeCombo.discountPrice) && Intrinsics.areEqual(this.signPartnerOrder, exchangeCombo.signPartnerOrder) && this.selected == exchangeCombo.selected;
    }

    public final void f(boolean z) {
        this.selected = z;
    }

    @NotNull
    public final String g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.esim_redtea_user_combo_manager_change_desc, this.price);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…nager_change_desc, price)");
        return string;
    }

    @NotNull
    public final String h() {
        String str = this.discountPrice;
        return str == null ? this.price : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.comboDesc.hashCode() * 31) + this.name.hashCode()) * 31) + this.price.hashCode()) * 31) + Integer.hashCode(this.comboSize)) * 31) + this.id.hashCode()) * 31) + Integer.hashCode(this.comboType)) * 31) + Integer.hashCode(this.discount)) * 31) + this.difference.hashCode()) * 31;
        String str = this.discountPrice;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.signPartnerOrder;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.selected;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode3 + r3;
    }

    @NotNull
    public String toString() {
        return "ExchangeCombo(comboDesc=" + this.comboDesc + ", name=" + this.name + ", price=" + this.price + ", comboSize=" + this.comboSize + ", id=" + this.id + ", comboType=" + this.comboType + ", discount=" + this.discount + ", difference=" + this.difference + ", discountPrice=" + this.discountPrice + ", signPartnerOrder=" + this.signPartnerOrder + ", selected=" + this.selected + ")";
    }
}
