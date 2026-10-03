package com.oplus.aiunit.vision;

import android.os.Handler;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.tencent.qgame.animplayer.Decoder;
import com.tencent.qgame.animplayer.HardDecoder;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010a\u001a\u00020^¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00102\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R*\u00105\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\"\u0010<\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010A\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00107\u001a\u0004\b6\u00109\"\u0004\b@\u0010;R\"\u0010E\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\"\u0010H\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\bF\u00109\"\u0004\bG\u0010;R\"\u0010I\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R$\u0010Q\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00107\u001a\u0004\bR\u00109\"\u0004\bS\u0010;R\"\u0010T\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\bT\u00109\"\u0004\bU\u0010;R\u0017\u0010Y\u001a\u00020V8\u0006¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\b)\u0010XR\u0017\u0010]\u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b\u0007\u0010[\u001a\u0004\bB\u0010\\R\u0017\u0010a\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b\f\u0010_\u001a\u0004\b!\u0010`¨\u0006e"}, d2 = {"Lcom/oplus/aiunit/vision/a40;", "", "Lcom/oplus/aiunit/vision/eq9;", "fileContainer", "", LogFieldKey.MESSAGE_KEY, "s", "q", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, LogFieldKey.PROCESS_NAME_KEY, "r", "C", "D", "", "o", "Lcom/oplus/aiunit/vision/yl9;", "a", "Lcom/oplus/aiunit/vision/yl9;", "b", "()Lcom/oplus/aiunit/vision/yl9;", "t", "(Lcom/oplus/aiunit/vision/yl9;)V", "animListener", "Lcom/tencent/qgame/animplayer/Decoder;", "Lcom/tencent/qgame/animplayer/Decoder;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/tencent/qgame/animplayer/Decoder;", "setDecoder", "(Lcom/tencent/qgame/animplayer/Decoder;)V", "decoder", "Lcom/oplus/aiunit/vision/yk0;", "c", "Lcom/oplus/aiunit/vision/yk0;", "getAudioPlayer", "()Lcom/oplus/aiunit/vision/yk0;", "setAudioPlayer", "(Lcom/oplus/aiunit/vision/yk0;)V", "audioPlayer", "value", "d", "I", "getFps", "()I", "x", "(I)V", "fps", "f", "u", "defaultFps", "i", "z", "playLoop", b2n.f, "Z", MapSchema.FIELD_NAME_KEY, "()Z", "setSupportMaskBoolean", "(Z)V", "supportMaskBoolean", b2n.g, "setMaskEdgeBlurBoolean", "maskEdgeBlurBoolean", "w", "enableVersion1", "j", LogFieldKey.LEVEL_KEY, c8l.KEY_B, "videoMode", "n", "v", "isDetachedFromWindow", "isSurfaceAvailable", "setSurfaceAvailable", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getStartRunnable", "()Ljava/lang/Runnable;", "setStartRunnable", "(Ljava/lang/Runnable;)V", "startRunnable", "isStartRunning", "A", "isMute", "y", "Lcom/oplus/aiunit/vision/w30;", "Lcom/oplus/aiunit/vision/w30;", "()Lcom/oplus/aiunit/vision/w30;", "configManager", "Lcom/oplus/aiunit/vision/b40;", "Lcom/oplus/aiunit/vision/b40;", "()Lcom/oplus/aiunit/vision/b40;", "pluginManager", "Lcom/oplus/aiunit/vision/am9;", "Lcom/oplus/aiunit/vision/am9;", "()Lcom/oplus/aiunit/vision/am9;", "animView", "<init>", "(Lcom/oplus/aiunit/vision/am9;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class a40 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public yl9 animListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Decoder decoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public yk0 audioPlayer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int fps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int defaultFps;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int playLoop;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean supportMaskBoolean;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean maskEdgeBlurBoolean;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean enableVersion1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int videoMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isDetachedFromWindow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isSurfaceAvailable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Runnable startRunnable;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isStartRunning;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean isMute;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final w30 configManager;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final b40 pluginManager;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final am9 animView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/tencent/qgame/animplayer/AnimPlayer$innerStartPlay$1$1"}, k = 3, mv = {1, 1, 15})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eq9 f9184j;

        public b(eq9 eq9Var) {
            this.f9184j = eq9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a40.this.m(this.f9184j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eq9 f9185j;

        public c(eq9 eq9Var) {
            this.f9185j = eq9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            yl9 animListener;
            int iE = a40.this.getConfigManager().e(this.f9185j, a40.this.getEnableVersion1(), a40.this.getVideoMode(), a40.this.getDefaultFps());
            if (iE != 0) {
                a40.this.A(false);
                Decoder decoder = a40.this.getDecoder();
                if (decoder != null) {
                    decoder.onFailed(iE, e04.b(e04.INSTANCE, iE, null, 2, null));
                }
                Decoder decoder2 = a40.this.getDecoder();
                if (decoder2 != null) {
                    decoder2.d();
                    return;
                }
                return;
            }
            q0 q0Var = q0.INSTANCE;
            q0Var.d("AnimPlayer.AnimPlayer", "parse " + a40.this.getConfigManager().getConfig());
            AnimConfig animConfigB = a40.this.getConfigManager().getConfig();
            if (animConfigB == null || (!animConfigB.getIsDefaultConfig() && ((animListener = a40.this.getAnimListener()) == null || !animListener.a(animConfigB)))) {
                q0Var.d("AnimPlayer.AnimPlayer", "onVideoConfigReady return false");
            } else {
                a40.this.m(this.f9185j);
            }
        }
    }

    public a40(@NotNull am9 animView) {
        Intrinsics.checkParameterIsNotNull(animView, "animView");
        this.animView = animView;
        this.videoMode = 1;
        this.configManager = new w30(this);
        this.pluginManager = new b40(this);
    }

    public final void A(boolean z) {
        this.isStartRunning = z;
    }

    public final void B(int i) {
        this.videoMode = i;
    }

    public final void C(@NotNull eq9 fileContainer) {
        HandlerHolder handlerHolderL;
        Handler handler;
        Intrinsics.checkParameterIsNotNull(fileContainer, "fileContainer");
        this.isStartRunning = true;
        s();
        Decoder decoder = this.decoder;
        if (decoder == null || decoder.s()) {
            Decoder decoder2 = this.decoder;
            if (decoder2 == null || (handlerHolderL = decoder2.getRenderThread()) == null || (handler = handlerHolderL.getHandler()) == null) {
                return;
            }
            handler.post(new c(fileContainer));
            return;
        }
        this.isStartRunning = false;
        Decoder decoder3 = this.decoder;
        if (decoder3 != null) {
            decoder3.onFailed(10003, e04.ERROR_MSG_CREATE_THREAD);
        }
        Decoder decoder4 = this.decoder;
        if (decoder4 != null) {
            decoder4.d();
        }
    }

    public final void D() {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.z();
        }
        yk0 yk0Var = this.audioPlayer;
        if (yk0Var != null) {
            yk0Var.k();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final yl9 getAnimListener() {
        return this.animListener;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final am9 getAnimView() {
        return this.animView;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final w30 getConfigManager() {
        return this.configManager;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Decoder getDecoder() {
        return this.decoder;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDefaultFps() {
        return this.defaultFps;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnableVersion1() {
        return this.enableVersion1;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getMaskEdgeBlurBoolean() {
        return this.maskEdgeBlurBoolean;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPlayLoop() {
        return this.playLoop;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final b40 getPluginManager() {
        return this.pluginManager;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSupportMaskBoolean() {
        return this.supportMaskBoolean;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getVideoMode() {
        return this.videoMode;
    }

    public final void m(eq9 fileContainer) {
        yk0 yk0Var;
        synchronized (a40.class) {
            if (this.isSurfaceAvailable) {
                this.isStartRunning = false;
                Decoder decoder = this.decoder;
                if (decoder != null) {
                    decoder.y(fileContainer);
                }
                if (!this.isMute && (yk0Var = this.audioPlayer) != null) {
                    yk0Var.i(fileContainer);
                }
            } else {
                this.startRunnable = new b(fileContainer);
                this.animView.a();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsDetachedFromWindow() {
        return this.isDetachedFromWindow;
    }

    public final boolean o() {
        if (!this.isStartRunning) {
            Decoder decoder = this.decoder;
            if (!(decoder != null ? decoder.getIsRunning() : false)) {
                return false;
            }
        }
        return true;
    }

    public final void p(int width, int height) {
        this.isSurfaceAvailable = true;
        Runnable runnable = this.startRunnable;
        if (runnable != null) {
            runnable.run();
        }
        this.startRunnable = null;
    }

    public final void q() {
        this.isSurfaceAvailable = false;
        this.isStartRunning = false;
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.f();
        }
        yk0 yk0Var = this.audioPlayer;
        if (yk0Var != null) {
            yk0Var.c();
        }
    }

    public final void r(int width, int height) {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.p(width, height);
        }
    }

    public final void s() {
        if (this.decoder == null) {
            HardDecoder hardDecoder = new HardDecoder(this);
            hardDecoder.u(this.playLoop);
            hardDecoder.t(this.fps);
            this.decoder = hardDecoder;
        }
        if (this.audioPlayer == null) {
            yk0 yk0Var = new yk0(this);
            yk0Var.h(this.playLoop);
            this.audioPlayer = yk0Var;
        }
    }

    public final void t(@Nullable yl9 yl9Var) {
        this.animListener = yl9Var;
    }

    public final void u(int i) {
        this.defaultFps = i;
    }

    public final void v(boolean z) {
        this.isDetachedFromWindow = z;
    }

    public final void w(boolean z) {
        this.enableVersion1 = z;
    }

    public final void x(int i) {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.t(i);
        }
        this.fps = i;
    }

    public final void y(boolean z) {
        this.isMute = z;
    }

    public final void z(int i) {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.u(i);
        }
        yk0 yk0Var = this.audioPlayer;
        if (yk0Var != null) {
            yk0Var.h(i);
        }
        this.playLoop = i;
    }
}
