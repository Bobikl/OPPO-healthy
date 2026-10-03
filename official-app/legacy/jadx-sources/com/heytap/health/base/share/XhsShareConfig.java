package com.heytap.health.base.share;

import androidx.annotation.Keep;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/base/share/XhsShareConfig;", "", "imageTitle", "", "imageContent", RunningPostureVideoActivity.VIDEO_TITLE, "videoContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageContent", "()Ljava/lang/String;", "getImageTitle", "getVideoContent", "getVideoTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class XhsShareConfig {

    @NotNull
    private final String imageContent;

    @NotNull
    private final String imageTitle;

    @NotNull
    private final String videoContent;

    @NotNull
    private final String videoTitle;

    public XhsShareConfig(@NotNull String imageTitle, @NotNull String imageContent, @NotNull String videoTitle, @NotNull String videoContent) {
        Intrinsics.checkNotNullParameter(imageTitle, "imageTitle");
        Intrinsics.checkNotNullParameter(imageContent, "imageContent");
        Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
        Intrinsics.checkNotNullParameter(videoContent, "videoContent");
        this.imageTitle = imageTitle;
        this.imageContent = imageContent;
        this.videoTitle = videoTitle;
        this.videoContent = videoContent;
    }

    public static /* synthetic */ XhsShareConfig copy$default(XhsShareConfig xhsShareConfig, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xhsShareConfig.imageTitle;
        }
        if ((i & 2) != 0) {
            str2 = xhsShareConfig.imageContent;
        }
        if ((i & 4) != 0) {
            str3 = xhsShareConfig.videoTitle;
        }
        if ((i & 8) != 0) {
            str4 = xhsShareConfig.videoContent;
        }
        return xhsShareConfig.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageTitle() {
        return this.imageTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageContent() {
        return this.imageContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoTitle() {
        return this.videoTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVideoContent() {
        return this.videoContent;
    }

    @NotNull
    public final XhsShareConfig copy(@NotNull String imageTitle, @NotNull String imageContent, @NotNull String videoTitle, @NotNull String videoContent) {
        Intrinsics.checkNotNullParameter(imageTitle, "imageTitle");
        Intrinsics.checkNotNullParameter(imageContent, "imageContent");
        Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
        Intrinsics.checkNotNullParameter(videoContent, "videoContent");
        return new XhsShareConfig(imageTitle, imageContent, videoTitle, videoContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XhsShareConfig)) {
            return false;
        }
        XhsShareConfig xhsShareConfig = (XhsShareConfig) other;
        return Intrinsics.areEqual(this.imageTitle, xhsShareConfig.imageTitle) && Intrinsics.areEqual(this.imageContent, xhsShareConfig.imageContent) && Intrinsics.areEqual(this.videoTitle, xhsShareConfig.videoTitle) && Intrinsics.areEqual(this.videoContent, xhsShareConfig.videoContent);
    }

    @NotNull
    public final String getImageContent() {
        return this.imageContent;
    }

    @NotNull
    public final String getImageTitle() {
        return this.imageTitle;
    }

    @NotNull
    public final String getVideoContent() {
        return this.videoContent;
    }

    @NotNull
    public final String getVideoTitle() {
        return this.videoTitle;
    }

    public int hashCode() {
        return (((((this.imageTitle.hashCode() * 31) + this.imageContent.hashCode()) * 31) + this.videoTitle.hashCode()) * 31) + this.videoContent.hashCode();
    }

    @NotNull
    public String toString() {
        return "XhsShareConfig(imageTitle=" + this.imageTitle + ", imageContent=" + this.imageContent + ", videoTitle=" + this.videoTitle + ", videoContent=" + this.videoContent + ")";
    }
}
