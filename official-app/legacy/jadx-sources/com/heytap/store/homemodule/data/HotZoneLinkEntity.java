package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006*"}, d2 = {"Lcom/heytap/store/homemodule/data/HotZoneLinkEntity;", "", "type", "", "value", "", "xPercent", "", "yPercent", "wPercent", "hPercent", "(ILjava/lang/String;FFFF)V", "getHPercent", "()F", "setHPercent", "(F)V", "getType", "()I", "setType", "(I)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getWPercent", "setWPercent", "getXPercent", "setXPercent", "getYPercent", "setYPercent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HotZoneLinkEntity {
    private float hPercent;
    private int type;

    @NotNull
    private String value;
    private float wPercent;
    private float xPercent;
    private float yPercent;

    public HotZoneLinkEntity(int i, @NotNull String value, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = i;
        this.value = value;
        this.xPercent = f;
        this.yPercent = f2;
        this.wPercent = f3;
        this.hPercent = f4;
    }

    public static /* synthetic */ HotZoneLinkEntity copy$default(HotZoneLinkEntity hotZoneLinkEntity, int i, String str, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hotZoneLinkEntity.type;
        }
        if ((i2 & 2) != 0) {
            str = hotZoneLinkEntity.value;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            f = hotZoneLinkEntity.xPercent;
        }
        float f5 = f;
        if ((i2 & 8) != 0) {
            f2 = hotZoneLinkEntity.yPercent;
        }
        float f6 = f2;
        if ((i2 & 16) != 0) {
            f3 = hotZoneLinkEntity.wPercent;
        }
        float f7 = f3;
        if ((i2 & 32) != 0) {
            f4 = hotZoneLinkEntity.hPercent;
        }
        return hotZoneLinkEntity.copy(i, str2, f5, f6, f7, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getYPercent() {
        return this.yPercent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getWPercent() {
        return this.wPercent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getHPercent() {
        return this.hPercent;
    }

    @NotNull
    public final HotZoneLinkEntity copy(int type, @NotNull String value, float xPercent, float yPercent, float wPercent, float hPercent) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new HotZoneLinkEntity(type, value, xPercent, yPercent, wPercent, hPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotZoneLinkEntity)) {
            return false;
        }
        HotZoneLinkEntity hotZoneLinkEntity = (HotZoneLinkEntity) other;
        return this.type == hotZoneLinkEntity.type && Intrinsics.areEqual(this.value, hotZoneLinkEntity.value) && Intrinsics.areEqual((Object) Float.valueOf(this.xPercent), (Object) Float.valueOf(hotZoneLinkEntity.xPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.yPercent), (Object) Float.valueOf(hotZoneLinkEntity.yPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.wPercent), (Object) Float.valueOf(hotZoneLinkEntity.wPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.hPercent), (Object) Float.valueOf(hotZoneLinkEntity.hPercent));
    }

    public final float getHPercent() {
        return this.hPercent;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final float getWPercent() {
        return this.wPercent;
    }

    public final float getXPercent() {
        return this.xPercent;
    }

    public final float getYPercent() {
        return this.yPercent;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.type) * 31) + this.value.hashCode()) * 31) + Float.hashCode(this.xPercent)) * 31) + Float.hashCode(this.yPercent)) * 31) + Float.hashCode(this.wPercent)) * 31) + Float.hashCode(this.hPercent);
    }

    public final void setHPercent(float f) {
        this.hPercent = f;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    public final void setWPercent(float f) {
        this.wPercent = f;
    }

    public final void setXPercent(float f) {
        this.xPercent = f;
    }

    public final void setYPercent(float f) {
        this.yPercent = f;
    }

    @NotNull
    public String toString() {
        return "HotZoneLinkEntity(type=" + this.type + ", value=" + this.value + ", xPercent=" + this.xPercent + ", yPercent=" + this.yPercent + ", wPercent=" + this.wPercent + ", hPercent=" + this.hPercent + ')';
    }

    public /* synthetic */ HotZoneLinkEntity(int i, String str, float f, float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f2, (i2 & 16) != 0 ? 0.0f : f3, (i2 & 32) != 0 ? 0.0f : f4);
    }
}
