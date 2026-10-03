package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006#"}, d2 = {"Lcom/heytap/store/product_support/data/ProductCardActivity;", "", "activityInfo", "", "type", "", "logo", "color", "level", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getActivityInfo", "()Ljava/lang/String;", "setActivityInfo", "(Ljava/lang/String;)V", "getColor", "setColor", "getLevel", "()I", "setLevel", "(I)V", "getLogo", "setLogo", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ProductCardActivity {

    @NotNull
    private String activityInfo;

    @Nullable
    private String color;
    private int level;

    @Nullable
    private String logo;
    private int type;

    public ProductCardActivity() {
        this(null, 0, null, null, 0, 31, null);
    }

    public static /* synthetic */ ProductCardActivity copy$default(ProductCardActivity productCardActivity, String str, int i, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = productCardActivity.activityInfo;
        }
        if ((i3 & 2) != 0) {
            i = productCardActivity.type;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = productCardActivity.logo;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            str3 = productCardActivity.color;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = productCardActivity.level;
        }
        return productCardActivity.copy(str, i4, str4, str5, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final ProductCardActivity copy(@NotNull String activityInfo, int type, @Nullable String logo, @Nullable String color, int level) {
        Intrinsics.checkNotNullParameter(activityInfo, "activityInfo");
        return new ProductCardActivity(activityInfo, type, logo, color, level);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCardActivity)) {
            return false;
        }
        ProductCardActivity productCardActivity = (ProductCardActivity) other;
        return Intrinsics.areEqual(this.activityInfo, productCardActivity.activityInfo) && this.type == productCardActivity.type && Intrinsics.areEqual(this.logo, productCardActivity.logo) && Intrinsics.areEqual(this.color, productCardActivity.color) && this.level == productCardActivity.level;
    }

    @NotNull
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.activityInfo.hashCode() * 31) + Integer.hashCode(this.type)) * 31;
        String str = this.logo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.level);
    }

    public final void setActivityInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activityInfo = str;
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "ProductCardActivity(activityInfo=" + this.activityInfo + ", type=" + this.type + ", logo=" + ((Object) this.logo) + ", color=" + ((Object) this.color) + ", level=" + this.level + ')';
    }

    public ProductCardActivity(@NotNull String activityInfo, int i, @Nullable String str, @Nullable String str2, int i2) {
        Intrinsics.checkNotNullParameter(activityInfo, "activityInfo");
        this.activityInfo = activityInfo;
        this.type = i;
        this.logo = str;
        this.color = str2;
        this.level = i2;
    }

    public /* synthetic */ ProductCardActivity(String str, int i, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 2 : i2);
    }
}
