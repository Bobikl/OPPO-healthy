package com.heytap.health.watchface.business.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.view.SimpleVideoView;
import com.oplus.aiunit.vision.ltl;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class SimpleVideoView extends RelativeLayout {
    public TextureView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaPlayer f7113j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7114l;
    public c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7115n;
    public Context o;
    public MediaPlayer.OnPreparedListener p;
    public MediaPlayer.OnBufferingUpdateListener q;

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ltl.d("SimpleVideoView", "onSurfaceTextureAvailable");
            SimpleVideoView.this.m(new Surface(surfaceTexture));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ltl.d("SimpleVideoView", "onSurfaceTextureDestroyed");
            SimpleVideoView.this.h();
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (SimpleVideoView.this.m != null) {
                SimpleVideoView.this.m.b();
            }
            if (SimpleVideoView.this.f7114l > 0) {
                mediaPlayer.seekTo(SimpleVideoView.this.f7114l * 1000);
                SimpleVideoView.this.f7114l = 0;
            } else if (SimpleVideoView.this.f7115n) {
                SimpleVideoView.this.n();
            }
        }
    }

    public static abstract class c {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public SimpleVideoView(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void j(MediaPlayer mediaPlayer, int i) {
        if (mediaPlayer.isPlaying() || i == 100) {
            return;
        }
        ltl.a("SimpleVideoView", "onBufferingUpdate loading:" + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(MediaPlayer mediaPlayer) {
        setKeepScreenOn(false);
        c cVar = this.m;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(MediaPlayer mediaPlayer) {
        n();
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f7113j;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition() / 1000;
    }

    public void h() {
        MediaPlayer mediaPlayer = this.f7113j;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f7113j = null;
        }
    }

    public final void i() {
        TextureView textureView = (TextureView) findViewById(R$id.tv_video_surface);
        this.i = textureView;
        textureView.setSurfaceTextureListener(new a());
    }

    public void m(Surface surface) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f7113j = mediaPlayer;
        mediaPlayer.setSurface(surface);
        if (this.f7115n) {
            o();
        }
    }

    public void n() {
        MediaPlayer mediaPlayer = this.f7113j;
        if (mediaPlayer == null) {
            ltl.i("SimpleVideoView", "play mMediaPlayer == null return ");
            return;
        }
        mediaPlayer.setOnBufferingUpdateListener(this.q);
        this.f7113j.start();
        setKeepScreenOn(true);
        c cVar = this.m;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void o() {
        ltl.a("SimpleVideoView", "startVideo ");
        if (this.f7113j == null) {
            ltl.i("SimpleVideoView", "startVideo mMediaPlayer == null return ");
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            ltl.i("SimpleVideoView", "mVideoUrl == null return ");
            return;
        }
        this.f7113j.reset();
        try {
            this.f7113j.setDataSource(this.k);
            this.f7113j.setOnPreparedListener(this.p);
            this.f7113j.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.k4h
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    this.i.k(mediaPlayer);
                }
            });
            this.f7113j.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.oplus.aiunit.vision.l4h
                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                    this.i.l(mediaPlayer);
                }
            });
            this.f7113j.prepareAsync();
        } catch (IOException e2) {
            ltl.b("SimpleVideoView", "Failed to open video" + e2);
        }
    }

    public void setAutoPlay(boolean z) {
        this.f7115n = z;
    }

    public void setOnVideoListener(c cVar) {
        this.m = cVar;
    }

    public void setVideoUrl(String str) {
        ltl.a("SimpleVideoView", "setVideoUrl " + str);
        this.k = str;
    }

    public SimpleVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7115n = true;
        this.p = new b();
        this.q = new MediaPlayer.OnBufferingUpdateListener() { // from class: com.oplus.aiunit.vision.m4h
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
                SimpleVideoView.j(mediaPlayer, i2);
            }
        };
        this.o = context;
        View.inflate(context, R$layout.watch_face_simple_video_view, this);
        i();
    }
}
