package com.oplus.aiunit.vision;

import android.media.MediaPlayer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$raw;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\"\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ck0;", "", "Landroid/media/MediaPlayer;", "media", "", "a", "c", "f", "d", "b", MapSchema.FIELD_NAME_ENTRY, "Landroid/media/MediaPlayer;", "mediaPlayer", "", "Z", "isPlay", "()Z", "setPlay", "(Z)V", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ck0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public MediaPlayer mediaPlayer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isPlay;

    public ck0() {
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(b78.a(), R$raw.sport_track_video_back_music);
        mediaPlayerCreate.setLooping(true);
        Intrinsics.checkNotNullExpressionValue(mediaPlayerCreate, "create(GlobalApplication…sLooping = true\n        }");
        this.mediaPlayer = mediaPlayerCreate;
    }

    public final void a(@NotNull MediaPlayer media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.mediaPlayer = media;
    }

    public final void b() {
        if (this.isPlay) {
            this.mediaPlayer.pause();
        }
    }

    public final void c() {
        this.isPlay = true;
        this.mediaPlayer.seekTo(0);
        this.mediaPlayer.start();
    }

    public final void d() {
        this.isPlay = false;
        this.mediaPlayer.release();
    }

    public final void e() {
        if (this.isPlay) {
            this.mediaPlayer.start();
        }
    }

    public final void f() {
        this.mediaPlayer.pause();
    }
}
