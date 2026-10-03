package com.heytap.sports.share.badminton;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/share/badminton/VideoList;", "", "videoUrlM", "", "videoUrlF", "priority", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getPriority", "()I", "getVideoUrlF", "()Ljava/lang/String;", "getVideoUrlM", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VideoList {
    public static final int $stable = 0;
    private final int priority;

    @NotNull
    private final String videoUrlF;

    @NotNull
    private final String videoUrlM;

    public VideoList(@NotNull String videoUrlM, @NotNull String videoUrlF, int i) {
        Intrinsics.checkNotNullParameter(videoUrlM, "videoUrlM");
        Intrinsics.checkNotNullParameter(videoUrlF, "videoUrlF");
        this.videoUrlM = videoUrlM;
        this.videoUrlF = videoUrlF;
        this.priority = i;
    }

    public static /* synthetic */ VideoList copy$default(VideoList videoList, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoList.videoUrlM;
        }
        if ((i2 & 2) != 0) {
            str2 = videoList.videoUrlF;
        }
        if ((i2 & 4) != 0) {
            i = videoList.priority;
        }
        return videoList.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVideoUrlM() {
        return this.videoUrlM;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVideoUrlF() {
        return this.videoUrlF;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final VideoList copy(@NotNull String videoUrlM, @NotNull String videoUrlF, int priority) {
        Intrinsics.checkNotNullParameter(videoUrlM, "videoUrlM");
        Intrinsics.checkNotNullParameter(videoUrlF, "videoUrlF");
        return new VideoList(videoUrlM, videoUrlF, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoList)) {
            return false;
        }
        VideoList videoList = (VideoList) other;
        return Intrinsics.areEqual(this.videoUrlM, videoList.videoUrlM) && Intrinsics.areEqual(this.videoUrlF, videoList.videoUrlF) && this.priority == videoList.priority;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getVideoUrlF() {
        return this.videoUrlF;
    }

    @NotNull
    public final String getVideoUrlM() {
        return this.videoUrlM;
    }

    public int hashCode() {
        return (((this.videoUrlM.hashCode() * 31) + this.videoUrlF.hashCode()) * 31) + Integer.hashCode(this.priority);
    }

    @NotNull
    public String toString() {
        return "VideoList(videoUrlM=" + this.videoUrlM + ", videoUrlF=" + this.videoUrlF + ", priority=" + this.priority + ")";
    }
}
