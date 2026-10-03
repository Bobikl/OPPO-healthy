package com.heytap.health.health_archives.bean;

import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003JK\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006*"}, d2 = {"Lcom/heytap/health/health_archives/bean/BodySystemBean;", "", "code", "", "name", "maleOrganSelected", "Landroid/graphics/drawable/Drawable;", "femaleOrganSelected", "abnormalCount", "", "typeNum", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;II)V", "getAbnormalCount", "()I", "setAbnormalCount", "(I)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getFemaleOrganSelected", "()Landroid/graphics/drawable/Drawable;", "setFemaleOrganSelected", "(Landroid/graphics/drawable/Drawable;)V", "getMaleOrganSelected", "setMaleOrganSelected", "getName", "setName", "getTypeNum", "setTypeNum", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BodySystemBean {
    private int abnormalCount;

    @NotNull
    private String code;

    @Nullable
    private Drawable femaleOrganSelected;

    @Nullable
    private Drawable maleOrganSelected;

    @Nullable
    private String name;
    private int typeNum;

    public BodySystemBean(@NotNull String code, @Nullable String str, @Nullable Drawable drawable, @Nullable Drawable drawable2, int i, int i2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.name = str;
        this.maleOrganSelected = drawable;
        this.femaleOrganSelected = drawable2;
        this.abnormalCount = i;
        this.typeNum = i2;
    }

    public static /* synthetic */ BodySystemBean copy$default(BodySystemBean bodySystemBean, String str, String str2, Drawable drawable, Drawable drawable2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bodySystemBean.code;
        }
        if ((i3 & 2) != 0) {
            str2 = bodySystemBean.name;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            drawable = bodySystemBean.maleOrganSelected;
        }
        Drawable drawable3 = drawable;
        if ((i3 & 8) != 0) {
            drawable2 = bodySystemBean.femaleOrganSelected;
        }
        Drawable drawable4 = drawable2;
        if ((i3 & 16) != 0) {
            i = bodySystemBean.abnormalCount;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = bodySystemBean.typeNum;
        }
        return bodySystemBean.copy(str, str3, drawable3, drawable4, i4, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Drawable getMaleOrganSelected() {
        return this.maleOrganSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Drawable getFemaleOrganSelected() {
        return this.femaleOrganSelected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAbnormalCount() {
        return this.abnormalCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTypeNum() {
        return this.typeNum;
    }

    @NotNull
    public final BodySystemBean copy(@NotNull String code, @Nullable String name, @Nullable Drawable maleOrganSelected, @Nullable Drawable femaleOrganSelected, int abnormalCount, int typeNum) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new BodySystemBean(code, name, maleOrganSelected, femaleOrganSelected, abnormalCount, typeNum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodySystemBean)) {
            return false;
        }
        BodySystemBean bodySystemBean = (BodySystemBean) other;
        return Intrinsics.areEqual(this.code, bodySystemBean.code) && Intrinsics.areEqual(this.name, bodySystemBean.name) && Intrinsics.areEqual(this.maleOrganSelected, bodySystemBean.maleOrganSelected) && Intrinsics.areEqual(this.femaleOrganSelected, bodySystemBean.femaleOrganSelected) && this.abnormalCount == bodySystemBean.abnormalCount && this.typeNum == bodySystemBean.typeNum;
    }

    public final int getAbnormalCount() {
        return this.abnormalCount;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final Drawable getFemaleOrganSelected() {
        return this.femaleOrganSelected;
    }

    @Nullable
    public final Drawable getMaleOrganSelected() {
        return this.maleOrganSelected;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getTypeNum() {
        return this.typeNum;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.maleOrganSelected;
        int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.femaleOrganSelected;
        return ((((iHashCode3 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + Integer.hashCode(this.abnormalCount)) * 31) + Integer.hashCode(this.typeNum);
    }

    public final void setAbnormalCount(int i) {
        this.abnormalCount = i;
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setFemaleOrganSelected(@Nullable Drawable drawable) {
        this.femaleOrganSelected = drawable;
    }

    public final void setMaleOrganSelected(@Nullable Drawable drawable) {
        this.maleOrganSelected = drawable;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTypeNum(int i) {
        this.typeNum = i;
    }

    @NotNull
    public String toString() {
        return "BodySystemBean(code=" + this.code + ", name=" + this.name + ", maleOrganSelected=" + this.maleOrganSelected + ", femaleOrganSelected=" + this.femaleOrganSelected + ", abnormalCount=" + this.abnormalCount + ", typeNum=" + this.typeNum + ")";
    }

    public /* synthetic */ BodySystemBean(String str, String str2, Drawable drawable, Drawable drawable2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? null : drawable, (i3 & 8) != 0 ? null : drawable2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }
}
