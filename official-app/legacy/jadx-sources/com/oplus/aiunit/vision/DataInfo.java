package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lt4, reason: from toString */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R$\u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/lt4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/jyk;", "a", "Lcom/oplus/aiunit/vision/jyk;", "()Lcom/oplus/aiunit/vision/jyk;", "setBackgroundVideoInfo", "(Lcom/oplus/aiunit/vision/jyk;)V", "backgroundVideoInfo", "b", "c", "setForegroundAnimSource", "foregroundAnimSource", "Ljava/lang/String;", "()Ljava/lang/String;", "setCoverImgUrl", "(Ljava/lang/String;)V", "coverImgUrl", "d", "getWebUrl", "setWebUrl", "webUrl", MapSchema.FIELD_NAME_ENTRY, "getOpenUrl", "setOpenUrl", "openUrl", "f", "Ljava/lang/Integer;", "getGestureType", "()Ljava/lang/Integer;", "setGestureType", "(Ljava/lang/Integer;)V", "gestureType", "<init>", "(Lcom/oplus/aiunit/vision/jyk;Lcom/oplus/aiunit/vision/jyk;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DataInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public VideoInfo backgroundVideoInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public VideoInfo foregroundAnimSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String coverImgUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public String webUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String openUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer gestureType;

    public DataInfo(@NotNull VideoInfo backgroundVideoInfo, @NotNull VideoInfo foregroundAnimSource, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(backgroundVideoInfo, "backgroundVideoInfo");
        Intrinsics.checkNotNullParameter(foregroundAnimSource, "foregroundAnimSource");
        this.backgroundVideoInfo = backgroundVideoInfo;
        this.foregroundAnimSource = foregroundAnimSource;
        this.coverImgUrl = str;
        this.webUrl = str2;
        this.openUrl = str3;
        this.gestureType = num;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final VideoInfo getBackgroundVideoInfo() {
        return this.backgroundVideoInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCoverImgUrl() {
        return this.coverImgUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final VideoInfo getForegroundAnimSource() {
        return this.foregroundAnimSource;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataInfo)) {
            return false;
        }
        DataInfo dataInfo = (DataInfo) other;
        return Intrinsics.areEqual(this.backgroundVideoInfo, dataInfo.backgroundVideoInfo) && Intrinsics.areEqual(this.foregroundAnimSource, dataInfo.foregroundAnimSource) && Intrinsics.areEqual(this.coverImgUrl, dataInfo.coverImgUrl) && Intrinsics.areEqual(this.webUrl, dataInfo.webUrl) && Intrinsics.areEqual(this.openUrl, dataInfo.openUrl) && Intrinsics.areEqual(this.gestureType, dataInfo.gestureType);
    }

    public int hashCode() {
        int iHashCode = ((this.backgroundVideoInfo.hashCode() * 31) + this.foregroundAnimSource.hashCode()) * 31;
        String str = this.coverImgUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.openUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.gestureType;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataInfo(backgroundVideoInfo=" + this.backgroundVideoInfo + ", foregroundAnimSource=" + this.foregroundAnimSource + ", coverImgUrl=" + this.coverImgUrl + ", webUrl=" + this.webUrl + ", openUrl=" + this.openUrl + ", gestureType=" + this.gestureType + ')';
    }

    public /* synthetic */ DataInfo(VideoInfo videoInfo, VideoInfo videoInfo2, String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoInfo, videoInfo2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? 1 : num);
    }
}
