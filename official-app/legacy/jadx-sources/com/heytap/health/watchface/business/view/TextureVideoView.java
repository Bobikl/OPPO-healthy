package com.heytap.health.watchface.business.view;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.oplus.aiunit.vision.ltl;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class TextureVideoView extends TextureView implements MediaController.MediaPlayerControl {
    public MediaPlayer.OnPreparedListener A;
    public MediaPlayer.OnCompletionListener B;
    public MediaPlayer.OnInfoListener C;
    public MediaPlayer.OnErrorListener D;
    public MediaPlayer.OnBufferingUpdateListener E;
    public TextureView.SurfaceTextureListener F;
    public Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, String> f7122j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7123l;
    public Surface m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaPlayer f7124n;
    public int o;
    public int p;
    public MediaPlayer.OnCompletionListener q;
    public MediaPlayer.OnPreparedListener r;
    public int s;
    public MediaPlayer.OnErrorListener t;
    public MediaPlayer.OnInfoListener u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public MediaPlayer.OnVideoSizeChangedListener z;

    public class a implements MediaPlayer.OnVideoSizeChangedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            TextureVideoView.this.o = mediaPlayer.getVideoWidth();
            TextureVideoView.this.p = mediaPlayer.getVideoHeight();
            if (TextureVideoView.this.o == 0 || TextureVideoView.this.p == 0) {
                return;
            }
            TextureVideoView.this.getSurfaceTexture().setDefaultBufferSize(TextureVideoView.this.o, TextureVideoView.this.p);
            TextureVideoView.this.requestLayout();
        }
    }

    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            TextureVideoView.this.k = 2;
            TextureVideoView textureVideoView = TextureVideoView.this;
            textureVideoView.y = true;
            textureVideoView.x = true;
            textureVideoView.w = true;
            if (TextureVideoView.this.r != null) {
                TextureVideoView.this.r.onPrepared(TextureVideoView.this.f7124n);
            }
            TextureVideoView.this.o = mediaPlayer.getVideoWidth();
            TextureVideoView.this.p = mediaPlayer.getVideoHeight();
            int i = TextureVideoView.this.v;
            if (i != 0) {
                TextureVideoView.this.seekTo(i);
            }
            if (TextureVideoView.this.o == 0 || TextureVideoView.this.p == 0) {
                if (TextureVideoView.this.f7123l == 3) {
                    TextureVideoView.this.start();
                }
            } else {
                TextureVideoView.this.getSurfaceTexture().setDefaultBufferSize(TextureVideoView.this.o, TextureVideoView.this.p);
                if (TextureVideoView.this.f7123l == 3) {
                    TextureVideoView.this.start();
                }
            }
        }
    }

    public class c implements MediaPlayer.OnCompletionListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            TextureVideoView.this.k = 5;
            TextureVideoView.this.f7123l = 5;
            if (TextureVideoView.this.q != null) {
                TextureVideoView.this.q.onCompletion(TextureVideoView.this.f7124n);
            }
        }
    }

    public class d implements MediaPlayer.OnInfoListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (TextureVideoView.this.u == null) {
                return true;
            }
            TextureVideoView.this.u.onInfo(mediaPlayer, i, i2);
            return true;
        }
    }

    public class e implements MediaPlayer.OnErrorListener {

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (TextureVideoView.this.q != null) {
                    TextureVideoView.this.q.onCompletion(TextureVideoView.this.f7124n);
                }
            }
        }

        public e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            ltl.a("TextureVideoView", "Error: " + i + "," + i2);
            TextureVideoView.this.k = -1;
            TextureVideoView.this.f7123l = -1;
            if ((TextureVideoView.this.t == null || !TextureVideoView.this.t.onError(TextureVideoView.this.f7124n, i, i2)) && TextureVideoView.this.getWindowToken() != null) {
                new COUIAlertDialogBuilder(TextureVideoView.this.getContext()).setMessage(i == 200 ? R.string.VideoView_error_text_invalid_progressive_playback : R.string.VideoView_error_text_unknown).setPositiveButton(R.string.VideoView_error_button, new a()).setCancelable(false).show();
            }
            return true;
        }
    }

    public class f implements MediaPlayer.OnBufferingUpdateListener {
        public f() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            TextureVideoView.this.s = i;
        }
    }

    public class g implements TextureView.SurfaceTextureListener {
        public g() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TextureVideoView.this.m = new Surface(surfaceTexture);
            TextureVideoView.this.w();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (TextureVideoView.this.m != null) {
                TextureVideoView.this.m.release();
                TextureVideoView.this.m = null;
            }
            TextureVideoView.this.x(true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            boolean z = TextureVideoView.this.f7123l == 3;
            boolean z2 = i > 0 && i2 > 0;
            if (TextureVideoView.this.f7124n != null && z && z2) {
                if (TextureVideoView.this.v != 0) {
                    TextureVideoView textureVideoView = TextureVideoView.this;
                    textureVideoView.seekTo(textureVideoView.v);
                }
                TextureVideoView.this.start();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public TextureVideoView(Context context) {
        this(context, null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.y;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f7124n != null) {
            return this.s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (v()) {
            return this.f7124n.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (v()) {
            return this.f7124n.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return v() && this.f7124n.isPlaying();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("TextureVideoView");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("TextureVideoView");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == 164 || i == 82 || i == 5 || i == 6) ? false : true;
        if (v() && z) {
            if (i == 79 || i == 85) {
                if (this.f7124n.isPlaying()) {
                    pause();
                } else {
                    start();
                }
                return true;
            }
            if (i == 126) {
                if (!this.f7124n.isPlaying()) {
                    start();
                }
                return true;
            }
            if (i == 86 || i == 127) {
                if (this.f7124n.isPlaying()) {
                    pause();
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (v() && this.f7124n.isPlaying()) {
            this.f7124n.pause();
            this.k = 4;
        }
        this.f7123l = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        if (!v()) {
            this.v = i;
        } else {
            this.f7124n.seekTo(i);
            this.v = 0;
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.q = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.t = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.u = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.r = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        y(uri, null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (v()) {
            this.f7124n.start();
            this.k = 3;
        }
        this.f7123l = 3;
    }

    public final boolean v() {
        int i;
        return (this.f7124n == null || (i = this.k) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void w() {
        if (this.i == null || this.m == null) {
            return;
        }
        x(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f7124n = mediaPlayer;
            mediaPlayer.setOnPreparedListener(this.A);
            this.f7124n.setOnVideoSizeChangedListener(this.z);
            this.f7124n.setOnCompletionListener(this.B);
            this.f7124n.setOnErrorListener(this.D);
            this.f7124n.setOnInfoListener(this.C);
            this.f7124n.setOnBufferingUpdateListener(this.E);
            this.s = 0;
            this.f7124n.setDataSource(getContext().getApplicationContext(), this.i, this.f7122j);
            this.f7124n.setSurface(this.m);
            this.f7124n.setAudioStreamType(3);
            this.f7124n.setScreenOnWhilePlaying(true);
            this.f7124n.prepareAsync();
            this.k = 1;
        } catch (Exception e2) {
            ltl.i("TextureVideoView", "Unable to open content: " + this.i + " ,and exception" + e2);
            this.k = -1;
            this.f7123l = -1;
            this.D.onError(this.f7124n, 1, 0);
        }
    }

    public final void x(boolean z) {
        MediaPlayer mediaPlayer = this.f7124n;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f7124n.release();
            this.f7124n = null;
            this.k = 0;
            if (z) {
                this.f7123l = 0;
            }
        }
    }

    public void y(Uri uri, Map<String, String> map) {
        this.i = uri;
        this.f7122j = map;
        this.v = 0;
        w();
        requestLayout();
        invalidate();
    }

    public void z() {
        MediaPlayer mediaPlayer = this.f7124n;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f7124n.release();
            this.f7124n = null;
            this.k = 0;
            this.f7123l = 0;
        }
    }

    public TextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = 0;
        this.f7123l = 0;
        this.m = null;
        this.f7124n = null;
        this.z = new a();
        this.A = new b();
        this.B = new c();
        this.C = new d();
        this.D = new e();
        this.E = new f();
        g gVar = new g();
        this.F = gVar;
        this.o = 0;
        this.p = 0;
        setSurfaceTextureListener(gVar);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.k = 0;
        this.f7123l = 0;
    }
}
