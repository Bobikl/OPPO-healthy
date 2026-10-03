package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lcom/heytap/store/homemodule/data/HotZoneGifEntity;", "", "link", "", "xPercent", "", "yPercent", "wPercent", "(Ljava/lang/String;FFF)V", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "getWPercent", "()F", "setWPercent", "(F)V", "getXPercent", "setXPercent", "getYPercent", "setYPercent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HotZoneGifEntity {

    @NotNull
    private String link;
    private float wPercent;
    private float xPercent;
    private float yPercent;

    public HotZoneGifEntity() {
        this(null, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ HotZoneGifEntity copy$default(HotZoneGifEntity hotZoneGifEntity, String str, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotZoneGifEntity.link;
        }
        if ((i & 2) != 0) {
            f = hotZoneGifEntity.xPercent;
        }
        if ((i & 4) != 0) {
            f2 = hotZoneGifEntity.yPercent;
        }
        if ((i & 8) != 0) {
            f3 = hotZoneGifEntity.wPercent;
        }
        return hotZoneGifEntity.copy(str, f, f2, f3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getYPercent() {
        return this.yPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWPercent() {
        return this.wPercent;
    }

    @NotNull
    public final HotZoneGifEntity copy(@NotNull String link, float xPercent, float yPercent, float wPercent) {
        Intrinsics.checkNotNullParameter(link, "link");
        return new HotZoneGifEntity(link, xPercent, yPercent, wPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotZoneGifEntity)) {
            return false;
        }
        HotZoneGifEntity hotZoneGifEntity = (HotZoneGifEntity) other;
        return Intrinsics.areEqual(this.link, hotZoneGifEntity.link) && Intrinsics.areEqual((Object) Float.valueOf(this.xPercent), (Object) Float.valueOf(hotZoneGifEntity.xPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.yPercent), (Object) Float.valueOf(hotZoneGifEntity.yPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.wPercent), (Object) Float.valueOf(hotZoneGifEntity.wPercent));
    }

    @NotNull
    public final String getLink() {
        return this.link;
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
        return (((((this.link.hashCode() * 31) + Float.hashCode(this.xPercent)) * 31) + Float.hashCode(this.yPercent)) * 31) + Float.hashCode(this.wPercent);
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
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
        return "HotZoneGifEntity(link=" + this.link + ", xPercent=" + this.xPercent + ", yPercent=" + this.yPercent + ", wPercent=" + this.wPercent + ')';
    }

    public HotZoneGifEntity(@NotNull String link, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.link = link;
        this.xPercent = f;
        this.yPercent = f2;
        this.wPercent = f3;
    }

    public /* synthetic */ HotZoneGifEntity(String str, float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3);
    }
}
