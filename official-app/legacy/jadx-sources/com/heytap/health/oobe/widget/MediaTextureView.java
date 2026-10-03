package com.heytap.health.oobe.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.heytap.health.oobe.widget.MediaTextureView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00014\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\nJ@\u0010\u0017\u001a\u00020\n28\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J \u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\nH\u0002R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010$R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R*\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006>"}, d2 = {"Lcom/heytap/health/oobe/widget/MediaTextureView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/net/Uri;", ParserTag.TAG_URI, MapSchema.FIELD_NAME_KEY, "", "looping", "j", "f", "", LogFieldKey.LEVEL_KEY, "()Lkotlin/Unit;", "Landroid/media/MediaPlayer$OnCompletionListener;", "listener", "setOnCompletionListener", "i", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "positionMs", "durationMs", "setOnProgressListener", "Landroid/graphics/SurfaceTexture;", "st", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "onSurfaceTextureAvailable", "onSurfaceTextureSizeChanged", "onSurfaceTextureDestroyed", "onSurfaceTextureUpdated", b2n.f, "Landroid/media/MediaPlayer;", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/net/Uri;", "videoUri", "Z", "Landroid/view/Surface;", "Landroid/view/Surface;", "surface", LogFieldKey.MESSAGE_KEY, "Landroid/media/MediaPlayer$OnCompletionListener;", "onCompletionListener", "Landroid/os/Handler;", "n", "Landroid/os/Handler;", "progressHandler", "o", "Lkotlin/jvm/functions/Function2;", "progressListener", "com/heytap/health/oobe/widget/MediaTextureView$a", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/oobe/widget/MediaTextureView$a;", "progressRunnable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class MediaTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public MediaPlayer mediaPlayer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Uri videoUri;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean looping;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Surface surface;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public MediaPlayer.OnCompletionListener onCompletionListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Handler progressHandler;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Function2<? super Integer, ? super Integer, Unit> progressListener;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final a progressRunnable;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/heytap/health/oobe/widget/MediaTextureView$a", "Ljava/lang/Runnable;", "", "run", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Function2 function2;
            MediaPlayer mediaPlayer = MediaTextureView.this.mediaPlayer;
            if (MediaTextureView.this.surface == null || mediaPlayer == null) {
                return;
            }
            if (mediaPlayer.isPlaying() && (function2 = MediaTextureView.this.progressListener) != null) {
                function2.invoke(Integer.valueOf(mediaPlayer.getCurrentPosition()), Integer.valueOf(mediaPlayer.getDuration()));
            }
            MediaTextureView.this.progressHandler.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MediaTextureView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void h(MediaPlayer this_apply, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.start();
    }

    public final boolean f() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public final void g() {
        Surface surface;
        Uri uri = this.videoUri;
        if (uri == null || (surface = this.surface) == null) {
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        final MediaPlayer mediaPlayer2 = new MediaPlayer();
        try {
            mediaPlayer2.setDataSource(getContext(), uri);
            mediaPlayer2.setSurface(surface);
            mediaPlayer2.setLooping(this.looping);
            mediaPlayer2.setOnCompletionListener(this.onCompletionListener);
            mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.zrb
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    MediaTextureView.h(mediaPlayer2, mediaPlayer3);
                }
            });
            mediaPlayer2.prepareAsync();
        } catch (Exception unused) {
            MediaPlayer.OnCompletionListener onCompletionListener = this.onCompletionListener;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(mediaPlayer2);
            }
        }
        this.mediaPlayer = mediaPlayer2;
    }

    public final void i() {
        this.progressHandler.removeCallbacks(this.progressRunnable);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.mediaPlayer = null;
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    @NotNull
    public final MediaTextureView j(boolean looping) {
        this.looping = looping;
        return this;
    }

    @NotNull
    public final MediaTextureView k(@Nullable Uri uri) {
        this.videoUri = uri;
        g();
        return this;
    }

    @Nullable
    public final Unit l() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return null;
        }
        mediaPlayer.start();
        return Unit.INSTANCE;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture st, int width, int height) {
        Intrinsics.checkNotNullParameter(st, "st");
        this.surface = new Surface(st);
        g();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return true;
        }
        mediaPlayer.pause();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture st, int width, int height) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    public final void setOnCompletionListener(@NotNull MediaPlayer.OnCompletionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onCompletionListener = listener;
        if (this.videoUri == null) {
            listener.onCompletion(null);
        }
    }

    public final void setOnProgressListener(@Nullable Function2<? super Integer, ? super Integer, Unit> listener) {
        this.progressListener = listener;
        this.progressHandler.removeCallbacks(this.progressRunnable);
        if (listener != null) {
            this.progressHandler.post(this.progressRunnable);
        }
    }

    public /* synthetic */ MediaTextureView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MediaTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressHandler = new Handler(Looper.getMainLooper());
        this.progressRunnable = new a();
        setSurfaceTextureListener(this);
    }
}
