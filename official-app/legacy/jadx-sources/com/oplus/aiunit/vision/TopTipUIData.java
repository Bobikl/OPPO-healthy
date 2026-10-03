package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.z1k, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b \u0010\u0014R$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\"\u0010\u0014R$\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/z1k;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "f", "()I", "setType", "(I)V", "type", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setIconResourceId", "(Ljava/lang/Integer;)V", "iconResourceId", "c", MapSchema.FIELD_NAME_ENTRY, "setTitleTextId", "titleTextId", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "setContentTextStr", "(Ljava/lang/String;)V", "contentTextStr", "setMNegativeTextId", "mNegativeTextId", "setMPositiveTextId", "mPositiveTextId", b2n.f, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", b2n.g, "(Ljava/lang/Boolean;)V", "isShow", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "home_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TopTipUIData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer iconResourceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Integer titleTextId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public String contentTextStr;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Integer mNegativeTextId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer mPositiveTextId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public Boolean isShow;

    public TopTipUIData() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentTextStr() {
        return this.contentTextStr;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getIconResourceId() {
        return this.iconResourceId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMNegativeTextId() {
        return this.mNegativeTextId;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getMPositiveTextId() {
        return this.mPositiveTextId;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getTitleTextId() {
        return this.titleTextId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopTipUIData)) {
            return false;
        }
        TopTipUIData topTipUIData = (TopTipUIData) other;
        return this.type == topTipUIData.type && Intrinsics.areEqual(this.iconResourceId, topTipUIData.iconResourceId) && Intrinsics.areEqual(this.titleTextId, topTipUIData.titleTextId) && Intrinsics.areEqual(this.contentTextStr, topTipUIData.contentTextStr) && Intrinsics.areEqual(this.mNegativeTextId, topTipUIData.mNegativeTextId) && Intrinsics.areEqual(this.mPositiveTextId, topTipUIData.mPositiveTextId) && Intrinsics.areEqual(this.isShow, topTipUIData.isShow);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIsShow() {
        return this.isShow;
    }

    public final void h(@Nullable Boolean bool) {
        this.isShow = bool;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        Integer num = this.iconResourceId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.titleTextId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.contentTextStr;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.mNegativeTextId;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.mPositiveTextId;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.isShow;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TopTipUIData(type=" + this.type + ", iconResourceId=" + this.iconResourceId + ", titleTextId=" + this.titleTextId + ", contentTextStr=" + this.contentTextStr + ", mNegativeTextId=" + this.mNegativeTextId + ", mPositiveTextId=" + this.mPositiveTextId + ", isShow=" + this.isShow + ")";
    }

    public TopTipUIData(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool) {
        this.type = i;
        this.iconResourceId = num;
        this.titleTextId = num2;
        this.contentTextStr = str;
        this.mNegativeTextId = num3;
        this.mPositiveTextId = num4;
        this.isShow = bool;
    }

    public /* synthetic */ TopTipUIData(int i, Integer num, Integer num2, String str, Integer num3, Integer num4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num3, (i2 & 32) != 0 ? null : num4, (i2 & 64) == 0 ? bool : null);
    }
}
