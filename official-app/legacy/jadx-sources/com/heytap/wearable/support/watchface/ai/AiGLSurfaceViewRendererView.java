package com.heytap.wearable.support.watchface.ai;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import com.heytap.wearable.support.watchface.ai.AiGLSurfaceViewRendererView;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.common.utils.AppExecutors;
import com.heytap.wearable.support.watchface.engine.gl.CustomGLSurfaceView;
import com.oplus.aiunit.vision.es;
import com.oplus.aiunit.vision.i25;
import com.oplus.aiunit.vision.kzk;
import com.oplus.smartenginehelper.entity.ClickApiEntity;

/* JADX INFO: loaded from: classes2.dex */
public class AiGLSurfaceViewRendererView extends CustomGLSurfaceView {
    public static final String AI_SHADER_TYPE_0 = "shader/ai/videoDisplay0.frag";
    public static final String AI_SHADER_TYPE_1 = "shader/ai/videoDisplay1.frag";
    public static final String AI_SHADER_TYPE_2 = "shader/ai/videoDisplay2.frag";
    public static final String AI_SHADER_TYPE_DEFAULT = "shader/videoDisplay.frag";
    public static final String AI_SHADER_TYPE_PARAM = "shader/ai/videoDisplay%d.frag";
    public es i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaPlayer f8432j;
    public Uri k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AssetFileDescriptor f8433l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f8434n;
    public boolean o;
    public kzk.a p;
    public String q;
    public String r;
    public boolean s;

    public class a implements kzk.a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.kzk.a
        public void a() {
            AiGLSurfaceViewRendererView.this.requestRender();
        }

        @Override // com.oplus.aiunit.vision.kzk.a
        public void b() {
            AiGLSurfaceViewRendererView.this.setRenderMode(0);
            AiGLSurfaceViewRendererView aiGLSurfaceViewRendererView = AiGLSurfaceViewRendererView.this;
            aiGLSurfaceViewRendererView.k = aiGLSurfaceViewRendererView.getVideoUri();
            AiGLSurfaceViewRendererView.this.i();
            AiGLSurfaceViewRendererView.this.s = true;
            i25.b("AiGLSurfaceViewRendererView", "onResourceInited");
        }

        @Override // com.oplus.aiunit.vision.kzk.a
        public void c(Canvas canvas) {
            AiGLSurfaceViewRendererView.this.o(canvas);
        }
    }

    public AiGLSurfaceViewRendererView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
        a aVar = new a();
        this.p = aVar;
        this.q = "shader/videoDisplay.vert";
        this.r = AI_SHADER_TYPE_0;
        this.s = false;
        this.f8434n = context;
        this.i = new es(context, null, aVar, "shader/videoDisplay.vert", AI_SHADER_TYPE_0);
        w();
        setEGLContextClientVersion(3);
        setRenderer(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri getVideoUri() {
        return this.k;
    }

    public static /* synthetic */ boolean k(MediaPlayer mediaPlayer, int i, int i2) {
        SdkDebugLog.e("AiGLSurfaceViewRendererView", "[onError] what=" + i + " extra=" + i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean l(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        r();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        setVideoURI(getVideoUri());
        t();
    }

    @Deprecated
    public int getPixelFormat() {
        return -3;
    }

    public es getRenderer() {
        return this.i;
    }

    public boolean h(String str) {
        es esVar = this.i;
        if (esVar != null) {
            return esVar.s(str);
        }
        return false;
    }

    public final void i() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f8432j = mediaPlayer;
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.oplus.aiunit.vision.er
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return AiGLSurfaceViewRendererView.k(mediaPlayer2, i, i2);
            }
        });
        this.f8432j.setSurface(new Surface(this.i.q()));
        this.f8432j.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.fr
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.i.q(mediaPlayer2);
            }
        });
        this.f8432j.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.gr
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.i.p(mediaPlayer2);
            }
        });
        this.f8432j.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.oplus.aiunit.vision.hr
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.i.l(mediaPlayer2, i, i2);
            }
        });
        if (this.o) {
            try {
                if (this.m) {
                    SdkDebugLog.d("AiGLSurfaceViewRendererView", "[initVideoView] uri:" + this.k);
                    this.f8432j.setDataSource(this.f8434n, this.k);
                } else {
                    SdkDebugLog.d("AiGLSurfaceViewRendererView", "[initVideoView] videoAssetFileDescriptor:" + this.f8433l);
                    this.f8432j.setDataSource(this.f8433l.getFileDescriptor(), this.f8433l.getStartOffset(), this.f8433l.getLength());
                }
                this.f8432j.prepareAsync();
            } catch (Exception e2) {
                SdkDebugLog.e("AiGLSurfaceViewRendererView", "[initVideoView] occurred exception:" + e2.getMessage());
            }
        }
    }

    public boolean j() {
        MediaPlayer mediaPlayer = this.f8432j;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public boolean n() {
        return true;
    }

    public void o(Canvas canvas) {
    }

    public void p(MediaPlayer mediaPlayer) {
    }

    public void q(MediaPlayer mediaPlayer) {
        try {
            SdkDebugLog.d("AiGLSurfaceViewRendererView", "[onPrepared] start play");
            mediaPlayer.setScreenOnWhilePlaying(false);
            mediaPlayer.setLooping(n());
            mediaPlayer.start();
        } catch (Exception e2) {
            SdkDebugLog.e("AiGLSurfaceViewRendererView", "[onPrepared] occurred exception:" + e2.getMessage());
        }
    }

    public void r() {
    }

    public void s() {
        SdkDebugLog.d("AiGLSurfaceViewRendererView", ClickApiEntity.PAUSE_VIDEO);
        try {
            if (this.f8432j != null && j()) {
                this.f8432j.pause();
            }
        } catch (Exception e2) {
            SdkDebugLog.e("AiGLSurfaceViewRendererView", "[pauseVideo] occurred exception:" + e2.getMessage());
        }
    }

    public void setVideoAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            SdkDebugLog.d("AiGLSurfaceViewRendererView", "[setVideoAssetFileDescriptor] assetFileDescriptor is null");
            return;
        }
        this.m = false;
        AssetFileDescriptor assetFileDescriptor2 = this.f8433l;
        if (assetFileDescriptor2 == null || !assetFileDescriptor2.equals(assetFileDescriptor)) {
            this.f8433l = assetFileDescriptor;
            if (this.s) {
                try {
                    SdkDebugLog.d("AiGLSurfaceViewRendererView", "[setVideoAssetFileDescriptor] videoAssetFileDescriptor:" + this.f8433l);
                    this.f8432j.reset();
                    this.f8432j.setDataSource(this.f8433l.getFileDescriptor(), this.f8433l.getStartOffset(), this.f8433l.getLength());
                    this.f8432j.prepareAsync();
                } catch (Exception e2) {
                    SdkDebugLog.e("AiGLSurfaceViewRendererView", "[setVideoPath] occurred exception:" + e2.getMessage());
                }
            }
            this.o = true;
        }
    }

    public void setVideoURI(Uri uri) {
        this.m = true;
        Uri uri2 = this.k;
        if (uri2 == null || !uri2.equals(uri)) {
            this.k = uri;
            if (this.s) {
                try {
                    SdkDebugLog.d("AiGLSurfaceViewRendererView", "[setVideoURI] uri:" + this.k);
                    this.f8432j.reset();
                    this.f8432j.setDataSource(this.f8434n, this.k);
                    this.f8432j.prepareAsync();
                } catch (Exception e2) {
                    SdkDebugLog.e("AiGLSurfaceViewRendererView", "[setVideoURI] occurred exception:" + e2.getMessage());
                }
            }
            this.o = true;
        }
    }

    public void t() {
        SdkDebugLog.d("AiGLSurfaceViewRendererView", ClickApiEntity.PLAY_VIDEO);
        try {
            if (this.f8432j == null || j()) {
                return;
            }
            this.f8432j.start();
        } catch (Exception e2) {
            SdkDebugLog.e("AiGLSurfaceViewRendererView", "[playVideo] occurred exception:" + e2.getMessage());
        }
    }

    public void u(boolean z) {
        if (!this.o) {
            AppExecutors.getInstance().mainThread().execute(new Runnable() { // from class: com.oplus.aiunit.vision.ir
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.m();
                }
            });
            return;
        }
        if (z) {
            v(0);
        }
        t();
    }

    public void v(int i) {
        try {
            MediaPlayer mediaPlayer = this.f8432j;
            if (mediaPlayer == null) {
                return;
            }
            mediaPlayer.seekTo(i);
        } catch (Exception e2) {
            SdkDebugLog.e("AiGLSurfaceViewRendererView", "[seekTo] occurred exception:" + e2.getMessage());
        }
    }

    public void w() {
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
    }

    public void x() {
        MediaPlayer mediaPlayer;
        SdkDebugLog.d("AiGLSurfaceViewRendererView", "stopVideo");
        try {
            if (this.k == null || (mediaPlayer = this.f8432j) == null) {
                return;
            }
            this.k = null;
            mediaPlayer.stop();
            this.f8432j.release();
        } catch (Exception e2) {
            SdkDebugLog.e("AiGLSurfaceViewRendererView", "[stopVideo] occurred exception:" + e2.getMessage());
        }
    }
}
