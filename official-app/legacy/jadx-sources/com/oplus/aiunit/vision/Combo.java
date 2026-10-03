package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.nsc.utils.NSCHelper;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.zl3, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b:\u0010;J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0083\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0011HÖ\u0001J\u0013\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0016\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b3\u0010,R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b(\u0010#R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b&\u00106R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\b1\u00108\"\u0004\b4\u00109¨\u0006<"}, d2 = {"Lcom/oplus/aiunit/vision/zl3;", "", "", "j", "", LogFieldKey.MESSAGE_KEY, "i", LogFieldKey.PROCESS_NAME_KEY, "o", "Landroid/content/Context;", "context", "n", LogFieldKey.LEVEL_KEY, "id", DBHealthReviewPlan.DESC, "name", SensorsBean.PRICE, "", "comboSize", "comboType", "", "expireTime", "month", "discount", "discountPrice", "", "difference", "selected", "a", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "b", "getDesc", "c", "f", "d", b2n.f, "I", "getComboSize", "()I", "getComboType", "J", "getExpireTime", "()J", b2n.g, "getMonth", "getDiscount", MapSchema.FIELD_NAME_KEY, UserInfo.SEX_FEMALE, "()F", "Z", "()Z", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJILjava/lang/String;FZ)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Combo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("comboThirdId")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("comboDesc")
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("comboName")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("comboPrice")
    @NotNull
    private final String price;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("comboSize")
    private final int comboSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("comboType")
    private final int comboType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("disPlayExpireTime")
    private final long expireTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("month")
    private final long month;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("discount")
    private final int discount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("discountPrice")
    @Nullable
    private final String discountPrice;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("difference")
    private final float difference;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean selected;

    public Combo(@NotNull String id, @NotNull String desc, @NotNull String name, @NotNull String price, int i, int i2, long j2, long j3, int i3, @Nullable String str, float f, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = id;
        this.desc = desc;
        this.name = name;
        this.price = price;
        this.comboSize = i;
        this.comboType = i2;
        this.expireTime = j2;
        this.month = j3;
        this.discount = i3;
        this.discountPrice = str;
        this.difference = f;
        this.selected = z;
    }

    @NotNull
    public final Combo a(@NotNull String id, @NotNull String desc, @NotNull String name, @NotNull String price, int comboSize, int comboType, long expireTime, long month, int discount, @Nullable String discountPrice, float difference, boolean selected) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        return new Combo(id, desc, name, price, comboSize, comboType, expireTime, month, discount, discountPrice, difference, selected);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getDifference() {
        return this.difference;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDiscountPrice() {
        return this.discountPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Combo)) {
            return false;
        }
        Combo combo = (Combo) other;
        return Intrinsics.areEqual(this.id, combo.id) && Intrinsics.areEqual(this.desc, combo.desc) && Intrinsics.areEqual(this.name, combo.name) && Intrinsics.areEqual(this.price, combo.price) && this.comboSize == combo.comboSize && this.comboType == combo.comboType && this.expireTime == combo.expireTime && this.month == combo.month && this.discount == combo.discount && Intrinsics.areEqual(this.discountPrice, combo.discountPrice) && Float.compare(this.difference, combo.difference) == 0 && this.selected == combo.selected;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.desc.hashCode()) * 31) + this.name.hashCode()) * 31) + this.price.hashCode()) * 31) + Integer.hashCode(this.comboSize)) * 31) + Integer.hashCode(this.comboType)) * 31) + Long.hashCode(this.expireTime)) * 31) + Long.hashCode(this.month)) * 31) + Integer.hashCode(this.discount)) * 31;
        String str = this.discountPrice;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.difference)) * 31;
        boolean z = this.selected;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode2 + r3;
    }

    public final boolean i() {
        return 1 == this.discount;
    }

    public final boolean j() {
        return this.comboType == 1;
    }

    public final void k(boolean z) {
        this.selected = z;
    }

    @NotNull
    public final String l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.esim_redtea_user_combo_manager_buy_desc, m(), NSCHelper.INSTANCE.h(this.expireTime), this.price);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …ime),\n        price\n    )");
        return string;
    }

    @NotNull
    public final String m() {
        return NSCHelper.INSTANCE.c(Integer.valueOf(RangesKt___RangesKt.coerceAtLeast(this.comboSize, 0)));
    }

    @NotNull
    public final String n(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (j()) {
            String string = context.getString(R$string.esim_redtea_user_combo_detail_package_desc, m(), NSCHelper.INSTANCE.h(this.expireTime));
            Intrinsics.checkNotNullExpressionValue(string, "{\n        context.getStr…nthDay(expireTime))\n    }");
            return string;
        }
        String string2 = context.getString(R$string.esim_redtea_user_combo_manager_auto_pay_desc, this.price);
        Intrinsics.checkNotNullExpressionValue(string2, "{\n        context.getStr…to_pay_desc, price)\n    }");
        return string2;
    }

    @NotNull
    public final String o() {
        return NSCHelper.INSTANCE.i(this.expireTime);
    }

    @NotNull
    public final String p() {
        String str;
        return (!i() || (str = this.discountPrice) == null) ? this.price : str;
    }

    @NotNull
    public String toString() {
        return "Combo(id=" + this.id + ", desc=" + this.desc + ", name=" + this.name + ", price=" + this.price + ", comboSize=" + this.comboSize + ", comboType=" + this.comboType + ", expireTime=" + this.expireTime + ", month=" + this.month + ", discount=" + this.discount + ", discountPrice=" + this.discountPrice + ", difference=" + this.difference + ", selected=" + this.selected + ")";
    }
}
