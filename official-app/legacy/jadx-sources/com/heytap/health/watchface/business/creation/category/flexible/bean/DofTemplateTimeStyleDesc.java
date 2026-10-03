package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import com.heytap.health.watchface.business.creation.category.video.VideoCustomPresenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/DofTemplateTimeStyleDesc;", "", "styleId", "", "timeColor", VideoCustomPresenter.INDEX_TIME_STYLE, "", "timePosition", "timeType", "(Ljava/lang/String;Ljava/lang/String;III)V", "getStyleId", "()Ljava/lang/String;", "getTimeColor", "getTimePosition", "()I", "getTimeStyle", "getTimeType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DofTemplateTimeStyleDesc {

    @NotNull
    private final String styleId;

    @NotNull
    private final String timeColor;
    private final int timePosition;
    private final int timeStyle;
    private final int timeType;

    public DofTemplateTimeStyleDesc() {
        this(null, null, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ DofTemplateTimeStyleDesc copy$default(DofTemplateTimeStyleDesc dofTemplateTimeStyleDesc, String str, String str2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dofTemplateTimeStyleDesc.styleId;
        }
        if ((i4 & 2) != 0) {
            str2 = dofTemplateTimeStyleDesc.timeColor;
        }
        String str3 = str2;
        if ((i4 & 4) != 0) {
            i = dofTemplateTimeStyleDesc.timeStyle;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = dofTemplateTimeStyleDesc.timePosition;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = dofTemplateTimeStyleDesc.timeType;
        }
        return dofTemplateTimeStyleDesc.copy(str, str3, i5, i6, i3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeColor() {
        return this.timeColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimeStyle() {
        return this.timeStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTimePosition() {
        return this.timePosition;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTimeType() {
        return this.timeType;
    }

    @NotNull
    public final DofTemplateTimeStyleDesc copy(@NotNull String styleId, @NotNull String timeColor, int timeStyle, int timePosition, int timeType) {
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(timeColor, "timeColor");
        return new DofTemplateTimeStyleDesc(styleId, timeColor, timeStyle, timePosition, timeType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DofTemplateTimeStyleDesc)) {
            return false;
        }
        DofTemplateTimeStyleDesc dofTemplateTimeStyleDesc = (DofTemplateTimeStyleDesc) other;
        return Intrinsics.areEqual(this.styleId, dofTemplateTimeStyleDesc.styleId) && Intrinsics.areEqual(this.timeColor, dofTemplateTimeStyleDesc.timeColor) && this.timeStyle == dofTemplateTimeStyleDesc.timeStyle && this.timePosition == dofTemplateTimeStyleDesc.timePosition && this.timeType == dofTemplateTimeStyleDesc.timeType;
    }

    @NotNull
    public final String getStyleId() {
        return this.styleId;
    }

    @NotNull
    public final String getTimeColor() {
        return this.timeColor;
    }

    public final int getTimePosition() {
        return this.timePosition;
    }

    public final int getTimeStyle() {
        return this.timeStyle;
    }

    public final int getTimeType() {
        return this.timeType;
    }

    public int hashCode() {
        return (((((((this.styleId.hashCode() * 31) + this.timeColor.hashCode()) * 31) + Integer.hashCode(this.timeStyle)) * 31) + Integer.hashCode(this.timePosition)) * 31) + Integer.hashCode(this.timeType);
    }

    @NotNull
    public String toString() {
        return "DofTemplateTimeStyleDesc(styleId=" + this.styleId + ", timeColor=" + this.timeColor + ", timeStyle=" + this.timeStyle + ", timePosition=" + this.timePosition + ", timeType=" + this.timeType + ")";
    }

    public DofTemplateTimeStyleDesc(@NotNull String styleId, @NotNull String timeColor, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(timeColor, "timeColor");
        this.styleId = styleId;
        this.timeColor = timeColor;
        this.timeStyle = i;
        this.timePosition = i2;
        this.timeType = i3;
    }

    public /* synthetic */ DofTemplateTimeStyleDesc(String str, String str2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "#FFFFFFFF" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) == 0 ? i3 : 0);
    }
}
