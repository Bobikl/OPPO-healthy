package com.oplus.aiunit.vision;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.view.Surface;
import com.oplus.channel.client.data.Action;
import io.protostuff.MapSchema;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/v65;", "Lcom/oplus/aiunit/vision/y4;", "", "initMediaPlayer", "Landroid/view/Surface;", "surface", "setSurface", "", "dataPath", "setDataSource", "prepareAsync", "start", Action.LIFE_CIRCLE_VALUE_STOP, "release", "", "looping", "setLooping", "isMute", "setMute", "Landroid/media/MediaPlayer;", "a", "Landroid/media/MediaPlayer;", MapSchema.FIELD_NAME_ENTRY, "()Landroid/media/MediaPlayer;", MapSchema.FIELD_NAME_KEY, "(Landroid/media/MediaPlayer;)V", "mediaPlayer", "Landroid/media/MediaMetadataRetriever;", "b", "Landroid/media/MediaMetadataRetriever;", "retriever", "c", "Ljava/lang/String;", "getDataPath", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "<init>", "()V", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public final class v65 extends y4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public MediaPlayer mediaPlayer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MediaMetadataRetriever retriever;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String dataPath;

    public v65() {
        super(null, 1, null);
        this.retriever = new MediaMetadataRetriever();
    }

    public static final void f(v65 this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCompletionListener();
    }

    public static final void g(v65 this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getPreparedListener();
    }

    public static final boolean h(v65 this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getErrorListener();
        return false;
    }

    public static final boolean i(v65 this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 3) {
            return false;
        }
        this$0.getFirstFrameListener();
        return false;
    }

    @NotNull
    public final MediaPlayer e() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        return null;
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void initMediaPlayer() {
        k(new MediaPlayer());
        e().setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.r65
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                v65.f(this.i, mediaPlayer);
            }
        });
        e().setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.s65
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                v65.g(this.i, mediaPlayer);
            }
        });
        e().setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.oplus.aiunit.vision.t65
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return v65.h(this.i, mediaPlayer, i, i2);
            }
        });
        e().setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.oplus.aiunit.vision.u65
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                return v65.i(this.i, mediaPlayer, i, i2);
            }
        });
    }

    public final void j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataPath = str;
    }

    public final void k(@NotNull MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "<set-?>");
        this.mediaPlayer = mediaPlayer;
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void prepareAsync() {
        e().prepareAsync();
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void release() {
        e().release();
        j("");
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setDataSource(@NotNull String dataPath) throws IOException {
        Intrinsics.checkNotNullParameter(dataPath, "dataPath");
        j(dataPath);
        e().setDataSource(dataPath);
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setLooping(boolean looping) {
        e().setLooping(looping);
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setMute(boolean isMute) {
        if (isMute) {
            e().setVolume(0.0f, 0.0f);
        } else {
            e().setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        e().setSurface(surface);
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void start() {
        e().start();
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void stop() {
        e().stop();
    }
}
