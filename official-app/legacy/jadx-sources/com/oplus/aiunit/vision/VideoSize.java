package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.izk, reason: from toString */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/izk;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getVideoWidth", "()I", "videoWidth", "b", "getVideoHeight", "videoHeight", "<init>", "(II)V", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public final /* data */ class VideoSize {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int videoWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int videoHeight;

    public VideoSize(int i, int i2) {
        this.videoWidth = i;
        this.videoHeight = i2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) other;
        return this.videoWidth == videoSize.videoWidth && this.videoHeight == videoSize.videoHeight;
    }

    public int hashCode() {
        return (Integer.hashCode(this.videoWidth) * 31) + Integer.hashCode(this.videoHeight);
    }

    @NotNull
    public String toString() {
        return "VideoSize(videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ')';
    }
}
