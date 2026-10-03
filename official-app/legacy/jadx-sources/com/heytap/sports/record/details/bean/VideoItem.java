package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/sports/record/details/bean/VideoItem;", "", "name", "", "preview", "video", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPreview", "setPreview", "getVideo", "setVideo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VideoItem {
    public static final int $stable = 8;

    @NotNull
    private String name;

    @NotNull
    private String preview;

    @NotNull
    private String video;

    public VideoItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ VideoItem copy$default(VideoItem videoItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoItem.name;
        }
        if ((i & 2) != 0) {
            str2 = videoItem.preview;
        }
        if ((i & 4) != 0) {
            str3 = videoItem.video;
        }
        return videoItem.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideo() {
        return this.video;
    }

    @NotNull
    public final VideoItem copy(@NotNull String name, @NotNull String preview, @NotNull String video) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(video, "video");
        return new VideoItem(name, preview, video);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoItem)) {
            return false;
        }
        VideoItem videoItem = (VideoItem) other;
        return Intrinsics.areEqual(this.name, videoItem.name) && Intrinsics.areEqual(this.preview, videoItem.preview) && Intrinsics.areEqual(this.video, videoItem.video);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPreview() {
        return this.preview;
    }

    @NotNull
    public final String getVideo() {
        return this.video;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.preview.hashCode()) * 31) + this.video.hashCode();
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPreview(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.preview = str;
    }

    public final void setVideo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.video = str;
    }

    @NotNull
    public String toString() {
        return "VideoItem(name=" + this.name + ", preview=" + this.preview + ", video=" + this.video + ")";
    }

    public VideoItem(@NotNull String name, @NotNull String preview, @NotNull String video) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(video, "video");
        this.name = name;
        this.preview = preview;
        this.video = video;
    }

    public /* synthetic */ VideoItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
