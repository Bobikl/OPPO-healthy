package com.heytap.store.platform.videoplayer.bean;

import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006)"}, d2 = {"Lcom/heytap/store/platform/videoplayer/bean/VideoControlBean;", "", "progress", "", "controlType", "", RunningPostureVideoActivity.VIDEO_PATH, "videoIsPlaying", "", "videoStatus", "videoMute", "(ILjava/lang/String;Ljava/lang/String;ZIZ)V", "getControlType", "()Ljava/lang/String;", "setControlType", "(Ljava/lang/String;)V", "getProgress", "()I", ClickApiEntity.SET_PROGRESS, "(I)V", "getVideoIsPlaying", "()Z", "setVideoIsPlaying", "(Z)V", "getVideoMute", "setVideoMute", "getVideoStatus", "setVideoStatus", "getVideoUrl", "setVideoUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class VideoControlBean {

    @NotNull
    private String controlType;
    private int progress;
    private boolean videoIsPlaying;
    private boolean videoMute;
    private int videoStatus;

    @NotNull
    private String videoUrl;

    public VideoControlBean(int i, @NotNull String controlType, @NotNull String videoUrl, boolean z, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(controlType, "controlType");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.progress = i;
        this.controlType = controlType;
        this.videoUrl = videoUrl;
        this.videoIsPlaying = z;
        this.videoStatus = i2;
        this.videoMute = z2;
    }

    public static /* synthetic */ VideoControlBean copy$default(VideoControlBean videoControlBean, int i, String str, String str2, boolean z, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoControlBean.progress;
        }
        if ((i3 & 2) != 0) {
            str = videoControlBean.controlType;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = videoControlBean.videoUrl;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            z = videoControlBean.videoIsPlaying;
        }
        boolean z3 = z;
        if ((i3 & 16) != 0) {
            i2 = videoControlBean.videoStatus;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            z2 = videoControlBean.videoMute;
        }
        return videoControlBean.copy(i, str3, str4, z3, i4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getControlType() {
        return this.controlType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getVideoIsPlaying() {
        return this.videoIsPlaying;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVideoStatus() {
        return this.videoStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getVideoMute() {
        return this.videoMute;
    }

    @NotNull
    public final VideoControlBean copy(int progress, @NotNull String controlType, @NotNull String videoUrl, boolean videoIsPlaying, int videoStatus, boolean videoMute) {
        Intrinsics.checkNotNullParameter(controlType, "controlType");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        return new VideoControlBean(progress, controlType, videoUrl, videoIsPlaying, videoStatus, videoMute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoControlBean)) {
            return false;
        }
        VideoControlBean videoControlBean = (VideoControlBean) other;
        return this.progress == videoControlBean.progress && Intrinsics.areEqual(this.controlType, videoControlBean.controlType) && Intrinsics.areEqual(this.videoUrl, videoControlBean.videoUrl) && this.videoIsPlaying == videoControlBean.videoIsPlaying && this.videoStatus == videoControlBean.videoStatus && this.videoMute == videoControlBean.videoMute;
    }

    @NotNull
    public final String getControlType() {
        return this.controlType;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final boolean getVideoIsPlaying() {
        return this.videoIsPlaying;
    }

    public final boolean getVideoMute() {
        return this.videoMute;
    }

    public final int getVideoStatus() {
        return this.videoStatus;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.progress) * 31) + this.controlType.hashCode()) * 31) + this.videoUrl.hashCode()) * 31;
        boolean z = this.videoIsPlaying;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + Integer.hashCode(this.videoStatus)) * 31;
        boolean z2 = this.videoMute;
        return iHashCode2 + (z2 ? 1 : z2);
    }

    public final void setControlType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.controlType = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setVideoIsPlaying(boolean z) {
        this.videoIsPlaying = z;
    }

    public final void setVideoMute(boolean z) {
        this.videoMute = z;
    }

    public final void setVideoStatus(int i) {
        this.videoStatus = i;
    }

    public final void setVideoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoUrl = str;
    }

    @NotNull
    public String toString() {
        return "VideoControlBean(progress=" + this.progress + ", controlType=" + this.controlType + ", videoUrl=" + this.videoUrl + ", videoIsPlaying=" + this.videoIsPlaying + ", videoStatus=" + this.videoStatus + ", videoMute=" + this.videoMute + ')';
    }

    public /* synthetic */ VideoControlBean(int i, String str, String str2, boolean z, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? "ITEM_GALLERY" : str, (i3 & 4) != 0 ? "" : str2, z, i2, z2);
    }
}
