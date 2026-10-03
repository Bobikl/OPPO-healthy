package com.heytap.health.watchpair.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.heytap.health.watchpair.view.PairPhoneVideoView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ml4;
import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u000e¢\u0006\u0004\b/\u00100J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0005J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u00061"}, d2 = {"Lcom/heytap/health/watchpair/view/PairPhoneVideoView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "listener", "", "setOnCompletionListener", MapSchema.FIELD_NAME_ENTRY, "", "looper", "f", b2n.f, "Landroid/graphics/SurfaceTexture;", "surface", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "onSurfaceTextureAvailable", "onSurfaceTextureSizeChanged", "onSurfaceTextureDestroyed", "onSurfaceTextureUpdated", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "setPlayFile", "", "i", "Ljava/lang/String;", "TAG", "Landroid/media/MediaPlayer;", "j", "Landroid/media/MediaPlayer;", "mMediaPlayer", MapSchema.FIELD_NAME_KEY, "Landroid/media/MediaPlayer$OnCompletionListener;", "completionListener", "Landroid/view/Surface;", LogFieldKey.LEVEL_KEY, "Landroid/view/Surface;", "mSurface", LogFieldKey.MESSAGE_KEY, "Ljava/io/File;", "playFile", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class PairPhoneVideoView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MediaPlayer mMediaPlayer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public MediaPlayer.OnCompletionListener completionListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Surface mSurface;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public File playFile;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PairPhoneVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void c(PairPhoneVideoView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ml4.d(this$0.TAG, "onPrepared");
        mediaPlayer.start();
    }

    public static final void d(PairPhoneVideoView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ml4.d(this$0.TAG, "onCompletion");
        MediaPlayer.OnCompletionListener onCompletionListener = this$0.completionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }

    public final void e() {
        this.completionListener = null;
    }

    public final void f(boolean looper) {
        Object objM5287constructorimpl;
        Object objM5287constructorimpl2;
        if (this.playFile == null) {
            ml4.d(this.TAG, "startPlay playFile not init");
            return;
        }
        ml4.d(this.TAG, "startPlay");
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            ml4.c(this.TAG, "startPlay player is null");
            return;
        }
        File file = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            mediaPlayer.reset();
            mediaPlayer.setLooping(looper);
            File file2 = this.playFile;
            if (file2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playFile");
                file2 = null;
            }
            mediaPlayer.setDataSource(file2.getAbsolutePath());
            mediaPlayer.prepareAsync();
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            ml4.c(this.TAG, "startPlay fail " + thM5290exceptionOrNullimpl.getMessage());
            try {
                File file3 = this.playFile;
                if (file3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playFile");
                    file3 = null;
                }
                if (file3.exists()) {
                    File file4 = this.playFile;
                    if (file4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playFile");
                    } else {
                        file = file4;
                    }
                    file.delete();
                }
                objM5287constructorimpl2 = Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl2 = Result.m5287constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5290exceptionOrNullimpl2 = Result.m5290exceptionOrNullimpl(objM5287constructorimpl2);
            if (thM5290exceptionOrNullimpl2 != null) {
                ml4.c(this.TAG, "playFile delete fail " + thM5290exceptionOrNullimpl2.getMessage());
            }
        }
    }

    public final void g() {
        ml4.d(this.TAG, "videoStop");
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.reset();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        ml4.d(this.TAG, "onSurfaceTextureAvailable");
        Surface surface2 = new Surface(getSurfaceTexture());
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface2);
        }
        this.mSurface = surface2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        ml4.d(this.TAG, "onSurfaceTextureDestroyed");
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return true;
        }
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        this.mMediaPlayer = null;
        this.mSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        ml4.d(this.TAG, "onSurfaceTextureSizeChanged");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    public final void setOnCompletionListener(@NotNull MediaPlayer.OnCompletionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.completionListener = listener;
    }

    public final void setPlayFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        ml4.a(this.TAG, "setPlayFile " + file);
        this.playFile = file;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PairPhoneVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PairPhoneVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PairPhoneVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "PairPhoneVideoView";
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.e6e
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                PairPhoneVideoView.c(this.i, mediaPlayer2);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.f6e
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                PairPhoneVideoView.d(this.i, mediaPlayer2);
            }
        });
        this.mMediaPlayer = mediaPlayer;
        setSurfaceTextureListener(this);
    }
}
