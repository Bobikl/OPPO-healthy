package com.heytap.sporthealth.fit.weiget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import com.heytap.health.base.R$string;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.jr9;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.yg7;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPlayerTextureView extends TextureView implements TextureView.SurfaceTextureListener, MediaController.MediaPlayerControl, GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {
    public long A;
    public String B;
    public Surface C;
    public MediaPlayer.OnVideoSizeChangedListener D;
    public final MediaPlayer.OnErrorListener E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public Map<String, String> K;
    public float L;
    public Window M;
    public int N;
    public jr9 O;
    public final AudioManager i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WindowManager.LayoutParams f7788j;
    public final GestureDetector k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MediaPlayer f7789l;
    public Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7790n;
    public int o;
    public int p;
    public SurfaceTexture q;
    public Uri r;
    public f s;
    public GestureDetector.OnGestureListener t;
    public float u;
    public int v;
    public MediaPlayer.OnCompletionListener w;
    public MediaPlayer.OnBufferingUpdateListener x;
    public MediaPlayer.OnPreparedListener y;
    public MediaPlayer.OnPreparedListener z;

    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            MediaPlayerTextureView.this.F = 5;
            MediaPlayerTextureView.this.G = 5;
            if (MediaPlayerTextureView.this.O != null) {
                MediaPlayerTextureView.this.O.hide();
            }
            if (MediaPlayerTextureView.this.s != null) {
                MediaPlayerTextureView.this.s.u3();
            }
            MediaPlayerTextureView.this.i.abandonAudioFocus(null);
        }
    }

    public class b implements MediaPlayer.OnBufferingUpdateListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            MediaPlayerTextureView.this.N = i;
        }
    }

    public class c implements MediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayerTextureView.this.F = 2;
            if (MediaPlayerTextureView.this.z != null) {
                MediaPlayerTextureView.this.z.onPrepared(mediaPlayer);
            }
            MediaPlayerTextureView.this.f7790n = mediaPlayer.getVideoWidth();
            MediaPlayerTextureView.this.o = mediaPlayer.getVideoHeight();
            if (MediaPlayerTextureView.this.O != null) {
                MediaPlayerTextureView.this.O.setEnabled(true);
                MediaPlayerTextureView.this.O.c(0);
            }
            int i = MediaPlayerTextureView.this.J;
            if (i != 0) {
                MediaPlayerTextureView.this.seekTo(i);
            }
            if (MediaPlayerTextureView.this.f7790n == 0 || MediaPlayerTextureView.this.o == 0) {
                if (MediaPlayerTextureView.this.G == 3) {
                    MediaPlayerTextureView.this.start();
                    return;
                }
                return;
            }
            MediaPlayerTextureView mediaPlayerTextureView = MediaPlayerTextureView.this;
            mediaPlayerTextureView.w(mediaPlayerTextureView.f7790n, MediaPlayerTextureView.this.o);
            if (MediaPlayerTextureView.this.H != MediaPlayerTextureView.this.f7790n || MediaPlayerTextureView.this.I != MediaPlayerTextureView.this.o) {
                MediaPlayerTextureView.this.start();
                return;
            }
            if (MediaPlayerTextureView.this.G == 3) {
                MediaPlayerTextureView.this.start();
                if (MediaPlayerTextureView.this.O != null) {
                    MediaPlayerTextureView.this.O.show();
                    return;
                }
                return;
            }
            if (MediaPlayerTextureView.this.isPlaying()) {
                return;
            }
            if ((i != 0 || MediaPlayerTextureView.this.getCurrentPosition() > 0) && MediaPlayerTextureView.this.O != null) {
                MediaPlayerTextureView.this.O.c(0);
            }
        }
    }

    public class d implements MediaPlayer.OnVideoSizeChangedListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayerTextureView.this.f7790n = mediaPlayer.getVideoWidth();
            MediaPlayerTextureView.this.o = mediaPlayer.getVideoHeight();
            if (MediaPlayerTextureView.this.f7790n == 0 || MediaPlayerTextureView.this.o == 0) {
                return;
            }
            MediaPlayerTextureView.this.requestLayout();
        }
    }

    public class e implements MediaPlayer.OnErrorListener {
        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(File file) {
            a7b.f("MediaPlayerTextureView", "onError: retry delete result=" + file.delete() + ", path=" + MediaPlayerTextureView.this.B);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            a7b.f("MediaPlayerTextureView", "MediaPlayer onError: framework_err=" + i + ", impl_err=" + i2 + ", mPath=" + MediaPlayerTextureView.this.B + ", mUri=" + MediaPlayerTextureView.this.r);
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            MediaPlayerTextureView.this.F = -1;
            MediaPlayerTextureView.this.G = -1;
            if (MediaPlayerTextureView.this.O != null) {
                MediaPlayerTextureView.this.O.hide();
            }
            if (MediaPlayerTextureView.this.getWindowToken() != null) {
                Activity activityG = rg7.g(MediaPlayerTextureView.this);
                rg7.m(rg7.e(R$string.lib_base_share_network_not_connected));
                if (activityG != null) {
                    activityG.finish();
                }
            }
            if (MediaPlayerTextureView.this.B == null) {
                a7b.f("MediaPlayerTextureView", "onError: mPath is null, cannot delete file");
                return true;
            }
            final File file = new File(MediaPlayerTextureView.this.B);
            boolean zExists = file.exists();
            a7b.f("MediaPlayerTextureView", "onError: attempting to delete file - path=" + MediaPlayerTextureView.this.B + ", exists=" + zExists + ", isDirectory=" + file.isDirectory() + ", length=" + (zExists ? file.length() : 0L));
            boolean zDelete = file.delete();
            if (!zDelete) {
                ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.trb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.b(file);
                    }
                }, 1000L);
            }
            a7b.f("MediaPlayerTextureView", "onError: delete result=" + zDelete + ", path=" + MediaPlayerTextureView.this.B);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(zDelete);
            sb2.append(" Error: del path:");
            sb2.append(zDelete);
            a7b.f("MediaPlayerTextureView", sb2.toString());
            return true;
        }
    }

    public interface f {
        void H1();

        void t2();

        void u3();
    }

    public MediaPlayerTextureView(Context context) {
        this(context, null);
    }

    private void A() {
        if (this.r == null || this.q == null) {
            a7b.f("MediaPlayerTextureView", "openVideo: mUri=" + this.r + ", mSurfaceTexture=" + this.q);
            return;
        }
        a7b.f("MediaPlayerTextureView", "openVideo: mUri=" + this.r + ", mPath=" + this.B);
        String str = this.B;
        if (str != null && !str.startsWith("http://") && !this.B.startsWith("https://")) {
            File file = new File(this.B);
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            long length = zExists ? file.length() : 0L;
            a7b.f("MediaPlayerTextureView", "openVideo: file check - path=" + this.B + ", exists=" + zExists + ", isDirectory=" + zIsDirectory + ", length=" + length);
            if (!zExists) {
                a7b.f("MediaPlayerTextureView", "openVideo: video file does not exist! path=" + this.B);
            } else if (zIsDirectory) {
                a7b.f("MediaPlayerTextureView", "openVideo: path is a directory! path=" + this.B);
            } else if (length == 0) {
                a7b.f("MediaPlayerTextureView", "openVideo: video file is empty (length=0)! path=" + this.B);
            }
        }
        B(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f7789l = mediaPlayer;
            int i = this.p;
            if (i != 0) {
                mediaPlayer.setAudioSessionId(i);
            } else {
                this.p = mediaPlayer.getAudioSessionId();
            }
            this.f7789l.setOnErrorListener(this.E);
            this.f7789l.setOnPreparedListener(this.y);
            this.f7789l.setOnCompletionListener(this.w);
            this.f7789l.setOnVideoSizeChangedListener(this.D);
            this.f7789l.setDataSource(this.m, this.r, this.K);
            this.f7789l.setOnBufferingUpdateListener(this.x);
            Surface surface = new Surface(this.q);
            this.C = surface;
            this.f7789l.setSurface(surface);
            this.f7789l.setScreenOnWhilePlaying(true);
            a7b.f("MediaPlayerTextureView", "openVideo: calling prepareAsync");
            this.f7789l.prepareAsync();
            x();
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            a7b.f("MediaPlayerTextureView", "openVideo exception: mUri=" + this.r + " mPath=" + this.B + " " + e2.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("openVideo ex:");
            sb.append(e2.getMessage());
            a7b.c("MediaPlayerTextureView", sb.toString(), e2);
            this.F = -1;
            this.G = -1;
            this.E.onError(this.f7789l, 1, 0);
        }
    }

    private void B(boolean z) {
        MediaPlayer mediaPlayer = this.f7789l;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f7789l.clearOnSubtitleDataListener();
            this.f7789l.clearOnMediaTimeDiscontinuityListener();
            this.f7789l.reset();
            this.f7789l.release();
            this.f7789l = null;
            this.F = 0;
            if (z) {
                this.G = 0;
            }
            Surface surface = this.C;
            if (surface != null && surface.isValid()) {
                this.C.release();
            }
            this.i.abandonAudioFocus(null);
        }
    }

    private boolean y() {
        int i;
        return (this.f7789l == null || (i = this.F) == -1 || i == 0 || i == 1) ? false : true;
    }

    public float C(float f2) {
        WindowManager.LayoutParams layoutParams = this.f7788j;
        float f3 = layoutParams.screenBrightness + f2;
        layoutParams.screenBrightness = f3;
        if (f3 > 1.0f) {
            layoutParams.screenBrightness = 1.0f;
        } else if (f3 < 0.0f) {
            layoutParams.screenBrightness = 0.0f;
        }
        this.M.setAttributes(layoutParams);
        return this.f7788j.screenBrightness;
    }

    public void D(Uri uri, Map<String, String> map) {
        this.r = uri;
        this.K = map;
        this.J = 0;
        A();
        requestLayout();
        invalidate();
    }

    public final void E() {
        jr9 jr9Var = this.O;
        if (jr9Var != null) {
            if (jr9Var.isShowing()) {
                this.O.hide();
            } else {
                this.O.show();
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.p == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.p = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.p;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return this.N;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (y()) {
            return this.f7789l.getCurrentPosition();
        }
        return 0;
    }

    public float getCurrentVolume() {
        return this.u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (y()) {
            return this.f7789l.getDuration();
        }
        return -1;
    }

    public MediaPlayer getMediaPlayer() {
        return this.f7789l;
    }

    public int getProgress() {
        MediaPlayer mediaPlayer = this.f7789l;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return y() && this.f7789l.isPlaying();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (isPlaying()) {
            com.heytap.health.base.track.a.k().c(vik.TAG_MODULE_ID, 1);
            pause();
        } else {
            com.heytap.health.base.track.a.k().c(vik.TAG_MODULE_ID, 2);
            start();
        }
        jr9 jr9Var = this.O;
        if (jr9Var != null) {
            jr9Var.show();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.t;
        if (onGestureListener == null) {
            return true;
        }
        onGestureListener.onDown(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        GestureDetector.OnGestureListener onGestureListener = this.t;
        if (onGestureListener != null) {
            return onGestureListener.onFling(motionEvent, motionEvent2, f2, f3);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.t;
        if (onGestureListener != null) {
            onGestureListener.onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        GestureDetector.OnGestureListener onGestureListener = this.t;
        if (onGestureListener != null) {
            return onGestureListener.onScroll(motionEvent, motionEvent2, f2, f3);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.t;
        if (onGestureListener != null) {
            onGestureListener.onShowPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.O == null || !y()) {
            return true;
        }
        E();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.t;
        if (onGestureListener == null) {
            return true;
        }
        onGestureListener.onSingleTapUp(motionEvent);
        return true;
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.q = surfaceTexture;
        this.H = getMeasuredWidth();
        this.I = getMeasuredHeight();
        A();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.q = null;
        jr9 jr9Var = this.O;
        if (jr9Var != null) {
            jr9Var.hide();
        }
        this.f7788j.screenBrightness = this.L;
        B(true);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.H = i;
        this.I = i2;
        boolean z = this.G == 3;
        if (this.f7789l != null && z) {
            int i3 = this.J;
            if (i3 != 0) {
                seekTo(i3);
            }
            start();
        }
        v();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.t != null && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.t.onSingleTapUp(motionEvent);
        }
        return this.k.onTouchEvent(motionEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (y() && this.f7789l.isPlaying()) {
            this.f7789l.pause();
            this.F = 4;
            f fVar = this.s;
            if (fVar != null) {
                fVar.H1();
            }
            jr9 jr9Var = this.O;
            if (jr9Var != null && jr9Var.isShowing()) {
                this.O.b();
            }
        }
        this.G = 4;
    }

    public void release() {
        B(true);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        yg7.a("MediaPlayerTextureView", "seekTo", Integer.valueOf(i / 1000));
        if (!y()) {
            this.J = i;
        } else {
            this.f7789l.seekTo(i, 3);
            this.J = 0;
        }
    }

    public void setGestureListener(GestureDetector.OnGestureListener onGestureListener) {
        this.t = onGestureListener;
    }

    public void setMediaController(jr9 jr9Var) {
        jr9 jr9Var2 = this.O;
        if (jr9Var2 != null) {
            jr9Var2.hide();
        }
        this.O = jr9Var;
        x();
    }

    public void setOnMediaPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.z = onPreparedListener;
    }

    public void setVideoPath(String str) {
        a7b.f("MediaPlayerTextureView", "setVideoPath: path=" + str);
        if (str == null || str.trim().isEmpty()) {
            a7b.f("MediaPlayerTextureView", "setVideoPath: path is null or empty!");
            return;
        }
        this.B = str;
        this.G = 3;
        try {
            setVideoURI(Uri.parse(str));
        } catch (Exception e2) {
            a7b.f("MediaPlayerTextureView", "setVideoPath: failed to parse URI, " + e2.getMessage());
        }
    }

    public void setVideoState(f fVar) {
        this.s = fVar;
    }

    public void setVideoURI(Uri uri) {
        D(uri, null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (y()) {
            this.f7789l.start();
            this.F = 3;
            f fVar = this.s;
            if (fVar != null) {
                fVar.t2();
            }
            jr9 jr9Var = this.O;
            if (jr9Var != null && jr9Var.isShowing()) {
                this.O.b();
            }
        }
        this.G = 3;
    }

    public void u(float f2) {
        if (System.currentTimeMillis() - this.A > 1000) {
            this.u = (this.i.getStreamVolume(3) * 1.0f) / this.v;
        }
        this.A = System.currentTimeMillis();
        float f3 = this.u + f2;
        this.u = f3;
        float fMax = Math.max(Math.min(f3, 1.0f), 0.0f);
        this.u = fMax;
        this.i.setStreamVolume(3, (int) (this.v * fMax), 0);
    }

    public final void v() {
        if (getMediaPlayer() == null) {
            return;
        }
        this.f7790n = getMediaPlayer().getVideoWidth();
        int videoHeight = getMediaPlayer().getVideoHeight();
        this.o = videoHeight;
        w(this.f7790n, videoHeight);
    }

    public final void w(int i, int i2) {
        int i3;
        int i4;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.H = i;
        this.I = i2;
        double d2 = ((double) i2) / ((double) i);
        int i5 = (int) (((double) measuredWidth) * d2);
        if (measuredHeight > i5) {
            i4 = i5;
            i3 = measuredWidth;
        } else {
            i3 = (int) (((double) measuredHeight) / d2);
            i4 = measuredHeight;
        }
        Matrix matrix = new Matrix();
        getTransform(matrix);
        matrix.setScale(i3 / measuredWidth, i4 / measuredHeight);
        matrix.postTranslate((measuredWidth - i3) / 2, (measuredHeight - i4) / 2);
        setTransform(matrix);
    }

    public final void x() {
        jr9 jr9Var;
        if (this.f7789l == null || (jr9Var = this.O) == null) {
            return;
        }
        jr9Var.setMediaPlayer(this);
        this.O.setAnchorView(getParent() instanceof ViewGroup ? (ViewGroup) getParent() : (ViewGroup) rg7.g(this).findViewById(R.id.content));
        this.O.setEnabled(y());
    }

    public void z(boolean z) {
        jr9 jr9Var;
        if (!z || (jr9Var = this.O) == null) {
            return;
        }
        jr9Var.show();
    }

    public MediaPlayerTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaPlayerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new a();
        this.x = new b();
        this.y = new c();
        this.D = new d();
        this.E = new e();
        this.m = context;
        setSurfaceTextureListener(this);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        Window window = rg7.g(this).getWindow();
        this.M = window;
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.f7788j = attributes;
        this.L = attributes.screenBrightness;
        AudioManager audioManager = (AudioManager) this.m.getSystemService("audio");
        this.i = audioManager;
        this.v = audioManager.getStreamMaxVolume(3);
        this.F = 0;
        this.G = 0;
        GestureDetector gestureDetector = new GestureDetector(this.m, this);
        this.k = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
    }
}
