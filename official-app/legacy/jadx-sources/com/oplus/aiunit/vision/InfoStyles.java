package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.health.watchface.business.legacy.main.bean.WatchFaceBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.m7a, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/m7a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMColor", "()Ljava/lang/String;", WatchFaceBean.TAG_M_COLOR, "", "Lcom/oplus/aiunit/vision/gs3;", "b", "Ljava/util/List;", "()Ljava/util/List;", "mComplicationConfigs", "c", "getMEditBackground", "mEditBackground", "d", "getMPreviewResName", "mPreviewResName", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class InfoStyles {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(WatchFaceBean.TAG_M_COLOR)
    @NotNull
    private final String mColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("mComplicationConfigs")
    @NotNull
    private final List<ComplicationConfigs> mComplicationConfigs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("mEditBackground")
    @NotNull
    private final String mEditBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("mPreviewResName")
    @NotNull
    private final String mPreviewResName;

    @NotNull
    public final List<ComplicationConfigs> a() {
        return this.mComplicationConfigs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoStyles)) {
            return false;
        }
        InfoStyles infoStyles = (InfoStyles) other;
        return Intrinsics.areEqual(this.mColor, infoStyles.mColor) && Intrinsics.areEqual(this.mComplicationConfigs, infoStyles.mComplicationConfigs) && Intrinsics.areEqual(this.mEditBackground, infoStyles.mEditBackground) && Intrinsics.areEqual(this.mPreviewResName, infoStyles.mPreviewResName);
    }

    public int hashCode() {
        return (((((this.mColor.hashCode() * 31) + this.mComplicationConfigs.hashCode()) * 31) + this.mEditBackground.hashCode()) * 31) + this.mPreviewResName.hashCode();
    }

    @NotNull
    public String toString() {
        return "InfoStyles(mColor=" + this.mColor + ", mComplicationConfigs=" + this.mComplicationConfigs + ", mEditBackground=" + this.mEditBackground + ", mPreviewResName=" + this.mPreviewResName + ")";
    }
}
