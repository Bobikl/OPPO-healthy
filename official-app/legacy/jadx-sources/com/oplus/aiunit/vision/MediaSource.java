package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.urb, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/urb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "imgPath", "b", "videoPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MediaSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String imgPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String videoPath;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaSource() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImgPath() {
        return this.imgPath;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getVideoPath() {
        return this.videoPath;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaSource)) {
            return false;
        }
        MediaSource mediaSource = (MediaSource) other;
        return Intrinsics.areEqual(this.imgPath, mediaSource.imgPath) && Intrinsics.areEqual(this.videoPath, mediaSource.videoPath);
    }

    public int hashCode() {
        return (this.imgPath.hashCode() * 31) + this.videoPath.hashCode();
    }

    @NotNull
    public String toString() {
        return "MediaSource(imgPath=" + this.imgPath + ", videoPath=" + this.videoPath + ")";
    }

    public MediaSource(@NotNull String imgPath, @NotNull String videoPath) {
        Intrinsics.checkNotNullParameter(imgPath, "imgPath");
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        this.imgPath = imgPath;
        this.videoPath = videoPath;
    }

    public /* synthetic */ MediaSource(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
