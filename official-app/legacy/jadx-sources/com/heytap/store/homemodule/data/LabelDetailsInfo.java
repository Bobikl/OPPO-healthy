package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018¨\u00065"}, d2 = {"Lcom/heytap/store/homemodule/data/LabelDetailsInfo;", "", "id", "", "beginAt", "", DebugModeEntity.KEY_END_AT, "iconPicUrl", "", "iconTextColor", "iconType", "isTop", "name", "pigment", "(IJJLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getBeginAt", "()J", "setBeginAt", "(J)V", "getEndAt", "setEndAt", "getIconPicUrl", "()Ljava/lang/String;", "setIconPicUrl", "(Ljava/lang/String;)V", "getIconTextColor", "setIconTextColor", "getIconType", "()I", "setIconType", "(I)V", "getId", "setId", "setTop", "getName", "setName", "getPigment", "setPigment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LabelDetailsInfo {
    private long beginAt;
    private long endAt;

    @NotNull
    private String iconPicUrl;

    @NotNull
    private String iconTextColor;
    private int iconType;
    private int id;
    private int isTop;

    @NotNull
    private String name;

    @NotNull
    private String pigment;

    public LabelDetailsInfo() {
        this(0, 0L, 0L, null, null, 0, 0, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBeginAt() {
        return this.beginAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndAt() {
        return this.endAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconPicUrl() {
        return this.iconPicUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconTextColor() {
        return this.iconTextColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getIsTop() {
        return this.isTop;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPigment() {
        return this.pigment;
    }

    @NotNull
    public final LabelDetailsInfo copy(int id, long beginAt, long endAt, @NotNull String iconPicUrl, @NotNull String iconTextColor, int iconType, int isTop, @NotNull String name, @NotNull String pigment) {
        Intrinsics.checkNotNullParameter(iconPicUrl, "iconPicUrl");
        Intrinsics.checkNotNullParameter(iconTextColor, "iconTextColor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pigment, "pigment");
        return new LabelDetailsInfo(id, beginAt, endAt, iconPicUrl, iconTextColor, iconType, isTop, name, pigment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelDetailsInfo)) {
            return false;
        }
        LabelDetailsInfo labelDetailsInfo = (LabelDetailsInfo) other;
        return this.id == labelDetailsInfo.id && this.beginAt == labelDetailsInfo.beginAt && this.endAt == labelDetailsInfo.endAt && Intrinsics.areEqual(this.iconPicUrl, labelDetailsInfo.iconPicUrl) && Intrinsics.areEqual(this.iconTextColor, labelDetailsInfo.iconTextColor) && this.iconType == labelDetailsInfo.iconType && this.isTop == labelDetailsInfo.isTop && Intrinsics.areEqual(this.name, labelDetailsInfo.name) && Intrinsics.areEqual(this.pigment, labelDetailsInfo.pigment);
    }

    public final long getBeginAt() {
        return this.beginAt;
    }

    public final long getEndAt() {
        return this.endAt;
    }

    @NotNull
    public final String getIconPicUrl() {
        return this.iconPicUrl;
    }

    @NotNull
    public final String getIconTextColor() {
        return this.iconTextColor;
    }

    public final int getIconType() {
        return this.iconType;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPigment() {
        return this.pigment;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.beginAt)) * 31) + Long.hashCode(this.endAt)) * 31) + this.iconPicUrl.hashCode()) * 31) + this.iconTextColor.hashCode()) * 31) + Integer.hashCode(this.iconType)) * 31) + Integer.hashCode(this.isTop)) * 31) + this.name.hashCode()) * 31) + this.pigment.hashCode();
    }

    public final int isTop() {
        return this.isTop;
    }

    public final void setBeginAt(long j2) {
        this.beginAt = j2;
    }

    public final void setEndAt(long j2) {
        this.endAt = j2;
    }

    public final void setIconPicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iconPicUrl = str;
    }

    public final void setIconTextColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iconTextColor = str;
    }

    public final void setIconType(int i) {
        this.iconType = i;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPigment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pigment = str;
    }

    public final void setTop(int i) {
        this.isTop = i;
    }

    @NotNull
    public String toString() {
        return "LabelDetailsInfo(id=" + this.id + ", beginAt=" + this.beginAt + ", endAt=" + this.endAt + ", iconPicUrl=" + this.iconPicUrl + ", iconTextColor=" + this.iconTextColor + ", iconType=" + this.iconType + ", isTop=" + this.isTop + ", name=" + this.name + ", pigment=" + this.pigment + ')';
    }

    public LabelDetailsInfo(int i, long j2, long j3, @NotNull String iconPicUrl, @NotNull String iconTextColor, int i2, int i3, @NotNull String name, @NotNull String pigment) {
        Intrinsics.checkNotNullParameter(iconPicUrl, "iconPicUrl");
        Intrinsics.checkNotNullParameter(iconTextColor, "iconTextColor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pigment, "pigment");
        this.id = i;
        this.beginAt = j2;
        this.endAt = j3;
        this.iconPicUrl = iconPicUrl;
        this.iconTextColor = iconTextColor;
        this.iconType = i2;
        this.isTop = i3;
        this.name = name;
        this.pigment = pigment;
    }

    public /* synthetic */ LabelDetailsInfo(int i, long j2, long j3, String str, String str2, int i2, int i3, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) == 0 ? j3 : 0L, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? -1 : i2, (i4 & 64) == 0 ? i3 : -1, (i4 & 128) != 0 ? "" : str3, (i4 & 256) == 0 ? str4 : "");
    }
}
