package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u00020\u00108FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001c\u0010 \u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001c\u0010#\u001a\u00020\u00108FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001c\u0010&\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u001c\u0010)\u001a\u00020\u00108FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014¨\u0006,"}, d2 = {"Lcom/heytap/store/homemodule/data/MediaInfo;", "", "()V", "alphaAddBigScale", "", "getAlphaAddBigScale", "()F", "setAlphaAddBigScale", "(F)V", "alphaAlignHigh", "", "getAlphaAlignHigh", "()I", "setAlphaAlignHigh", "(I)V", "alphaVideo", "", "getAlphaVideo", "()Ljava/lang/String;", "setAlphaVideo", "(Ljava/lang/String;)V", "alphaVideoRatio", "getAlphaVideoRatio", "setAlphaVideoRatio", "id", "getId", "setId", "is_video_sound", "set_video_sound", "pic", "getPic", "setPic", "ratio", "getRatio", "setRatio", "skipLink", "getSkipLink", "setSkipLink", "type", "getType", "setType", "video", "getVideo", "setVideo", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MediaInfo {
    private int alphaAlignHigh;
    private int id;
    private int is_video_sound;

    @NotNull
    private String pic = "";
    private int ratio = -1;

    @NotNull
    private String skipLink = "";
    private int type = -1;

    @NotNull
    private String video = "";

    @NotNull
    private String alphaVideo = "";
    private float alphaVideoRatio = 1.6f;
    private float alphaAddBigScale = 1.0f;

    public final float getAlphaAddBigScale() {
        return this.alphaAddBigScale;
    }

    public final int getAlphaAlignHigh() {
        return this.alphaAlignHigh;
    }

    @NotNull
    public final String getAlphaVideo() {
        String str = this.alphaVideo;
        return str == null ? "" : str;
    }

    public final float getAlphaVideoRatio() {
        return this.alphaVideoRatio;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getPic() {
        String str = this.pic;
        return str == null ? "" : str;
    }

    public final int getRatio() {
        return this.ratio;
    }

    @NotNull
    public final String getSkipLink() {
        String str = this.skipLink;
        return str == null ? "" : str;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getVideo() {
        String str = this.video;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: is_video_sound, reason: from getter */
    public final int getIs_video_sound() {
        return this.is_video_sound;
    }

    public final void setAlphaAddBigScale(float f) {
        this.alphaAddBigScale = f;
    }

    public final void setAlphaAlignHigh(int i) {
        this.alphaAlignHigh = i;
    }

    public final void setAlphaVideo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alphaVideo = str;
    }

    public final void setAlphaVideoRatio(float f) {
        this.alphaVideoRatio = f;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setRatio(int i) {
        this.ratio = i;
    }

    public final void setSkipLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.skipLink = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setVideo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.video = str;
    }

    public final void set_video_sound(int i) {
        this.is_video_sound = i;
    }
}
